/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package insertionsort;

/**
 *
 * @author cst16045
 */
public class InsertionSort {

    /**
     * @param args the command line arguments
     */
    
    public void sort(int[] inArray){
    
        int len = inArray.length;
        for (int i = 1; i < len; i++) {
            int key = inArray[i];
            int sortIndex = i - 1;
            
            while(sortIndex >= 0 && inArray[sortIndex] > key){
                inArray[sortIndex+1] = inArray[sortIndex];
                sortIndex = sortIndex - 1;
            }
            
            inArray[sortIndex+1] = key;
        }
    }
    
    public static void main(String[] args) {
        
        int[] unSorted = {45,98,4,12,6,125,78,95,45};
        
        InsertionSort test = new InsertionSort();
        test.sort(unSorted);
        
        for (int i = 0; i < unSorted.length; i++) {
            System.out.print(" "+unSorted[i]);
        }
        System.out.println(""); //to make a space
    }
    
}
