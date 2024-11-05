//import org.junit.Assert;
//import org.junit.FixMethodOrder;
//import org.junit.Test;
//import org.junit.runners.MethodSorters;
//
//@FixMethodOrder(MethodSorters.NAME_ASCENDING)
//public class QueueTest {
//    @Test
//    public void aEnqueueAndDequeue() {
//        Queue<Integer> queue = new Queue<>();
//        queue.enqueue(10);
//        queue.enqueue(9);
//        queue.enqueue(8);
//        Assert.assertEquals(queue.dequeue(), Integer.valueOf(10));
//        Assert.assertEquals(queue.dequeue(), Integer.valueOf(9));
//        Assert.assertEquals(queue.dequeue(), Integer.valueOf(8));
//    }
//
//    @Test
//    public void bDequeueThrowsExceptionWhenEmpty() {
//        Queue<Integer> queue = new Queue<>();
//        Assert.assertThrows(Queue.EmptyQueueException.class, queue::dequeue);
//        queue.enqueue(10);
//    }
//
//    @Test
//    public void cClear() {
//        Queue<Integer> queue = new Queue<>();
//        queue.enqueue(10);
//        queue.enqueue(10);
//        queue.enqueue(10);
//        try {
//            queue.dequeue();
//            queue.clear();
//            Assert.assertThrows(Queue.EmptyQueueException.class, queue::dequeue);
//        } catch (Queue.EmptyQueueException e) {
//            Assert.fail();
//        }
//    }
//
//    @Test
//    public void dForEach() {
//        Queue<Integer> queue = new Queue<>();
//        queue.enqueue(10);
//        queue.enqueue(10);
//        queue.enqueue(10);
//        queue.enqueue(10);
//        queue.enqueue(10);
//        final int[] callCount = {0};
//        queue.forEach(_ -> callCount[0] ++);
//        Assert.assertEquals(callCount[0], 5);
//    }
//}
