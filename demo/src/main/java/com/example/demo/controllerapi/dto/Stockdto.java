package com.example.demo.controllerapi.dto;

import lombok.NoArgsConstructor;


@NoArgsConstructor
public class Stockdto {
    private Long id;
    private String stockSymbol;
    private String stockName;
    private Double bidMin;
    private Double bidMax;
    private Double askMin;
    private Double askMax;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getStockSymbol() {
        return stockSymbol;
    }

    public void setStockSymbol(String stockSymbol) {
        this.stockSymbol = stockSymbol;
    }

    public String getStockName() {
        return stockName;
    }

    public void setStockName(String stockName) {
        this.stockName = stockName;
    }

    public Double getBidMin() {
        return bidMin;
    }

    public void setBidMin(Double bidMin) {
        this.bidMin = bidMin;
    }

    public Double getBidMax() {
        return bidMax;
    }

    public void setBidMax(Double bidMax) {
        this.bidMax = bidMax;
    }

    public Double getAskMin() {
        return askMin;
    }

    public void setAskMin(Double askMin) {
        this.askMin = askMin;
    }

    public Double getAskMax() {
        return askMax;
    }

    public void setAskMax(Double askMax) {
        this.askMax = askMax;
    }

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
