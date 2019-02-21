package com.zipcodewilmington.assessment1.part2;

import com.sun.corba.se.impl.ior.OldJIDLObjectKeyTemplate;
import com.sun.tools.corba.se.idl.InterfaceGen;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by leon on 2/16/18.
 */
public class ArrayUtils {
    /**
     * @param objectArray   an array of any type of Object
     * @param objectToCount any non-primitive value
     * @return the number of times the specified `value` occurs in the specified `objectArray`
     * Given an array of objects, named `objectArray`, and an object `objectToCount`, return the number of times the `objectToCount` appears in the `objectArray`
     */
    public static Integer getNumberOfOccurrences(Object[] objectArray, Object objectToCount) {
        int count = 0;
        for (int i = 0; i < objectArray.length; i++) {

            if (objectArray[i] == objectToCount) {
                count++;
            }


        }

        return count;
    }

    /**
     * @param objectArray    an array of any type of Object
     * @param objectToRemove a value to be removed from the `objectArray`
     * @return an array with identical content excluding the specified `objectToRemove`
     * Given an array of objects, name `objectArray`, and an object `objectToRemove`, return an array of objects with identical contents excluding `objectToRemove`
     */
    public static Object[] removeValue(Object[] objectArray, Object objectToRemove) {

        Object [] result = new Integer[objectArray.length - getNumberOfOccurrences(objectArray,objectToRemove)];
        int index = 0;
        for (Object word : objectArray) {
                if(!word.equals(objectToRemove)) {
                    result[index] = word;
                    index++;
                }

        }

        return result;



    }

    /**
     * @param objectArray an array of any type of Object
     * @return the most frequently occurring object in the array
     * given an array of objects, named `objectArray` return the most frequently occuring object in the array
     */
    @SuppressWarnings("Duplicates")
    public static Object getMostCommon(Object[] objectArray) {
        Object result = objectArray[0];
        for(Object word : objectArray){
            if(getNumberOfOccurrences(objectArray, word) > getNumberOfOccurrences(objectArray, result)){
                result = word;

            }
        }


        return result;
    }


    /**
     * @param objectArray an array of any type of Object
     * @return the least frequently occurring object in the array
     * given an array of objects, named `objectArray` return the least frequently occuring object in the array
     */
    @SuppressWarnings ("Duplicates")
    public static Object getLeastCommon(Object[] objectArray) {
        Object result = objectArray[0];
        for(Object word : objectArray){
            if(getNumberOfOccurrences(objectArray, word) < getNumberOfOccurrences(objectArray, result)){
                result = word;

            }
        }


        return result;
    }

    /**
     * @param objectArray      an array of any type of Object
     * @param objectArrayToAdd an array of Objects to add to the first argument
     * @return an array containing all elements in `objectArray` and `objectArrayToAdd`
     * given two arrays `objectArray` and `objectArrayToAdd`, return an array containing all elements in `objectArray` and `objectArrayToAdd`
     */
    public static Object[] mergeArrays(Object[] objectArray, Object[] objectArrayToAdd) {
        ArrayList<Object> array1 = new ArrayList<Object>(Arrays.asList(objectArray));
        ArrayList<Object> array2 = new ArrayList<Object>(Arrays.asList(objectArrayToAdd));
        int arrayLen = array1.size();
        int arrayLen2 = array2.size();

        Integer [] result =  new Integer[array1.size() + array2.size()];
        System.arraycopy(objectArray,0, result, 0, arrayLen);
        System.arraycopy(objectArrayToAdd, 0, result, arrayLen, arrayLen2);

        return result;
    }
}



