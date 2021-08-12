package design;


import java.util.*;

public class FreqStack {

    Map<Integer, Integer> map;
    Map<Integer, Stack<Integer>> data;
    int maxFrequency;


    public FreqStack() {
        data = new HashMap<>();
        map = new HashMap<>();
        maxFrequency = 0;
    }

    public void push(int x) {
        int frequency = map.getOrDefault(x, 0) + 1;
        map.put(x, frequency);

        Stack<Integer> stack = data.getOrDefault(frequency, new Stack<>());
        stack.push(x);
        data.put(frequency, stack);

        maxFrequency = Math.max(maxFrequency, frequency);
    }

    public int pop() {
        Stack<Integer> stack = data.get(maxFrequency);
        int val = stack.pop();

        map.put(val, maxFrequency - 1);
        if (stack.isEmpty()) maxFrequency--;
        return val;
    }

}

