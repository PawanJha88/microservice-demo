package com.microservices.demo.twitter.to.kafka.service;

import com.microservices.demo.twitter.to.kafka.service.config.TwitterToKafkaServiceConfigData;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;


@SpringBootApplication
public class TwiteerTokafkaServiceApplication implements CommandLineRunner {

    private static final Logger LOG = LoggerFactory.getLogger(TwiteerTokafkaServiceApplication.class);
    private final TwitterToKafkaServiceConfigData twitterToKafkaServiceConfigData;

    public TwiteerTokafkaServiceApplication(TwitterToKafkaServiceConfigData twitterToKafkaServiceConfigData){
        this.twitterToKafkaServiceConfigData = twitterToKafkaServiceConfigData;
    }
    public static void main(String[] args) {
        SpringApplication.run(TwiteerTokafkaServiceApplication.class,args);
    }

    @Override
    public void run(String... args) throws Exception {
        LOG.info("App starts ...");
        LOG.info(Arrays.toString(twitterToKafkaServiceConfigData.getTwitterKeywords().toArray(new String[]{})));
        LOG.info(twitterToKafkaServiceConfigData.getWelcomeMessage());
    }
}
