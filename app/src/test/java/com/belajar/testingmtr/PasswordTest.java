package com.belajar.testingmtr;

import com.belajar.testingmtr.utils.PasswordValidator;

import org.junit.Assert;
import org.junit.Test;

public class PasswordTest {

    // Menentukan Password
    private final String EXAMPLE_PASSWROD = "aa";

    @Test
    public void TestPasswordKuat(){
        Assert.assertTrue(PasswordValidator.isValidStrong(EXAMPLE_PASSWROD));
    }

}





