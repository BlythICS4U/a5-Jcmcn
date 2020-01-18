/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problem4;

import org.junit.Assert;
import static org.junit.Assert.*;
import org.junit.Test;

public class Problem4Test {
    
    
    @Test
    public void positivetestnumberSorting(){
        
        Problem4 test = new Problem4();
        
        int [] test1NotSorted = new int[]{3, 1, 4, 2};
        int [] test1Sorted = new int[]{1, 2, 3, 4};
        
        Assert.assertArrayEquals(test1Sorted, test.numberSorting(test1NotSorted));
        
        int [] test2NotSorted = new int[]{1, 2, 3, 4};
        int [] test2Sorted = new int[]{1, 2, 3, 4};
        
        Assert.assertArrayEquals(test2Sorted, test.numberSorting(test2NotSorted));
        
        int [] test3NotSorted = new int[]{4, 3, 2, 1};
        int [] test3Sorted = new int[]{1, 2, 3, 4};
        
        Assert.assertArrayEquals(test3Sorted, test.numberSorting(test3NotSorted));
        
        int [] test4NotSorted = new int[]{1, 1, 1, 1};
        int [] test4Sorted = new int[]{1, 1, 1, 1};
        
        Assert.assertArrayEquals(test4Sorted, test.numberSorting(test4NotSorted));
        
    }
    
    
    
    
    
    
    @Test
    public void negativetestnumberSorting(){
        
        Problem4 test = new Problem4();
        
        int [] test1NotSorted = new int[]{-3, -1, -4, -2};
        int [] test1Sorted = new int[]{-4, -3, -2, -1};
        
        Assert.assertArrayEquals(test1Sorted, test.numberSorting(test1NotSorted));
        
        int [] test2NotSorted = new int[]{-1, -2, -3, -4};
        int [] test2Sorted = new int[]{-4, -3, -2, -1};
        
        Assert.assertArrayEquals(test2Sorted, test.numberSorting(test2NotSorted));
        
        int [] test3NotSorted = new int[]{-4, -3, -2, -1};
        int [] test3Sorted = new int[]{-4, -3, -2, -1};
        
        Assert.assertArrayEquals(test3Sorted, test.numberSorting(test3NotSorted));
        
        int [] test4NotSorted = new int[]{-1, -1, -1, -1};
        int [] test4Sorted = new int[]{-1, -1, -1, -1};
        
        Assert.assertArrayEquals(test4Sorted, test.numberSorting(test4NotSorted));
        
    }
    
    
    
    
    
    @Test
    public void mixtestnumberSorting(){
        
        Problem4 test = new Problem4();
        
        int [] test1NotSorted = new int[]{40, 2, 1, 43, 3, 65, 0, -1, 58, 3, 42, 4};
        int [] test1Sorted = new int[]{-1, 0 , 1, 2, 3, 3, 4, 40, 42, 43, 58, 65};
        
        Assert.assertArrayEquals(test1Sorted, test.numberSorting(test1NotSorted));
        
        int [] test2NotSorted = new int[]{4, -3, 0, 2, -2, -1, -4, 1, 3};
        int [] test2Sorted = new int[]{-4, -3, -2, -1, 0, 1, 2, 3, 4};
        
        Assert.assertArrayEquals(test2Sorted, test.numberSorting(test2NotSorted));
        
        int [] test3NotSorted = new int[]{0, 0, 0, 0};
        int [] test3Sorted = new int[]{0, 0, 0, 0};
        
        Assert.assertArrayEquals(test3Sorted, test.numberSorting(test3NotSorted));
        
        int [] test4NotSorted = new int[]{0};
        int [] test4Sorted = new int[]{0};
        
        Assert.assertArrayEquals(test4Sorted, test.numberSorting(test4NotSorted));

        int [] test5 =  new int[]{};
        
        Assert.assertArrayEquals(null, test.numberSorting(test5));
        
    }
    
}
