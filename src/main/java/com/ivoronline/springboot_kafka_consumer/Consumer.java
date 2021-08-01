package com.ivoronline.springboot_kafka_consumer;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;
import java.io.IOException;

@Service
public class Consumer {

  @KafkaListener(topics = "Topic1", groupId = "group_id")
  public void consume(String message) throws IOException {
    System.out.println("Received: " + message);
  }

}