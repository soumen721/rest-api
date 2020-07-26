package com.rest.api.error;

import java.util.Set;

public class VinUnSupportedFieldPatchException extends RuntimeException {

    public VinUnSupportedFieldPatchException(Set<String> keys) {
        super("Field " + keys.toString() + " update is not allow.");
    }

}
