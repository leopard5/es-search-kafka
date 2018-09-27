package com.yz;

import com.yz.mq.KafkaSender1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@SpringBootApplication
@EnableScheduling
public class ESKafkaApplication {
    @Autowired
    private KafkaSender1 kafkaSender1;

    public static void main(String[] args) {
        SpringApplication.run(ESKafkaApplication.class, args);
    }

//    @Scheduled(fixedRate = 1000 * 2)
//    public void testKafka() throws Exception {
//        kafkaSender1.send(LocalDateTime.now()
//                .format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")));
//    }

}
