package com.example.demo.controllerapi.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
public class Stockdto {
    private Long id;
    private String stockSymbol;
    private String stockName;
    private Double bidMin;
    private Double bidMax;
    private Double askMin;
    private Double askMax;

    public Stockdto(Long id, String stockSymbol, String stockName, Double bidMin, Double bidMax, Double askMin, Double askMax) {
        this.id = id;
        this.stockSymbol = stockSymbol;
        this.stockName = stockName;
        this.bidMin = bidMin;
        this.bidMax = bidMax;
        this.askMin = askMin;
        this.askMax = askMax;

    }
}
