/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problem4;
/**
 *
 * @author Joca
 */
public class Problem4 {

    int originalPosition; //Variable used record the value of the highest number found in the array
    int topPick; //Variable used to record the value of the highest number in the array

    public static void main(String[] args) {
     
    }

    /**
     * .
     * The run time of the complexity is O(n^2).
     * 
     * This kind of sorting is at the same time similar and different 
     * to insertion sort. Their similarities is that they check every element 
     * in a array in a crescent order, but their main difference is that this 
     * sorting method does a loop for every single number in the array.
     * 
     * This sorting method would work better in an array in decrescent order.
     * 
     * The insertion sort would work better in an array in crescent order.
     * 
     * @param array The unsorted array
     * @return sortedArray The array after being sorted
     * 
     */
    public int[] numberSorting(int[] array){
        
        if (array.length == 0){
            return null;
        }
        
        int higherPlace = array.length - 1; // Variable used to set the highest available place in the array
        int lookingForHigher = 0; //Variable used to loop through all components in the array
        int lowestNumber = array[0]; //Variable used to determine the lowest value in the array
        
        for (int i = 0; i < array.length; i++) {

            if (array[i] < lowestNumber) {
                topPick = array[i];
                lowestNumber = array[i];
            }

        }

        while (higherPlace >= 0) {

            while (lookingForHigher <= higherPlace) {
                int pick = array[lookingForHigher];
                if (pick >= topPick) {
                    topPick = pick;
                    originalPosition = lookingForHigher;
                }
                lookingForHigher++;
            }

            int tempValue = array[higherPlace];
            array[higherPlace] = topPick;
            array[originalPosition] = tempValue;
            lookingForHigher = 0;

            topPick = lowestNumber;
            higherPlace--;
        }

        int[] sortedArray = array.clone();
        return sortedArray;
    }
       
}
