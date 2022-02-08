package ro.develbox.sampleSpringkafka.config.kafka;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import ro.develbox.sampleSpringkafka.service.impl.AdDownloadServiceImpl;

@Service
public class TopicProducer {

	Logger logger = LoggerFactory.getLogger(TopicProducer.class);
	
    @Value("${topic.name.producer}")
    private String topicName;

    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    public void send(String message){
    	logger.info("Payload enviado: {}", message);
        kafkaTemplate.send(topicName, message);
    }

}
