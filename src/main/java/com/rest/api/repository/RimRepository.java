package com.rest.api.repository;

import com.rest.api.model.RimDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;

@Repository
public class RimRepository {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public Optional<RimDetails> findById(Long rimId) {

        try {
            String sql = "SELECT * FROM rim_details WHERE ID = ?";
            RimDetails details = jdbcTemplate.queryForObject(sql, new Object[]{rimId}, new RimRowMapper());

            return Optional.ofNullable(details);
        } catch (EmptyResultDataAccessException e) {
            return Optional.empty();
        }

    }

    /*public RimDetails findByRimDetailsId3(Long rimId) {

        String sql = "SELECT * FROM rim_details WHERE ID = ?";

        return jdbcTemplate.queryForObject(sql, new Object[]{rimId}, (rs, rowNum) ->
                new RimDetails(
                        rs.getLong("id"),
                        rs.getString("name"),
                        rs.getInt("age"),
                        rs.getTimestamp("created_date").toLocalDateTime()
                ));

    }*/

    public List<RimDetails> findAll() {

        String sql = "SELECT * FROM rim_details";

        List<RimDetails> rims = new ArrayList<>();

        List<Map<String, Object>> rows = jdbcTemplate.queryForList(sql);

        for (Map row : rows) {
            RimDetails obj = new RimDetails();

            obj.setRimId(((Integer) row.get("id")).longValue());
            obj.setManufacturer((String) row.get("manu"));
            obj.setPrice(((BigDecimal) row.get("price")).longValue());
            rims.add(obj);
        }

        return rims;
    }

}
