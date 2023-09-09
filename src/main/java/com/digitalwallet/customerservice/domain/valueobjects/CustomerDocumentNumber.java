package com.digitalwallet.customerservice.domain.valueobjects;

public class CustomerDocumentNumber {
    public String value;
    public CustomerDocumentNumber(String value) {
        this.value = value;
        this.ensureIsValidTypeDocument();
    }
    private void ensureIsValidTypeDocument(){
        if(!this.value.matches("[0-9]{9}")){
            throw new RuntimeException();
        }
        if(!this.value.matches("10[0-9]{9}")){
            throw new RuntimeException();
        }
    }
}