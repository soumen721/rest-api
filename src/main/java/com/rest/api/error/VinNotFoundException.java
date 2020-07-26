package com.rest.api.error;

public class VinNotFoundException extends RuntimeException {

    public VinNotFoundException(String id) {
        super("Rim id not found : " + id);
    }

}
