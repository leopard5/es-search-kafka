package com.yz.mq;

import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class KafkaReceived1 {

    @KafkaListener(topics = {"test"})
    public void listen(String message) {
        log.info("message =" + message);
    }
}
