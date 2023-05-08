package com.learn.dsa.dsa2_bitwise;

public class B1_Core {
    
    public static int getKthBit(int n, int k) {
        
        System.out.println("Input - "+Integer.toBinaryString(n));
        int mask = 1 << k;
        System.out.println("mask - "+Integer.toBinaryString(mask));
        return n & mask;
    }

    public static int setKthBit(int n, int k) {
        
        System.out.println("Input - "+Integer.toBinaryString(n));
        int mask = 1 << k;
        System.out.println("mask - "+Integer.toBinaryString(mask));
        return n | mask;
    }

    public static int clearKthBit(int n, int k) {
        
        System.out.println("Input - "+Integer.toBinaryString(n));
        int mask = ~(1 << k);
        System.out.println("mask - "+Integer.toBinaryString(mask));
        return n & mask;
    }

    public static int updateKthBit(int n, int k) {
        
        System.out.println("Input - "+Integer.toBinaryString(n));
        int tmp = clearKthBit(n, k);
        System.out.println("tmp - "+Integer.toBinaryString(tmp));
        return tmp == n ? setKthBit(n, k) : tmp ;
    }

    public static int clearLastKBits(int n, int k) {

        System.out.println("Input - "+Integer.toBinaryString(n));
        int mask = (-1 << k+1);
        System.out.println("mask - "+Integer.toBinaryString(mask));
        return n & mask;
    }

    public static int clearRangeOfBits(int n, int i, int j) {

        System.out.println("Input - "+Integer.toBinaryString(n));
        int mask1 = (-1 << j+1);
        System.out.println("mask1 - "+Integer.toBinaryString(mask1));
        int mask2 = (1 << i) - 1;
        System.out.println("mask2 - "+Integer.toBinaryString(mask2));
        int mask = mask1 | mask2;
        System.out.println("mask - "+Integer.toBinaryString(mask));
        return n & mask;
    }
}
