package main;
import datastructure.DSAArrays;

import java.util.Arrays;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        DSAArrays arrays=new DSAArrays(new int[]{0, 1, 2, 3, 4});
        System.out.print(Arrays.toString(arrays.rotateArray(1)));
    }
}