package util;

import array_list.ListNode;
import binary_tree.TreeNode;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.testng.Assert.*;
import static org.testng.Assert.assertEquals;
import static util.PrinterUtil.printError;

public class CompareUtil {

    private CompareUtil() {
    }

    public static void assertIntArray(int[] actual, int[] expected) {
        Arrays.sort(actual);
        Arrays.sort(expected);
        assertSortedIntArray(actual, expected);
    }

    public static void assertSortedIntArray(int[] actual, int[] expected) {
        try {
            assertEquals(actual.length, expected.length, "Arrays have different length");
            for (int i = 0; i < actual.length; i++) {
                assertEquals(actual[i], expected[i], "Arrays are not equal");
            }
        } catch (AssertionError error) {
            printError(actual, expected, error);
        }
    }

    public static void assertSortedArray(Object[] actual, Object[] expected) {
        try {
            assertEquals(actual.length, expected.length, "Arrays have different length");
            for (int i = 0; i < actual.length; i++) {
                assertEquals(actual[i], expected[i], "Arrays are not equal");
            }
        } catch (AssertionError error) {
            printError(actual, expected, error);
        }
    }

    public static void assertSortedCharArray(char[] actual, char[] expected) {
        try {
            assertEquals(actual.length, expected.length, "Arrays have different length");
            for (int i = 0; i < actual.length; i++) {
                assertEquals(actual[i], expected[i], "Arrays are not equal");
            }
        } catch (AssertionError error) {
            printError(actual, expected, error);
        }
    }

    public static void assertList(List actual, List expected) {
        Collections.sort(actual);
        Collections.sort(expected);
        assertSortedList(actual, expected);
    }

    public static void assertSortedList(List actual, List expected) {
        try {
            assertEquals(actual.size(), expected.size(), "Lists have different length");
            for (int i = 0; i < actual.size(); i++) {
                assertEquals(actual.get(i), expected.get(i), "Lists are not equal");
            }
        } catch (AssertionError error) {
            printError(actual, expected, error);
        }
    }

    public static void assertIntMatrix(int[][] actual, int[][] expected) {
        try {
            assertEquals(actual.length, expected.length, "Matrix have different length");
            for (int i = 0; i < actual.length; i++) {
                assertSortedIntArray(actual[i], expected[i]);
            }
        } catch (AssertionError error) {
//            printError(actual, expected, error);
            throw error;
        }
    }

    public static void assertTree(TreeNode actual, TreeNode expected) {
        assertEquals(TreeNode.toString(actual), TreeNode.toString(expected));
    }
    public static void assertListNode(ListNode actual, ListNode expected) {
        try {
            ListNode copyActual = actual;
            ListNode copyExpected = expected;
            while (copyActual != null && copyExpected != null) {
                assertEquals(copyActual.val, copyExpected.val);
                copyActual = copyActual.next;
                copyExpected = copyExpected.next;
            }
            assertTrue(copyActual == null && copyExpected == null);
        } catch (AssertionError error) {
            printError(actual, expected, error);
            throw error;
        }
    }
}
