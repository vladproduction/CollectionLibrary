package App01_Array;

import com.MyCollections.app01_Bag.Bag;
import com.MyCollections.app01_Bag.BagImpl;
import org.junit.Assert;
import org.junit.Test;

public class BagImplTest {

    @Test
    public void apiTest(){
        Bag data = new BagImpl();
        Assert.assertTrue(data.isEmpty());
        Assert.assertTrue(data.size()==0);
        data.add("a");
        data.add("b");
        data.add("c");
        Assert.assertFalse(data.isEmpty());
        Assert.assertTrue(data.size()==3);
        data.add("d");
        data.add("e");
        Assert.assertFalse(data.size()==3);
        Assert.assertTrue(data.size()==5);


    }
}
