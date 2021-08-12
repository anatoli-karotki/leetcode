package design;

import java.util.Map;
import java.util.Queue;
import java.util.Set;

public class MyCircularDeque {

    private int[] data;
    int frontPointer = 0;
    int backPointer = 0;
    int size = 0;

    /** Initialize your data structure here. Set the size of the deque to be k. */
    public MyCircularDeque(int k) {
        data = new int[k];
    }

    /** Adds an item at the front of Deque. Return true if the operation is successful. */
    public boolean insertFront(int value) {
        if (isFull()) return false;
        if (isEmpty()) {
            data[frontPointer] = value;
            size++;
            return true;
        }
        frontPointer = pointerToFront(frontPointer);
        data[frontPointer] = value;
        size++;
        return true;
    }

    private int pointerToFront(int ind) {
        ind++;
        if (ind == data.length) ind = 0;
        return ind;
    }

    /** Adds an item at the rear of Deque. Return true if the operation is successful. */
    public boolean insertLast(int value) {
        if (isFull()) return false;
        if (isEmpty()) {
            data[backPointer] = value;
            size++;
            return true;
        }
        backPointer = pointerToBack(backPointer);
        data[backPointer] = value;
        size++;
        return true;
    }

    private int pointerToBack(int ind) {
        if (ind == 0) ind = data.length - 1;
        else ind--;
        return ind;
    }

    /** Deletes an item from the front of Deque. Return true if the operation is successful. */
    public boolean deleteFront() {
        if (isEmpty()) return false;
        size--;
        frontPointer = pointerToBack(frontPointer);
        if (isEmpty()){
            frontPointer = 0;
            backPointer = 0;
        }
        return true;
    }

    /** Deletes an item from the rear of Deque. Return true if the operation is successful. */
    public boolean deleteLast() {
        if (isEmpty()) return false;
        backPointer = pointerToFront(backPointer);
        size--;
        if (isEmpty()){
            frontPointer = 0;
            backPointer = 0;
        }
        return true;
    }

    /** Get the front item from the deque. */
    public int getFront() {
        if (isEmpty()) return -1;
        return data[frontPointer];
    }

    /** Get the last item from the deque. */
    public int getRear() {
        if (isEmpty()) return -1;
        return data[backPointer];
    }

    /** Checks whether the circular deque is empty or not. */
    public boolean isEmpty() {
        return size == 0;
    }

    /** Checks whether the circular deque is full or not. */
    public boolean isFull() {
        return size == data.length;
    }
}
