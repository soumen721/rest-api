package com.rest.api.error;

import java.util.Set;

public class RimUnSupportedFieldPatchException extends RuntimeException {

    public RimUnSupportedFieldPatchException(Set<String> keys) {
        super("Field " + keys.toString() + " update is not allow.");
    }

}
