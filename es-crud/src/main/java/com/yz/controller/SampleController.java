package com.yz.controller;

import com.yz.mq.KafkaSender1;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class SampleController {
    private static final Logger LOGGER = LoggerFactory.getLogger(SampleController.class);

    @Autowired
    private KafkaSender1 kafkaSender1;

    @RequestMapping("/send")
    String send() {
        kafkaSender1.send("1111111");
        return "success";
    }
}
