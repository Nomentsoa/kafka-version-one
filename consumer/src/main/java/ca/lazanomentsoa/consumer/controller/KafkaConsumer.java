package ca.lazanomentsoa.consumer.controller;

import ca.lazanomentsoa.consumer.model.RiderLocation;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaConsumer {

    @KafkaListener(topics = "my-topic", groupId = "my-new-group")
    public void listen(String message){
        System.out.println("Message received listener: " + message);
    }

    @KafkaListener(topics = "my-topic", groupId = "my-new-group")
    public void listen1(String message){
        System.out.println("Message received listener1: " + message);
    }

    @KafkaListener(topics = "my-new-topic-2", groupId = "my-new-group-rider")
    public void listenerRiderLocation(RiderLocation riderLocation){
        System.out.println("Message received listenerRider: " + riderLocation.toString());
    }

}
