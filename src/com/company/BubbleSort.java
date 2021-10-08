package com.company;

import java.util.ArrayList;

public class BubbleSort {

    public int[] bubbleSort(ArrayList<Integer> arr) {
        int n = arr.size();
        int[] minmax = new int[2];
        int temp = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < (n - i); j++) {
                if (arr.get(j - 1) > arr.get(j)) {
                    temp = arr.get(j - 1);
                    arr.set(j-1, arr.get(j)) ;
                    arr.set(j, temp);
                }
            }
        }
        minmax[0] = arr.get(0);
        minmax[1] = arr.get(n-1);
        return minmax;
    }
}
