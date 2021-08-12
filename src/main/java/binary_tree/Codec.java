package binary_tree;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;

public class Codec {

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        if (root == null) return "";
        int lengthOfOutput = 0;
        StringBuilder values = new StringBuilder();
        int ind = 0;
        Queue<TreeNode> queue = new ArrayDeque<>();
        queue.add(root);
        int realElementsInQueue = 1;
        while (realElementsInQueue > 0) {
            TreeNode node = queue.poll();
            if (node != null && !node.getClass().equals(EmptyNode.class)) {
                realElementsInQueue--;
                while (ind > lengthOfOutput){
                    values.append("null,");
                    lengthOfOutput++;
                }
                values.append(node.val).append(",");
                lengthOfOutput++;

                if (node.left == null) queue.add(new EmptyNode());
                else {
                    queue.add(node.left);
                    realElementsInQueue++;
                }
                if (node.right == null) queue.add(new EmptyNode());
                else {
                    queue.add(node.right);
                    realElementsInQueue++;
                }
            }
            ind++;
        }

        values.replace(values.lastIndexOf(","), values.length(), "");
        String toCutOff = ",null";
        while (values.lastIndexOf(toCutOff) != -1 && values.lastIndexOf(toCutOff) == values.length() - toCutOff.length()) {
            values.replace(values.lastIndexOf(toCutOff), values.length(), "");
        }
        return values.toString();
    }


    public int maxDepth(TreeNode root, int depth) {
        if (root == null) return depth;
        depth++;
        int leftDepth = maxDepth(root.left, depth);
        int rightDepth = maxDepth(root.right, depth);
        return Math.max(leftDepth, rightDepth);
    }


    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        if (data == null || data.length() == 0) return null;
        String[] values = data.split(",");
        int index = 0;

        //init root
        Integer nextVal = parseValue(values, index++);
        TreeNode root = new TreeNode(nextVal);

        //init queue
        Queue<TreeNode> prev = new ArrayDeque<>();
        prev.add(root);
        while (index < values.length) {
            Queue<TreeNode> cur = new ArrayDeque<>();
            //iterate by layers
            while (!prev.isEmpty()) {
                TreeNode node = prev.poll();
                //deserialize left
                TreeNode left;
                nextVal = parseValue(values, index++);
                if (nextVal != null) {
                    left = new TreeNode(nextVal);
                    node.left = left;
                    cur.add(left);
                }

                //deserialize right
                TreeNode right;
                nextVal = parseValue(values, index++);
                if (nextVal != null) {
                    right = new TreeNode(nextVal);
                    node.right = right;
                    cur.add(right);
                }
            }
            prev = cur;
        }
        return root;
    }

    private Integer parseValue(String[] values, int valuesInd) {
        if (valuesInd >= values.length || "null".equals(values[valuesInd])) return null;
        return Integer.parseInt(values[valuesInd]);
    }

    private static class EmptyNode extends TreeNode {
    }
}
