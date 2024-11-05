//import org.junit.Assert;
//import org.junit.FixMethodOrder;
//import org.junit.Test;
//import org.junit.runners.MethodSorters;
//
//@FixMethodOrder(MethodSorters.NAME_ASCENDING)
//public class UniqueLinkedListTest {
//    @Test
//    public void aInsertAndFind() {
//        UniqueLinkedList<Double> uniqueLinkedList = new UniqueLinkedList<>();
//        uniqueLinkedList.insert(10.2);
//        uniqueLinkedList.insert(32.3);
//        uniqueLinkedList.insert(43.5);
//        uniqueLinkedList.insert(123.65);
//        uniqueLinkedList.insert(34.33);
//        Assert.assertEquals(uniqueLinkedList.find(32.3), 1);
//        Assert.assertEquals(uniqueLinkedList.find(123.65), 1);
//        Assert.assertEquals(uniqueLinkedList.find(43.5), 1);
//        Assert.assertEquals(uniqueLinkedList.find(22.2), 0);
//        Assert.assertEquals(uniqueLinkedList.find(222.2), 0);
//    }
//
//    @Test
//    public void bInsertingDuplicateElements() {
//        UniqueLinkedList<Double> uniqueLinkedList = new UniqueLinkedList<>();
//        uniqueLinkedList.insert(10.2);
//        uniqueLinkedList.insert(10.2);
//        uniqueLinkedList.insert(10.2);
//        Assert.assertEquals(uniqueLinkedList.find(10.2), 3);
//    }
//
//    @Test
//    public void cNodeCount() {
//        UniqueLinkedList<Double> uniqueLinkedList = new UniqueLinkedList<>();
//        uniqueLinkedList.insert(10.2);
//        uniqueLinkedList.insert(10.2);
//        uniqueLinkedList.insert(10.2);
//        uniqueLinkedList.insert(12.2);
//        uniqueLinkedList.insert(12.2);
//        uniqueLinkedList.insert(12.2);
//        uniqueLinkedList.insert(12.1);
//        Assert.assertEquals(uniqueLinkedList.getNumNodes(), 3);
//    }
//
//    @Test
//    public void dForEach() {
//        UniqueLinkedList<Double> uniqueLinkedList = new UniqueLinkedList<>();
//        uniqueLinkedList.insert(12.2);
//        uniqueLinkedList.insert(1.2);
//        uniqueLinkedList.insert(22.2);
//        uniqueLinkedList.insert(32.2);
//        uniqueLinkedList.insert(42.2);
//        final int[] callCount = {0};
//        uniqueLinkedList.forEach((value, count) -> {
//            callCount[0] ++;
//        });
//
//        Assert.assertEquals(callCount[0], 5);
//    }
//
//}
