package design;

import binary_tree.TreeNode;

import java.util.Stack;

public class BSTIterator {
    Stack<Integer> stack;

    public BSTIterator(TreeNode root) {
        stack = new Stack<>();
        convert(root);
    }

    private void convert(TreeNode node) {
        if (node == null) return;
        convert(node.right);
        stack.add(node.val);
        convert(node.left);
    }

    public int next() {
        return stack.pop();
    }

    public boolean hasNext() {
        return !stack.isEmpty();
    }
}