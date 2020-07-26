package com.rest.api.error;

public class RimNotFoundException extends RuntimeException {

    public RimNotFoundException(Long id) {
        super("Rim id not found : " + id);
    }

}
