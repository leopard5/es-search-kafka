package com.yz.dto;

import lombok.Data;

import java.util.Date;

@Data
public class KafkaMessageDTO {
    private Long id;
    private String msg;
    private Date sendTime;
}
