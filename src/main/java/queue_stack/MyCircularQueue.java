package queue_stack;

class MyCircularQueue {
    int[] values;
    int counter;
    int front = -1;
    int rear = -1;

    public MyCircularQueue(int k) {
        values = new int[k];
    }

    public boolean enQueue(int value) {
        if (isFull()) return false;
        if (isEmpty()) front = 0;
        rear = getNextIndex(rear);
        values[rear] = value;
        counter++;
        return true;
    }

    public boolean deQueue() {
        if (isEmpty()) return false;
        front = getNextIndex(front);
        counter--;
        if (counter == 0){
            front = -1;
            rear = -1;
        }
        return true;
    }

    public int Front() {
        if (front != -1) return values[front];
        return -1;
    }

    public int Rear() {
        if (rear != -1) return values[rear];
        return -1;
    }

    public boolean isEmpty() {
        return counter == 0;
    }

    public boolean isFull() {
        return counter == values.length;
    }

    private int getNextIndex(int i) {
        i++;
        return i == values.length ? 0 : i ;
    }
}

/**
 * Your MyCircularQueue object will be instantiated and called as such:
 * MyCircularQueue obj = new MyCircularQueue(k);
 * boolean param_1 = obj.enQueue(value);
 * boolean param_2 = obj.deQueue();
 * int param_3 = obj.Front();
 * int param_4 = obj.Rear();
 * boolean param_5 = obj.isEmpty();
 * boolean param_6 = obj.isFull();
 */
