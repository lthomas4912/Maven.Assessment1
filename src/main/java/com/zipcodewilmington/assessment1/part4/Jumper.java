package com.zipcodewilmington.assessment1.part4;

public class Jumper {

    /*
     * Complete the function below.
     */
    public int jumps(int flagHeight, int jumpHeight) {
        Integer result = 0;

        int type1 = flagHeight%jumpHeight;
        int type2 = (flagHeight - type1)/ jumpHeight;

        result =  type1 + type2;

    return result;





    }




}

//type1jump = k%j
//type2jump = k - type1/ j
//total number of jumps = type1+type2
// just like the whiteboard interview