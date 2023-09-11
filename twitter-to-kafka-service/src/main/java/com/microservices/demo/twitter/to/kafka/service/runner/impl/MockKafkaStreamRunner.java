package com.microservices.demo.twitter.to.kafka.service.runner.impl;
import com.microservices.demo.twitter.to.kafka.service.config.TwitterToKafkaServiceConfigData;
import com.microservices.demo.twitter.to.kafka.service.listener.TwitterKafkaStatusListener;
import com.microservices.demo.twitter.to.kafka.service.runner.StreamRunner;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import twitter4j.TwitterException;

import java.util.Random;

public class MockKafkaStreamRunner implements StreamRunner {
    private static final Logger log= LoggerFactory.getLogger(MockKafkaStreamRunner.class);
    private final TwitterToKafkaServiceConfigData twitterToKafkaServiceConfigData;
    private final TwitterKafkaStatusListener twitterKafkaStatusListener;
     private static final Random RANDOM= new Random();
     private static final String[] WORDS = new String[]{
             "Lorem",
             "ipsum",
             "ganesh",
             "shankar",
             "shambhu",
             "krishna",
             "Radha",
             "Mohan",
             "Madan",
             "Murari",
             "kevat",
             "Angad"

     };
     public MockKafkaStreamRunner(TwitterToKafkaServiceConfigData twitterToKafkaServiceConfigData,
                                  TwitterKafkaStatusListener listener){
         this.twitterKafkaStatusListener = listener;
         this.twitterToKafkaServiceConfigData = twitterToKafkaServiceConfigData;
     }
    @Override
    public void start() throws TwitterException {

    }
}
