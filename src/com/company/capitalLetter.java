package com.company;

public class capitalLetter {
    public static char symbolPlusKey(int value, int key) {
        if (value <= 1045 || value + key - 32 > 1045) {
            value = value + key - 1;
        } else {
            value = value + key;
        }
        if (value > 1071) {
            value -= 32;
        }
         return  (char) value;
}
}
