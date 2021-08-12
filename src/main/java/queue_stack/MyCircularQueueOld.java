package queue_stack;

public class MyCircularQueueOld {

    private int[] content;
    int front = -1;
    int rear = -1;
    int size = 0;


    public MyCircularQueueOld(int i) {
        content = new int[i];
    }

    public boolean enQueue(int i) {
        if (isFull()) return false;
        if (isEmpty()) front = 0;
        rear = getNextIndex(rear);
        content[rear] = i;
        size++;
        return true;
    }

    public boolean deQueue() {
        if (isEmpty()) return false;
        front = getNextIndex(front);
        size--;
        if (size == 0){
            front = -1;
            rear = -1;
        }
        return true;
    }

    public int Front() {
        if (isEmpty()) return -1;
        return content[front];
    }

    public int Rear() {
        if (isEmpty()) return -1;
        return content[rear];
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == content.length;
    }

    private int getNextIndex(int i) {
        i++;
        return i == content.length ? 0 : i ;
    }
}
