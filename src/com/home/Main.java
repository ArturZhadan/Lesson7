package com.home;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	String string = args[0];
    char [] array = string.toCharArray();
        System.out.println(Arrays.toString(array));
    int sum = 0;
    for (int i=0; i< array.length; i++){
        sum = sum + Integer.parseInt(String.valueOf(array[i]));
    }
        System.out.println(sum);
    }
}
