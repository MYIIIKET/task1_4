package com.mylllket_inc.app;

public class Main {
    public static void main(String[] args) {
        double[] arr = getRandom(5);
        System.out.println(findMax(arr));
    }

    public static double[] getRandom(int n) {
        double[] rand = new double[2 * n];
        for (int i = 0; i < rand.length; i++) {
            rand[i] = Math.random();
        }
        return rand;
    }

    public static double findMax(double[] arr) {
        double max = Double.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if ((arr[i] + arr[arr.length - i - 1]) > max)
                max = (arr[i] + arr[arr.length - i - 1]);
        }
        return max;
    }
}
