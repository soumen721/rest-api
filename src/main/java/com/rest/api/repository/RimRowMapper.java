package com.rest.api.repository;

import com.rest.api.model.RimDetails;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class RimRowMapper implements RowMapper<RimDetails> {

    @Override
    public RimDetails mapRow(ResultSet rs, int rowNum) throws SQLException {

        RimDetails rimDetails = new RimDetails();
        rimDetails.setRimId(rs.getLong("id"));
        rimDetails.setManufacturer(rs.getString("manu"));
        rimDetails.setPrice(rs.getLong("price"));

        return rimDetails;

    }
}
