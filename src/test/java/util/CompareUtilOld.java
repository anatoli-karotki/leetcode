package util;

import array_list.ListNode;
import array_list.Node;
import binary_tree.TreeNode;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.testng.Assert.*;
import static util.CompareUtil.assertSortedIntArray;
import static util.CompareUtil.assertSortedList;

public class CompareUtilOld {

    private CompareUtilOld() {
    }





    public static void toDimensionalSortedList(List<List<Integer>> actual, List<List<Integer>> expected) {
        assertEquals(actual.size(), expected.size(), "Lists have different length");
        for (int i = 0; i < actual.size(); i++) {
            assertSortedList(actual.get(i), Arrays.asList(expected.get(i)));
        }
    }

    public static void toDimensionalSortedArray(List<List<Integer>> actual, Object[][] expected) {
        assertEquals(actual.size(), expected.length, "Lists have different length");
        for (int i = 0; i < actual.size(); i++) {
            assertSortedList(actual.get(i), Arrays.asList(expected[i]));
        }
    }

    public static void assertListNodes(ListNode actual, ListNode expected) {
        ListNode initialActual = actual;
        ListNode initialExpected = expected;
        try {
            if (actual == null) assertNull(expected);
            while (actual != null) {
                assertNotNull(expected, "Node is null, have to be " + actual.val);
                assertEquals(actual.val, expected.val);
                actual = actual.next;
                expected = expected.next;
            }
            assertNull(expected);
        } catch (AssertionError error) {
            System.out.print("Expected:\t");
            while (initialExpected != null) {
                System.out.print(initialExpected.val + " -> ");
                initialExpected = initialExpected.next;
            }
            System.out.println();
            System.out.print("Actual:\t\t");
            while (initialActual != null) {
                System.out.print(initialActual.val + " -> ");
                initialActual = initialActual.next;
            }
            throw error;
        }
    }

    public static void assertNodes(Node actual, Node expected) {
        if (actual == null) assertNull(expected);
        while (actual != null) {
            assertNotNull(expected, "Node is null, have to be " + actual.val);
            assertEquals(actual.val, expected.val);
            actual = actual.next;
            expected = expected.next;
        }
        assertNull(expected);
    }

    public static void assertTreeNode(TreeNode actual, TreeNode expected) {
        if (actual == null) assertNull(expected);
        else {
            assertEquals(actual.val, expected.val);
            assertTreeNode(actual.left, expected.left);
            assertTreeNode(actual.right, expected.right);
        }
    }

}
