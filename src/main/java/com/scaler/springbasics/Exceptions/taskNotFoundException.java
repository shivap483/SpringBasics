package com.scaler.springbasics.Exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.server.ResponseStatusException;

@ResponseStatus(code = HttpStatus.NOT_FOUND, reason = "task not found")
public class taskNotFoundException extends ResponseStatusException {
    public taskNotFoundException(HttpStatus status, String reason) {
        super(status, reason);
    }
}
