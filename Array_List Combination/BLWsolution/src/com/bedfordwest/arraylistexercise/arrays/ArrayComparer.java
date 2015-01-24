package com.bedfordwest.arraylistexercise.arrays;
import java.util.LinkedList;

/**
 * Created by Bedford on 1/23/2015.
 */
public abstract class ArrayComparer
{

    public static String outputElementCommonalities(String[] firstString, int arrayIndex1, String[] secondString, int arrayIndex2)
    {

        if (arrayIndex1 > firstString.length)
        {
            System.out.format("Index %i does not exist for the first array!", arrayIndex1);
        }

        else if (arrayIndex2 > secondString.length)
        {
            System.out.format("Index %i does not exist for the second array!", arrayIndex2);
        }

        StringBuffer sb1 = new StringBuffer();


        for(char c1:firstString[arrayIndex1].toCharArray())
        {
            if (secondString[arrayIndex2].contains(new Character(c1).toString()))
            {
                sb1.append(c1);
            }
        }

        String returnString = sb1.toString();

        return returnString;
    }

}
