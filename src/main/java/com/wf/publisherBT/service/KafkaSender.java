package com.wf.publisherBT.service;


import com.wf.publisherBT.entity.Trade;
import com.wf.publisherBT.entity.Trades;
import com.wf.publisherBT.repository.TradeRepo;
import org.jetbrains.annotations.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class KafkaSender {

    @Autowired
    private TradeRepo tradeRepo;



    @Autowired
    private KafkaTemplate<String, Trade> kafkaTemplate;

    String kafkaTopic = "tradeData7";

    public void send() {
        List<Trades> all = tradeRepo.findAll();

        all.forEach(trades -> {
            Trade trade = getTrade(trades);
            kafkaTemplate.send(kafkaTopic, trade.getTradeId(),trade);
        });

    }

    @NotNull
    private Trade getTrade(Trades trades) {
        Trade trade = new Trade();
        trade.setTradeId(trades.getTradeId());
        trade.setInitialIndexLevel(trades.getInitialIndexLevel());
        trade.setOutputDataFile(trades.getOutputDataFile());
        trade.setStrikePrice(trades.getStrikePrice());
        trade.setTimeToMaturity(trades.getTimeToMaturity());
        return trade;
    }
}
