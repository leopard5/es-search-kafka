package com.yz.mq;

import com.alibaba.fastjson.JSON;
import com.yz.dto.KafkaMessageDTO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.UUID;

@Component
@Slf4j
public class KafkaSender1 {
    @Autowired
    private KafkaTemplate kafkaTemplate;

    public void send(String data) {
        KafkaMessageDTO message = new KafkaMessageDTO();
        message.setId(System.currentTimeMillis());
        message.setMsg(UUID.randomUUID().toString() + "==" + data);
        message.setSendTime(new Date());
        kafkaTemplate.send("test", JSON.toJSONString(message));
    }
}
