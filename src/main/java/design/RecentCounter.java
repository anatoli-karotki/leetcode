package design;

import java.util.ArrayDeque;
import java.util.Queue;

public class RecentCounter {
    private Queue<Integer> queue;

    public RecentCounter() {
        queue = new ArrayDeque<>();
    }

    public int ping(int t) {
        queue.add(t);
        int limit = t - 3000;
        while (queue.peek() < limit) queue.poll();
        return queue.size();
    }
}

