import org.junit.Assert;
import org.junit.Test;

public class RenewableListTest {

    @Test
    public void BasicTests (){
        RenewableList <String> list = new RenewableList<>(5);
        Assert.assertEquals(0, list.size());
        list.add("A");
        Assert.assertEquals(1, list.size());
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("E");
        list.add("F");
        Assert.assertEquals(5, list.size());


        Assert.assertEquals("F", list.get());
    }

    @Test
    public void CapacityTest(){
        RenewableList <String> list = new RenewableList<>(5);
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("E");
        list.add("F");
        Assert.assertEquals(5, list.size());
        list.setCapacity(2);
        Assert.assertEquals(2, list.size());
    }



}
