package arraysPrograms;

/**
 * Created by pnall on 1/19/17.
 */

/*
Given an array of N elements and an integer K, write a function that returns true if sum of any 2 elements
 of array is K, false otherwise
 */

public class SumOfElementsEqualsInteger {

    public static void main(String[] args){

    int[] input = new int[]{1,2,3,4,5,6};

        System.out.println(sumEqualsInteger(input, 12));


    }
     public static boolean sumEqualsInteger(int[] input, int value){

         for(int i=0;i<input.length;i++){

             for(int j=i+1;j<input.length;j++){

                 if(input[i]+input[j] == value)
                     return true;
             }
         }

         return false;
     }



}
