package ca.lazanomentsoa.producer.controller;

import ca.lazanomentsoa.producer.model.RiderLocation;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class KafkaProducer {

    private final KafkaTemplate<String, RiderLocation> kafkaTemplate;
    private static final String topic = "my-new-topic-2";

    public KafkaProducer(KafkaTemplate<String, RiderLocation> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    @PostMapping("/send")
    public String sendMessage(@RequestParam String message){
        RiderLocation location = new RiderLocation("RiderLazanomentoa", 23.45, 77.44);
        kafkaTemplate.send(topic, location);

        return "Message sent: " + location.toString();
    }
}
