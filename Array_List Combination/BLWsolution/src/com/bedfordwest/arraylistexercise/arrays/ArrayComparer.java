package com.bedfordwest.arraylistexercise.arrays;

/**
 * Created by Bedford on 1/23/2015.
 */
public final class ArrayComparer
{
    private ArrayComparer()
    {
        throw new AssertionError();
    }

    public String outputCommonalities(String[] firstString, int arrayIndex1, String[] secondString, int arrayIndex2)
    {
        String commonCharacters = "";

        if (arrayIndex1 > firstString.length)
        {
            System.out.format("Index %i does not exist for the first array!", arrayIndex1);
        }

        else if (arrayIndex2 > secondString.length)
        {
            System.out.format("Index %i does not exist for the second array!", arrayIndex2);
        }

        return commonCharacters;
    }

}
