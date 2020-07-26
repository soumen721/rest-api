package com.rest.api.repository;

import com.rest.api.model.SpecDigit;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class SpecDigitRowMapper implements RowMapper<SpecDigit> {

    @Override
    public SpecDigit mapRow(ResultSet rs, int rowNum) throws SQLException {

        SpecDigit rimDetails = new SpecDigit();
        /*rimDetails.setRimId(rs.getString("VIN"));
        rimDetails.setRimId(rs.getString("model_number"));
        rimDetails.setManufacturer(rs.getString("Model_year"));

        rimDetails.setManufacturer(rs.getString("SPEC_CODE"));
        rimDetails.setPrice(rs.getString("SPEC_DIGIT"));
        rimDetails.setPrice(rs.getString("SPEC_DIGIT_DESC"));*/
        return rimDetails;

    }
}
