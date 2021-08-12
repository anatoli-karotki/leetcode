package binary_tree;


import java.util.Arrays;
import java.util.List;

public class TreeUtil {

    private TreeUtil() {
    }

    public static TreeNode arrayToTreeNode(Integer[] arr) {
        TreeNode root = new TreeNode(arr[0]);
        TreeNode currentNode = root.left;
        for (int i = 1; i < arr.length; i++) {
            if (currentNode == null) {
                currentNode = new TreeNode(i);

            }
        }
        TreeNode node = new TreeNode(0);
        return node;
    }

    public static void main(String[] args) {
        Integer[] integers = new Integer[]{1, 2, 3, 4, 5, 6};
        TreeNode treeNode = arrayToTreeNode(integers);
        System.out.println();

    }


}
