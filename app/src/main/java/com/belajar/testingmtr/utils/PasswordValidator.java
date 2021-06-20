package com.belajar.testingmtr.utils;

public class PasswordValidator {

    public static boolean isValidStrong(String password){
        // seleksi jumlah password yang kuat
        if (password.length() > 5){
            return true;
        } else
            return false;
    }

    public static boolean isEmpty(String password){
        if (password.isEmpty()){
            return false;
        } else
            return true;
    }
}

















