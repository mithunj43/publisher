package com.wf.publisherBT.service;


import com.wf.publisherBT.entity.Trades;
import com.wf.publisherBT.repository.TradeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProcessTrades {

    @Autowired
    TradeRepo tradeRepo;

    public String getTrades(){
        List<Trades> all = tradeRepo.findAll();
        System.out.println(all);
        return "trades";
    }

}
