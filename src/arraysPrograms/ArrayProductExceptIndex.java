package arraysPrograms;

import java.util.Arrays;

/**
 * Created by pnall on 1/19/17.
 */

/*
Given an array of integers, write a function to produce another array where value of each index of
array is product of all values in array except that index
*/

public class ArrayProductExceptIndex {

    public static void main(String[] args){

        int[] input = new int[]{1,2,3,4,5,6};

        System.out.println(Arrays.toString(arrayProduct(input)));

    }

    public static int[] arrayProduct(int[] input){

        int[] output = new int[input.length];

        for(int i=0;i<input.length;i++){

            int product = 1;

            for(int j=0;j<input.length;j++){

                if(j!=i)
                    product = product*input[j];
            }

            output[i] = product;
        }

        return output;
    }


}
