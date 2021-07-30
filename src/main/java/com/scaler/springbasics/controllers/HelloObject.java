package com.scaler.springbasics.controllers;

import com.fasterxml.jackson.annotation.JsonProperty;

class HelloObject {
    @JsonProperty
    String salutation;
    @JsonProperty
    String greetings;

    public HelloObject(String salutation, String greetings) {
        this.salutation = salutation;
        this.greetings = greetings;
    }
}
