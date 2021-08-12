package design;

import java.util.Stack;

public class StockSpanner {
    private Stack<Integer> stock;
    private Stack<Integer> spans;

    public StockSpanner() {
        stock = new Stack<>();
        spans = new Stack<>();
    }

    public int next(int price) {
        int span = 1;
        while (!stock.isEmpty() && stock.peek() <= price) {
            span += spans.pop();
            stock.pop();
        }
        stock.push(price);
        spans.push(span);
        return span;
    }
}