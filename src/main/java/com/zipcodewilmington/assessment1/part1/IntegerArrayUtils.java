package com.zipcodewilmington.assessment1.part1;
import java.util.stream.*;
/**
 * Created by leon on 2/16/18.
 */
public class IntegerArrayUtils {
    /**
     * @param intArray an array of integers
     * @return the sum of `intArray`
     */
    public static Integer getSum(Integer[] intArray) {
    int result = 0;

    for(int i : intArray)
        result += i;



      return result;
    }

    /**
     * @param intArray an array of integers
     * @return the product of `intArray`
     */
    public static Integer getProduct(Integer[] intArray) {
        int result = 1;
        for (int i = 0; i < intArray.length; i++) {
            Integer integer = intArray[i];
            result = result * integer;

        }


        return result;
    }

    /**
     * @param intArray an array of integers
     * @return the sum of `intArray` divided by number of elements in `intArray`
     */
    public static Double getAverage(Integer[] intArray) {
        double result = 0;
        for(double i : intArray)
            result = result + i;



        return result = result/intArray.length;
    }
}
