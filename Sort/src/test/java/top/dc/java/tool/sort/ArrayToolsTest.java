package top.dc.java.tool.sort;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class ArrayToolsTest {

    @Test
    public void getMax() {
        int[] arr= {30,20,50,10,80,9,7,12,100,40,8};
        assertEquals(100,ArrayTools.getMax(arr));
    }
    @Test
    public void testsprt(){
        int[] arr= {30,20,50,10,80,9,7,12,100,40,8};
        int[] arrlt =ArrayTools.sort(arr);
        System.out.println(Arrays.toString(arrlt));
    }
}
