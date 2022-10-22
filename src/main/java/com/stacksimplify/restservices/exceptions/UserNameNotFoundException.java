package com.stacksimplify.restservices.exceptions;

public class UserNameNotFoundException extends Exception{
    private static final long serialVersionUID = -7754659760115609404L;

    // Superclass Contructor
    public UserNameNotFoundException(String message) {
        super(message);
    }
}
