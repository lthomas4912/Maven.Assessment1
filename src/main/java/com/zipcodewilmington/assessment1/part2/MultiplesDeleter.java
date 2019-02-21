package com.zipcodewilmington.assessment1.part2;

import java.util.ArrayList;

/**
 * Created by leon on 2/16/18.
 */
public class MultiplesDeleter {
    /**
     * @param ints array of Integer objects
     * @return all ints which are not divisible by 2
     * given an array of integers, named `ints` return an identical array with evens removed
     */
    public Integer[] deleteEvens(Integer[] ints) {
        Integer count = ints.length;
        ArrayList<Integer> oddNum = new ArrayList<Integer>();


        for (int i = 0; i < ints.length; i++) {
            if (i % 2 == 0) {
                count++;
                oddNum.add(ints[i]);
            }
        }
        return oddNum.toArray(new Integer[oddNum.size()]);
    }


    /**
     * @param ints array of Integer objects
     * @return all ints which are divisible by 2
     * given an array of integers, named `ints` return an identical array with odds removed
     */
    public Integer[] deleteOdds(Integer[] ints) {
        Integer count = ints.length;
        ArrayList<Integer> evenNum = new ArrayList<>();


        for (int i = 0; i < ints.length; i++) {
            if (i % 2 == 1) {
                count++;
                evenNum.add(ints[i]);
            }
        }
        return evenNum.toArray(new Integer[evenNum.size()]);
    }


    /**
     * @param ints array of Integer objects
     * @return all ints which are not divisible by 3
     * given an array of integers, named `ints` return an identical array with numbers indivisible by 3 removed
     */
    public Integer[] deleteMultiplesOf3(Integer[] ints) {

        ArrayList<Integer> threeNum = new ArrayList<>();


        for (int i = 0; i < ints.length; i++) {
            if (ints[i] % 3 != 0) {

                threeNum.add(ints[i]);
            }
        }
        Integer[] result = threeNum.toArray(new Integer[threeNum.size()]);
        return result;
    }

    /**
     * @param ints     array of Integer objects
     * @param multiple the multiple to evaluate divisibility against
     * @return all ints which are not divisible by the `multiple` specified
     * given an array of integers, named `ints` return an identical array with numbers indivisible by `multiple` removed
     */
    public Integer[] deleteMultiplesOfN(Integer[] ints, int multiple) {

        ArrayList<Integer> threeNum = new ArrayList<>();


        for (int i = 0; i < ints.length; i++) {
            if (ints[i] % multiple != 0) {

                threeNum.add(ints[i]);
            }
        }
        Integer [] result = threeNum.toArray(new Integer[threeNum.size()]);
        return result;
    }
}
