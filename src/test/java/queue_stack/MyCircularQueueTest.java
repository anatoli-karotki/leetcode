package queue_stack;

import org.testng.annotations.Test;

import static org.testng.AssertJUnit.*;

public class MyCircularQueueTest {

    @Test
    public void testQueue() {
        MyCircularQueueOld circularQueue = new MyCircularQueueOld(3);
        assertTrue(circularQueue.isEmpty());
        assertFalse(circularQueue.isFull());
        assertEquals(-1, circularQueue.Front());
        assertEquals(-1, circularQueue.Rear());


        assertTrue(circularQueue.enQueue(1));
        assertFalse(circularQueue.isEmpty());
        assertFalse(circularQueue.isFull());
        assertEquals(1, circularQueue.Front());
        assertEquals(1, circularQueue.Rear());


        assertTrue(circularQueue.enQueue(2));
        assertFalse(circularQueue.isEmpty());
        assertFalse(circularQueue.isFull());
        assertEquals(1, circularQueue.Front());
        assertEquals(2, circularQueue.Rear());

        assertTrue(circularQueue.enQueue(3));
        assertFalse(circularQueue.isEmpty());
        assertTrue(circularQueue.isFull());
        assertEquals(1, circularQueue.Front());
        assertEquals(3, circularQueue.Rear());

        assertFalse(circularQueue.enQueue(4));
        assertFalse(circularQueue.isEmpty());
        assertTrue(circularQueue.isFull());
        assertEquals(1, circularQueue.Front());
        assertEquals(3, circularQueue.Rear());

        assertTrue(circularQueue.deQueue());
        assertFalse(circularQueue.isEmpty());
        assertFalse(circularQueue.isFull());
        assertEquals(2, circularQueue.Front());
        assertEquals(3, circularQueue.Rear());

        assertTrue(circularQueue.enQueue(4));
        assertFalse(circularQueue.isEmpty());
        assertTrue(circularQueue.isFull());
        assertEquals(2, circularQueue.Front());
        assertEquals(4, circularQueue.Rear());


    }
}
