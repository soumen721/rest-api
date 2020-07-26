package com.rest.api.service;

import com.rest.api.model.Header;
import com.rest.api.model.SpecDigit;
import com.rest.api.model.Response;
import com.rest.api.model.SpecDigitResponse;
import com.rest.api.repository.VinRepositoryImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.*;

@Service
public class VinServiceImpl {

    @Autowired
    private VinRepositoryImpl vinRepository;

    public Optional<Response> findById(String vinId) {

        try {
            List<SpecDigit> specDigits = vinRepository.findByVinId(vinId);

            if (specDigits != null && !specDigits.isEmpty()) {
                Response response = new Response();
                //set Header if any for now TimeStamp
                Header header = new Header();
                header.setTimeStamp(LocalDateTime.now().toString());
                response.setHeader(header);
                //set actual response body
                SpecDigitResponse specDigitResponse = new SpecDigitResponse();
                List<SpecDigit> specDigits1 = new ArrayList<>();

                specDigitResponse.setVin(specDigits.get(0).getVin());
                specDigitResponse.setModelNumber(specDigits.get(0).getModelNumber());
                specDigitResponse.setModelYear(specDigits.get(0).getModelYear());
                specDigitResponse.setSpecDetails(specDigits);

                response.setResponse(specDigitResponse);
                return Optional.of(response);
            } else {
                return Optional.empty();
            }
        } catch (EmptyResultDataAccessException e) {

            return Optional.empty();
        }
    }
}
