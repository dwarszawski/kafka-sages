package com.sages.templates;

import org.apache.kafka.clients.producer.KafkaProducer;

import java.util.Properties;

public class SimpleProducer {

    public static void main(String[] args) {

        String bootstrapServers = "127.0.0.1:9092";

        Properties properties = new Properties();
        // TODO setup required properties

        KafkaProducer<String, String> producer = new KafkaProducer<String, String>(properties);
        // TODO create record and send it to kafka

        producer.flush();
        producer.close();

    }
}
