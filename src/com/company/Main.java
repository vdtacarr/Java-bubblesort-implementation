package com.company;

import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        int[] minmax = new int[2];
        minmax[1] = 1;
        ArrayList<Integer> secondlist = new ArrayList<Integer>();
        BubbleSort bb = new BubbleSort();

        for (int i=1; i<10000; i++) {
            list.add(i);
        }
        Collections.shuffle(list);
        for (int i=0; i<500; i++) {
            secondlist.add(list.get(i));
            System.out.println(secondlist.size());
            minmax = bb.bubbleSort(secondlist);
            System.out.println(minmax[0] +  " " + minmax[1]);
            if(i>0){
                secondlist.set(i,(secondlist.get(i) - minmax[0])/(minmax[1] - minmax[0]));

            }

        }
    }

}
