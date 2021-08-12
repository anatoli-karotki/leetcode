package queue_stack;

import java.util.Arrays;

public class MinStack {

    private int[] values = new int[16];
    private int start = -1;
    private int min = Integer.MAX_VALUE;

    /** initialize your data structure here. */
    public MinStack() {
    }

    public void push(int x) {
        min = Math.min(x, min);
        getNext();
        values[start] = x;
    }

    private void getNext() {
        if (start + 1 == values.length){
            values = Arrays.copyOf(values, values.length * 2);
        }
        start++;
    }

    public void pop() {
        if (values[start] == min) calculateMin();
        start--;
    }

    public int top() {
        return values[start];
    }

    public void calculateMin() {
        min = Integer.MAX_VALUE;
        for (int i = 0; i < start; i++) {
            min = Math.min(min, values[i]);
        }
    }

    public int getMin() {
        return min;
    }
}
