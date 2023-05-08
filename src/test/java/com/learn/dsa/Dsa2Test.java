package com.learn.dsa;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.learn.dsa.dsa2_bitwise.B1_Core;

public class Dsa2Test {
    
    @DisplayName("Get Kth Bit")
    @Test
    public void getKthBit() {
        
        int result = B1_Core.getKthBit(10, 3);
        assertEquals(result, 8);

        result = B1_Core.getKthBit(1023, 3);
        assertEquals(result, 8);
    }

    @DisplayName("Set Kth Bit")
    @Test
    public void setKthBit() {
        
        int result = B1_Core.setKthBit(10, 0);
        assertEquals(result, 11);

        result = B1_Core.setKthBit(1024, 5);
        assertEquals(result, 1056);
    }

    @DisplayName("Clear Kth Bit")
    @Test
    public void clearKthBit() {
        
        int result = B1_Core.clearKthBit(10, 1);
        assertEquals(result, 8);

        result = B1_Core.clearKthBit(1023, 5);
        assertEquals(result, 991);
    }

    @DisplayName("Update Kth Bit - Make the Kth bit to 0 if existing is 1 & vice-versa")
    @Test
    public void updateKthBit() {
        
        int result = B1_Core.updateKthBit(11, 3);
        assertEquals(result, 3);

        result = B1_Core.updateKthBit(11, 2);
        assertEquals(result, 15);
    }

    @DisplayName("Clear Last K Bits")
    @Test
    public void clearLastKBits() {
        
        int result = B1_Core.clearLastKBits(10, 1);
        System.out.println("Result ---- "+Integer.toBinaryString(result));
        assertEquals(result, 8);

        result = B1_Core.clearLastKBits(1023, 5);
        System.out.println("Result ---- "+Integer.toBinaryString(result));
        assertEquals(result, 960);
    }

    @DisplayName("Clear Last K Bits")
    @Test
    public void clearRangeOfBits() {

        int result = B1_Core.clearRangeOfBits(1023, 2, 6);
        System.out.println("Result ---- "+Integer.toBinaryString(result));
        assertEquals(result, 899);
    }
}
