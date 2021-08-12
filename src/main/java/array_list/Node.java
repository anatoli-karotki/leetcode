package array_list;

public class Node {
    public int val;
    public Node random;
    public Node next;

    public Node() {
    }

    public Node(int val) {
        this.val = val;
    }

    public Node(int val, Node next, Node random) {
        this.val = val;
        this.random = random;
        this.next = next;
    }

    public Node(int val, Node next) {
        this.val = val;
        this.next = next;
    }

    public static Node get10() {
        Node n1 = new Node(6);
        Node n2 = new Node(5, n1);
        Node n3 = new Node(4, n2);
        Node n4 = new Node(3, n3, n1);
        Node n5 = new Node(2, n4, n4);
        Node n6 = new Node(1, n5);
        return n6;
    }

    public static Node get11() {
        Node n1 = new Node(10);
        Node n2 = new Node(9, n1);
        Node n3 = new Node(8, n2);
        Node n4 = new Node(7, n3);
        return n4;
    }

    public static Node get12() {
        Node n1 = new Node(12);
        Node n2 = new Node(11, n1);
        return n2;
    }

    public static Node get20() {
        Node n1 = new Node(6);
        Node n2 = new Node(5, n1);
        Node n3 = new Node(4, n2);
        Node n4 = new Node(10, n3);
        Node n5 = new Node(9, n4);
        Node n6 = new Node(12, n5);
        Node n7 = new Node(11, n6);
        Node n8 = new Node(8, n7);
        Node n9 = new Node(7, n8);
        Node n10 = new Node(3, n9);
        Node n11 = new Node(2, n10);
        Node n12 = new Node(1, n11);
        return n12;
    }
}
