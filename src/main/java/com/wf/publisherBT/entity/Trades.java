package com.wf.publisherBT.entity;

import javax.persistence.*;

@Entity
@Table(name = "trade_input_details")

public class Trades {

    @Id
    @Column(name = "tradeId")
    public String tradeId;

    @Column(name = "timeToMaturity")
    public int timeToMaturity;

    @Column(name = "strikePrice")
    public int strikePrice;

    @Column(name = "initialIndexLevel")
    public int initialIndexLevel;

    @Column(name = "outputDataFile")
    public String outputDataFile;

    public String getTradeId() {
        return tradeId;
    }

    public void setTradeId(String tradeId) {
        this.tradeId = tradeId;
    }

    public int getTimeToMaturity() {
        return timeToMaturity;
    }

    public void setTimeToMaturity(int timeToMaturity) {
        this.timeToMaturity = timeToMaturity;
    }

    public int getStrikePrice() {
        return strikePrice;
    }

    public void setStrikePrice(int strikePrice) {
        this.strikePrice = strikePrice;
    }

    public int getInitialIndexLevel() {
        return initialIndexLevel;
    }

    public void setInitialIndexLevel(int initialIndexLevel) {
        this.initialIndexLevel = initialIndexLevel;
    }

    public String getOutputDataFile() {
        return outputDataFile;
    }

    public void setOutputDataFile(String outputDataFile) {
        this.outputDataFile = outputDataFile;
    }

    public Trades() {
    }

    @Override
    public String toString() {
        return "Trades{" +
                "tradeId='" + tradeId + '\'' +
                ", timeToMaturity=" + timeToMaturity +
                ", strikePrice=" + strikePrice +
                ", initialIndexLevel=" + initialIndexLevel +
                ", outputDataFile=" + outputDataFile +
                '}';
    }
}
