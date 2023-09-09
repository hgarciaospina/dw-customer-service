package com.digitalwallet.customerservice.domain.valueobjects;

public class CustomerEmail {
    public static final String validEmailRegex = "^[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}$";
    public final String value;

    public CustomerEmail(String value) {
        this.value = value;
        this.ensureIsValidEmail(value);
    }

    private void ensureIsValidEmail(String value){
        if(!value.matches(this.validEmailRegex)){
            throw new RuntimeException();
        }
    }
}
