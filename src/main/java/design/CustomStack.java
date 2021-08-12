package design;

public class CustomStack {
    private final int[] data;
    private int pointer = -1;

    public CustomStack(int maxSize) {
        data = new int[maxSize];
    }

    public void push(int x) {
        if (pointer == data.length - 1) return;
        data[++pointer] = x;

    }

    public int pop() {
        if (pointer == -1) return pointer;
        return data[pointer--];
    }

    public void increment(int k, int val) {
        k = Math.min(k, pointer + 1);
        for (int i = 0; i < k; i++) {
            data[i] += val;
        }
    }
}