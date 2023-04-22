package io.github.aaronr92;

import java.util.Scanner;

public class Main {

    static {
        System.loadLibrary("native");
    }

    native int addNum(int a, int b);
    
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Main main = new Main();
        int sum = main.addNum(5, 11);
        System.out.println("sum is " + sum);
    }

}