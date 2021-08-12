
import array_list.ListNode;
import binary_tree.Codec;
import binary_tree.TreeNode;
import design.*;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import queue_stack.MinStack;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

import static org.testng.Assert.*;
import static util.CompareUtil.*;

public class SolutionTest {


    private Solution solution = new Solution();

    @DataProvider(name = "data")
    public static Object[][] data() {
        return new Object[][]{
                {0, new int[]{5}, 10},
        };
    }


    @Test(dataProvider = "data")
    public void test(int expected, int[] rungs, int dist) {
        List list = new ArrayList();
        Queue queue = new ArrayDeque();

//        int actual = solution.addRungs(rungs, dist);
//
//        assertEquals(actual, expected, "Test failed");
//        assertTree(actual, expected);
//        assertListNode(actual, expected);
//        assertIntArray(actual, expected);
//        assertSortedIntArray(actual, expected);
//        assertIntMatrix(actual, expected);
//        assertList(actual, expected);
//        assertSortedList(actual, expected);
//        assertIntMatrix(actual, expected);

        MapSum mapSum = new MapSum();
        mapSum.insert("apple", 3);
        assertEquals(mapSum.sum("ap"), 3, "Test 1");
        mapSum.insert("app", 2);
        assertEquals(mapSum.sum("ap"), 5, "Test 2");

        mapSum = new MapSum();
        mapSum.insert("a", 3);
        assertEquals(mapSum.sum("ap"), 0, "Test 3");
        mapSum.insert("b", 2);
        assertEquals(mapSum.sum("a"), 3, "Test 4");

        mapSum = new MapSum();
        mapSum.insert("apple", 3);
        assertEquals(mapSum.sum("ap"), 3, "Test 5");
        mapSum.insert("app", 2);
        mapSum.insert("apple", 2);
        assertEquals(mapSum.sum("ap"), 4, "Test 6");
    }

    private static int[] getArr(String fileName, int limit) {
        File file = new File(fileName);
        int[] arr = new int[limit];
        try {
            int i = 0;
            Scanner scanner = new Scanner(file);
            while (scanner.hasNext()) {
                arr[i++] = scanner.nextInt();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return arr;
    }


}
