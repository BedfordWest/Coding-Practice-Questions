package com.bedfordwest.arraylistexercise.arrays;

import java.util.LinkedHashMap;
import java.util.LinkedList;

/**
 * Created by Bedford on 1/23/2015.
 */
public final class ArrayComparer
{
    private ArrayComparer()
    {
        throw new AssertionError();
    }

    public String outputElementCommonalities(String[] firstString, int arrayIndex1, String[] secondString, int arrayIndex2)
    {

        if (arrayIndex1 > firstString.length)
        {
            System.out.format("Index %i does not exist for the first array!", arrayIndex1);
        }

        else if (arrayIndex2 > secondString.length)
        {
            System.out.format("Index %i does not exist for the second array!", arrayIndex2);
        }

        LinkedList<Character> l1 = new LinkedList<Character>(), l2 = new LinkedList<Character>();

        for (int i = 0; i < firstString[arrayIndex1].length(); i++)
        {
            l1.add(firstString[arrayIndex1].charAt(i));
        }

        for (int j = 0; j < secondString[arrayIndex2].length(); j++)
        {
            l2.add(secondString[arrayIndex2].charAt(j));
        }

        l1.retainAll(l2);

        return l1.toArray(new Character[0]).toString();
    }

}
