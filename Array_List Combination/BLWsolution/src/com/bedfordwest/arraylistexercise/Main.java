package com.bedfordwest.arraylistexercise;

import com.bedfordwest.arraylistexercise.arrays.ArrayComparer;
import com.bedfordwest.arraylistexercise.arrays.ArrayCreator;

public class Main {

    public static void main(String[] args) {

        String[] string1, string2;
        int index1, index2;

        System.out.println("Welcome to the String intersection finder!");
        System.out.println("In this program, you will be able to enter two arrays of strings," +
                " and then find the intersection of a string from each array!");
        System.out.println("First, we will grab your first String array.");
        string1 = ArrayCreator.getStrings();
        System.out.println("Now, which array element do you want to compare from the first array?");
        index1 = ArrayCreator.getArrayIndex(string1);
        System.out.println("Next, we will grab your second String array.");
        string2 = ArrayCreator.getStrings();
        System.out.println("Now, which array element do you want to compare from the second array?");
        index2 = ArrayCreator.getArrayIndex(string2);

        System.out.println("These two strings have the following characters in common:");
        System.out.format("%s", ArrayComparer.outputElementCommonalities(string1,index1,string2,index2));

    }
}
