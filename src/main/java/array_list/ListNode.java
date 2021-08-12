package array_list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ListNode {
    public int val;
    public ListNode next;

    public static ListNode parse(String s) {
        String[] numbers = s.split(",");
        int[] arr = new int[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            arr[i] = Integer.parseInt(numbers[i].trim());
        }
        return parse(arr);
    }

    public static ListNode parse(int[] arr) {
        ListNode head = new ListNode(arr[0]);
        ListNode prev = head;
        for (int i = 1; i < arr.length; i++) {
            ListNode node = new ListNode(arr[i]);
            prev.next = node;
            prev = node;
        }
        return head;
    }

    public static List<Integer> toList(ListNode node) {
        List<Integer> list = new ArrayList<>();
        while (node != null) {
            list.add(node.val);
            node = node.next;
        }
        return list;
    }


    public ListNode() {
    }

    public ListNode(int val) {
        this.val = val;
    }

    public ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

}
