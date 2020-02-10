package com.sages.templates;

import org.apache.kafka.clients.consumer.KafkaConsumer;

import java.util.Properties;

public class SimpleConsumer {
    public static void main(String[] args) {

        String bootstrapServers = "127.0.0.1:9092";

        Properties properties = new Properties();
        // TODO set minimum required properties

        KafkaConsumer<String, String> consumer = new KafkaConsumer<String, String>(properties);

        // TODO subscribe to a topic

        while (true) {
            // TODO poll records, for each print key and value, offset and partition
        }

    }
}
