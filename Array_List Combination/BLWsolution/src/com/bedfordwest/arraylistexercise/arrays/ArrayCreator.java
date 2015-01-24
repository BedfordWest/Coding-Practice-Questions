package com.bedfordwest.arraylistexercise.arrays;

import java.util.LinkedList;
import java.util.Scanner;

/**
 * Created by Bedford on 1/23/2015.
 */
public class ArrayCreator
{
    private Scanner in = new Scanner(System.in);
    public String[] getStrings()
    {
        String lineInput;
        LinkedList<String> enteredStrings = new LinkedList<String>();


        System.out.println("Enter a string. Type  'done' when finished.");
        while((lineInput = in.nextLine()) != "done")
        {
            enteredStrings.add(lineInput);
        }

        String[] returnStrings = enteredStrings.toArray(new String[enteredStrings.size()]);
        return returnStrings;

    }

    public int getArrayIndex(Object[] inputObject)
    {
        int i;

        System.out.println("Enter an integer value in your array's bounds:");
        i = in.nextInt();
        if(i > inputObject.length)
        {
            System.out.println("That index is out of your array's bounds!");
            getArrayIndex(inputObject);
        }

        return i;
    }

}
