package util;

import java.util.List;

public class PrinterUtil {

    public static void printIntMatrix(int[][] m) {
        for (int[] arr : m) {
            printIntArray(arr);
        }
    }

    public static void printIntArray(int[] arr) {
        for (int i : arr) {
            System.out.print(i + "  ");
        }
        System.out.println();
    }

    public static void printCharArray(char[] arr) {
        for (char i : arr) {
            System.out.print(i + "  ");
        }
        System.out.println();
    }

    public static void printList(List arr) {
        for (Object o : arr) {
            System.out.print(o + "  ");
        }
        System.out.println();
    }

    public static void printError(Object actual, Object expected, AssertionError e) {
        String className = actual.getClass().getName();
        switch (className) {
            case "[I" :
                System.out.println("---ACTUAL---");
                printIntArray((int[])actual);
                System.out.println("---EXPECTED---");
                printIntArray((int[])expected);
                break;
            case "[C" :
                System.out.println("---ACTUAL---");
                printCharArray((char[])actual);
                System.out.println("---EXPECTED---");
                printCharArray((char[])expected);
                break;
            case "[[I":
                System.out.println("---ACTUAL---");
                printIntMatrix((int[][])actual);
                System.out.println("---EXPECTED---");
                printIntMatrix((int[][])expected);
                break;
            default:
                System.out.println("---ACTUAL---");
                printList((List)actual);
                System.out.println("---EXPECTED---");
                printList((List)expected);
                break;
        }
        throw e;
    }



}
