package com.rest.api.model;

import java.io.Serializable;
import java.util.List;

public class SpecDigitResponse implements Serializable {

    private String vin;
    private String modelNumber;
    private String modelYear;

    private List<SpecDigit> specDetails;

    public String getVin() {
        return vin;
    }

    public void setVin(String vin) {
        this.vin = vin;
    }

    public String getModelNumber() {
        return modelNumber;
    }

    public void setModelNumber(String modelNumber) {
        this.modelNumber = modelNumber;
    }

    public String getModelYear() {
        return modelYear;
    }

    public void setModelYear(String modelYear) {
        this.modelYear = modelYear;
    }

    public List<SpecDigit> getSpecDetails() {
        return specDetails;
    }

    public void setSpecDetails(List<SpecDigit> specDetails) {
        this.specDetails = specDetails;
    }
}
