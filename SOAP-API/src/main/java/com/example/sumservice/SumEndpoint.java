package com.example.sumservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

@Endpoint
public class SumEndpoint {
    private static final String NAMESPACE_URI = "http://example.com/sumservice";

    private final SumRepository sumRepository;

    @Autowired
    public SumEndpoint(SumRepository sumRepository) {
        this.sumRepository = sumRepository;
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "SumRequest")
    @ResponsePayload
    public SumResponse calculateSum(@RequestPayload SumRequest request) {
        SumResponse response = new SumResponse();
        response.setResult(sumRepository.calculateSum(request.getNumber1(), request.getNumber2()));
        return response;
    }
}
