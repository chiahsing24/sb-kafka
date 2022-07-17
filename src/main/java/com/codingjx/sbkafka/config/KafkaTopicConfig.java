package com.codingjx.sbkafka.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;


@Configuration
public class KafkaTopicConfig {

    @Bean
    public NewTopic javaguidesTopic() {
        return TopicBuilder.name("javaguide")
                .build();
    }

    @Bean
    public NewTopic javaguidesJsonTopic() {
        return TopicBuilder.name("javaguide_json")
                .build();
    }
}
