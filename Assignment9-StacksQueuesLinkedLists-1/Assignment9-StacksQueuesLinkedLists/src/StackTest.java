//import org.junit.Assert;
//import org.junit.FixMethodOrder;
//import org.junit.Test;
//import org.junit.runners.MethodSorters;
//
//@FixMethodOrder(MethodSorters.NAME_ASCENDING)
//public class StackTest {
//    @Test
//    public void aPushAndPop() {
//        Stack<Byte> stack = new Stack<>();
//        stack.push((byte)0xFF);
//        stack.push((byte)0xC2);
//        stack.push((byte)0xA7);
//        stack.push((byte)0x4C);
//
//        Assert.assertEquals(stack.pop(), Byte.valueOf((byte)0x4C));
//        Assert.assertEquals(stack.pop(), Byte.valueOf((byte)0xA7));
//        Assert.assertEquals(stack.pop(), Byte.valueOf((byte)0xC2));
//        Assert.assertEquals(stack.pop(), Byte.valueOf((byte)0xFF));
//    }
//
//    @Test
//    public void bPopThrowsException() {
//        Stack<Byte> stack = new Stack<>();
//        Assert.assertThrows(Stack.StackEmptyException.class, stack::pop);
//    }
//}
