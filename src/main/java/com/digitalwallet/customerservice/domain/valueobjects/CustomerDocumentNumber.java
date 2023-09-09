package com.digitalwallet.customerservice.domain.valueobjects;

public class CustomerDocumentNumber {
    public String value;
    public CustomerDocumentNumber(String value) {
        this.value = value;
        this.ensureIsValidDocumentNumber();
    }
    private void ensureIsValidDocumentNumber(){
        if(!this.value.matches("[0-9]{8}")){
            throw new RuntimeException("Document mumber is invalid");
        }
        if(!this.value.matches("10[0-9]{9}")){
            throw new RuntimeException("Document mumber is invalid");
        }
    }
}