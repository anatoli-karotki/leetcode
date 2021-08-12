package binary_tree;

public class TreeNode{
    public int val;
    public TreeNode left;
    public TreeNode right;

    public static TreeNode parse(String s) {
        Codec codec = new Codec();
        return codec.deserialize(s);
    }

    public static String toString(TreeNode root) {
        Codec codec = new Codec();
        return codec.serialize(root);
    }

    public TreeNode(int x) {
        val = x;
    }

    public TreeNode() {
    }

    public TreeNode(Integer val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

