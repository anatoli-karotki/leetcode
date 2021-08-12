package queue_stack;

import java.util.ArrayDeque;
import java.util.Queue;

public class MyStack {

    Queue<Integer> tail;
    Queue<Integer> top;
    int size = 0;

    /**
     * Initialize your data structure here.
     */
    public MyStack() {
        tail = new ArrayDeque<>();
        top = new ArrayDeque<>();
    }

    /**
     * Push element x onto stack.
     */
    public void push(int x) {
        tail.add(x);
        size++;
    }

    /**
     * Removes the element on top of the stack and returns that element.
     */
    public int pop() {
        reorder();
        size--;
        return tail.poll();
    }

    /**
     * Get the top element.
     */
    public int top() {
        int i = this.pop();
        this.push(i);
        return i;
    }

    private void reorder() {
        int repeat = size - 1;
        while (repeat > 0) {
            tail.add(tail.poll());
            repeat--;
        }
    }

    /**
     * Returns whether the stack is empty.
     */
    public boolean empty() {
        return size == 0;
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */