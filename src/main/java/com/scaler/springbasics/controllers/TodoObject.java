package com.scaler.springbasics.controllers;

import com.fasterxml.jackson.annotation.JsonProperty;

public class TodoObject {
    @JsonProperty
    String task;
    @JsonProperty
    boolean done;

    public TodoObject(String task, boolean done) {
        this.task = task;
        this.done = done;
    }
}
