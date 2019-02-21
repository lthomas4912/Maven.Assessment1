package com.zipcodewilmington.assessment1.part5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Palindrome {

    public Integer countPalindromes(String input) {
        int count = 0;
        List<String> array = new ArrayList<String>();
        for (int i = 0; i < input.length(); i++) {
            for (int j = i+1; j <= input.length(); j++) {
                array.add(input.substring(i,j));
                if(reverse(input.substring(i,j)).equals(input.substring(i,j))){
                    count++;
                }

            }

        }

        return count;


}

    public static String reverse (String input){
        String reverse = new StringBuilder(input).reverse().toString();
        return reverse;

    }

    public static boolean isPalindromic (String input){
        //char [] array = reverse(input).toCharArray();
        //char [] array2 = input.toCharArray();
        //return Arrays.equals(array, array2);
        return input.equals(reverse(input));
    }


}


