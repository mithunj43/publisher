package com.wf.publisherBT.controller;


import com.wf.publisherBT.service.KafkaSender;
import com.wf.publisherBT.service.ProcessTrades;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.List;


@RestController
public class AddressController {

    @Autowired
    ProcessTrades processTrades;

    @Autowired
    KafkaSender kafkaSender;



    @GetMapping("save")
    public String setAddress() throws Exception{
        return processTrades.getTrades();
    }



    @GetMapping(value = "/producer")
    public String producer() {

        kafkaSender.send();

        return "Message sent to the Kafka Topic java_in_use_topic Successfully";
    }

}
