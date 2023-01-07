

package com.belen.SpringBoot.exception;


public class AboutNotFoundException extends RuntimeException{
    
    public AboutNotFoundException(String message){
        super(message);
    }
    
}
