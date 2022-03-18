package com.example.demo.controllerapi.service;


import com.example.demo.controllerapi.dto.Stockdto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.reactive.function.client.WebClient;

import reactor.core.publisher.Mono;
@Service 
public class StockService {
    @Autowired
    private WebClient webClient;
    public Stockdto[] getAllStocks(@RequestHeader("Authorization") String token) {

    Mono<Stockdto[]> monoStock = this.webClient
            .method(HttpMethod.GET)
            .uri("/stocks")
            .header(HttpHeaders.AUTHORIZATION, token)
            .retrieve()
            .bodyToMono(Stockdto[].class);

    return monoStock.block();

}
}
