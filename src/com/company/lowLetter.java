package com.company;

public class lowLetter {
    public static char symbolPlusKey(int value,int key){
        if (value <= 1077  || value + key - 32 > 1077) {
            value = value + key - 1;
        } else {
            value = value + key;
        }
        if (value > 1103) {
            value -= 32;
        }

        return (char) value;
    }
}
