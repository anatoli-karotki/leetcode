package binary_tree;

public class Node extends TreeNode{
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }

    public static Node get11() {
        Node l41 = new Node(8);
        Node l42 = new Node(9);
        Node l43 = new Node(10);
        Node l44 = new Node(11);
        Node l45 = new Node(12);
        Node l46 = new Node(13);
        Node l47 = new Node(14);
        Node l48 = new Node(15);
        Node l31 = new Node(4, l41, l42, null);
        Node l32 = new Node(5, l43, l44, null);
        Node l33 = new Node(6, l45, l46, null);
        Node l34 = new Node(7, l47, l48, null);
        Node l21 = new Node(2, l31, l32, null);
        Node l22 = new Node(3, null, l34, null);
        Node head = new Node(1, l21, l22, null);
        return head;
    }
};
