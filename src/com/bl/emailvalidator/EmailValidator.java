package com.bl.emailvalidator;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailValidator {
    public static void checkValidEmail(String email){

        boolean isEmail;
        String emailRegex = "^[a-zA-Z]*[@]{1}[.a-z]*$";
        Pattern patternObject = Pattern.compile(emailRegex);
        if (email == null) {
            isEmail = false;
        }
        Matcher matcherObject = patternObject.matcher(email);
        isEmail =  matcherObject.matches();

        if(isEmail)
            System.out.println(email+" is a Valid Email address");
        else
            System.out.println(email+" is an Invalid Email address");
    }

    public static void main(String[] args) {

        System.out.println("---------- Welcome To Email Validator ----------");

        String email = "abc@bridgelabz.co.in";
        checkValidEmail(email);

        email = ".abc@abc.com";
        checkValidEmail(email);

        email = "abc@gmail.com.com";
        checkValidEmail(email);
    }

}
