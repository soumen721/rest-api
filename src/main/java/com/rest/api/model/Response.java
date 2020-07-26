package com.rest.api.model;

import java.io.Serializable;
import java.util.List;

public class Response implements Serializable {

    private Header header;
    private SpecDigitResponse response;

    public Header getHeader() {
        return header;
    }

    public void setHeader(Header header) {
        this.header = header;
    }

    public SpecDigitResponse getResponse() {
        return response;
    }

    public void setResponse(SpecDigitResponse response) {
        this.response = response;
    }
}
