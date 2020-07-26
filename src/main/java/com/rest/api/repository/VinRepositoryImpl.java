package com.rest.api.repository;

import com.rest.api.model.SpecDigit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

@Repository
public class VinRepositoryImpl {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public List<SpecDigit> findByVinId(String vinId) {

        try {
            String sql = "select * from SPEC_OPTION_TL where VIN = ? ";

            List<SpecDigit> vins = new ArrayList<>();
            List<Map<String, Object>> rows = jdbcTemplate.queryForList(sql, new Object[]{vinId});

            for (Map row : rows) {

                SpecDigit specDigit = new SpecDigit();
                specDigit.setVin((String) row.get("VIN"));
                specDigit.setModelNumber((String) row.get("model_number"));
                specDigit.setModelYear((String) row.get("Model_year"));

                specDigit.setSpecCode((String) row.get("SPEC_CODE"));
                specDigit.setSpecDigit((String) row.get("SPEC_DIGIT"));
                specDigit.setSpecDigitDesc((String) row.get("SPEC_DIGIT_DESC"));

                vins.add(specDigit);
            }

            return vins;

        } catch (EmptyResultDataAccessException e) {
            return Collections.emptyList();
        }

    }

}
