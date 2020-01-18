/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problem2;

/**
 *
 * @author cgallinaro
 */
public class Problem2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        }
    
    public boolean division(long n){
        
        String number;
        int math = 0; //where the characters addition will be made
        
        while (n != 3 && n != 6 && n != 9){
            number = Long.toString(n);
            int length = number.length();
            if (n <= 10){ //if a number is smaller than 10 and isn't 3,6 or 9 it isn't divisible by 3
                return false;
            }
            for (int i = 1; i <= length ; i++){
                int numeral = Character.getNumericValue(number.charAt(i-1));
                math += numeral;
            }
            n = math;
            math = 0;
    }
        return true; 
    }
  
}
