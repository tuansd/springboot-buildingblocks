package com.stacksimplify.restservices.exceptions;

public class UserNotFoundException extends Exception{
    private static final long serialVersionUID = 2066092252345466322L;

    public UserNotFoundException(String message) {
        super(message);
    }
}
