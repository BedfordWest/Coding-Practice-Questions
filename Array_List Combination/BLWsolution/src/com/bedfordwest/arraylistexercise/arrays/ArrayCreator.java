package com.bedfordwest.arraylistexercise.arrays;

import java.util.InputMismatchException;
import java.util.LinkedList;
import java.util.Scanner;

/**
 * Created by Bedford on 1/23/2015.
 */
public abstract class ArrayCreator
{

    public static String[] getStrings()
    {
        Scanner in = new Scanner(System.in);
        String lineInput = "";
        LinkedList<String> enteredStrings = new LinkedList<String>();


        System.out.println("Enter a string. Type  'done' when finished.");
        while(!lineInput.equals("done"))
        {
            lineInput = in.nextLine();
            if(!lineInput.equals("done"))
            {
                enteredStrings.add(lineInput);
            }
        }

        String[] returnStrings = enteredStrings.toArray(new String[enteredStrings.size()]);
        if (returnStrings.length == 0)
        {
            System.out.println("Please enter at least one string!");
            return getStrings();
        }
        else return returnStrings;

    }

    public static int getArrayIndex(Object[] inputObject)
    {
        Scanner in = new Scanner(System.in);
        int i = 0;

        System.out.println("Enter an integer index value in your array's bounds:");
        try { i = in.nextInt(); }
        catch (InputMismatchException badInput)
        {
            System.out.println("That is not an integer!");
            return getArrayIndex(inputObject);
        }

        if((i >= inputObject.length) || (i < 0))
        {
            System.out.println("That index is out of your array's bounds!");
            return getArrayIndex(inputObject);
        }

        return i;
    }

}
