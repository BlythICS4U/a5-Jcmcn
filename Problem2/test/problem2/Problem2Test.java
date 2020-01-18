/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problem2;

import static org.junit.Assert.*;
import org.junit.Test;

public class Problem2Test {
    
    @Test
    public void testdivision(){
        
        Problem2 test = new Problem2();
        
        assertEquals(false, test.division(4));
        assertEquals(false, test.division(11));
        assertEquals(false, test.division(30000000000001000l));
        assertEquals(true, test.division(3));
        assertEquals(true, test.division(6));
        assertEquals(true, test.division(9));
        assertEquals(true, test.division(12));
        assertEquals(true, test.division(49867285122465l));
        assertEquals(true, test.division(30000000000000000l));
        
    }

}
