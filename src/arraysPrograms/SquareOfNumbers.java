package arraysPrograms;

import java.util.Arrays;

/**
 * Created by pnall on 1/19/17.
 */
/*
  Generate square of numbers in an array
  Example: Input [1,3,5] ----> Output [1,9,25]


*/
public class SquareOfNumbers {

    public static void main(String[] args){

        System.out.println(Arrays.toString(squareArray(new int[]{0,1,2,3,4})));

    }

    public static int[] squareArray(int[] input){

        int[] output = new int[input.length];

        for(int i=0;i<input.length;i++){

            output[i] = input[i]*input[i];
        }

        return output;

    }



}





