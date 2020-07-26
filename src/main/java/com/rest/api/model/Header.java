package com.rest.api.model;

import java.io.Serializable;

public class Header implements Serializable {

    private String timeStamp;

    public String getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(String timeStamp) {
        this.timeStamp = timeStamp;
    }
}
