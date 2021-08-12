package design;

import java.util.Stack;

public class MyQueue {
    private Stack<Integer> storage;
    private Stack<Integer> tmp;

    /** Initialize your data structure here. */
    public MyQueue() {
        storage = new Stack<>();
        tmp = new Stack<>();
    }

    /** Push element x to the back of queue. */
    public void push(int x) {
        while (!storage.empty()){
            tmp.push(storage.pop());
        }
        tmp.push(x);
        while (!tmp.empty()){
            storage.push(tmp.pop());
        }
    }

    /** Removes the element from in front of queue and returns that element. */
    public int pop() {
        return storage.pop();
    }

    /** Get the front element. */
    public int peek() {
        return storage.peek();
    }

    /** Returns whether the queue is empty. */
    public boolean empty() {
        return storage.empty();
    }
}
