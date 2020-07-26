package com.rest.api.error;

public class RimNotFoundException extends RuntimeException {

    public RimNotFoundException(String id) {
        super("Rim id not found : " + id);
    }

}
