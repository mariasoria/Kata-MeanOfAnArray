import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MeanOfAnArrayTest {

    @Test
    public void testMeanArray_01(){
        assertEquals(5, MeanOfAnArray.meanOfAnArray (new int [] {3, 4, 7, 6, 5}));
    }

    @Test
    public void testMeanArray_02() {
        assertEquals(10, MeanOfAnArray.meanOfAnArray(new int[]{20, 12, 5, 8, 5}));
    }

    @Test
    public void testMeanArray_03(){
        assertEquals(3, MeanOfAnArray.meanOfAnArray (new int [] {1, 2, 3, 4, 5}));
    }

    @Test
    public void testMeanArray_04(){
        assertEquals(2,MeanOfAnArray.meanOfAnArray(new int[] {2,2,2,2}));
    }

    @Test
    public void testMeanArray_05(){
        assertEquals(3,MeanOfAnArray.meanOfAnArray(new int[] {1,2,3,4,5}));
    }

    @Test
    public void testMeanArray_06(){
        assertEquals(1,MeanOfAnArray.meanOfAnArray(new int[] {1,1,1,1,1,1,1,2}));
    }

}