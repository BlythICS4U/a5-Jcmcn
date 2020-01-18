/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problem5;

import static org.junit.Assert.*;
import org.junit.Test;

/**
 *
 * @author Joca
 */
public class Problem5Test {
    
    @Test
    public void testbinarySearchRecursive(){
        
        Problem5 test = new Problem5();

        assertEquals(1, test.search("aa"));
        assertEquals(6902, test.search("baldur"));
        assertEquals(99999, test.search("zzzz"));
        assertEquals(0, test.search("a"));
        assertEquals(50000, test.search("leb"));
        assertEquals(3258, test.search("analytics"));
        
    }
    
}
