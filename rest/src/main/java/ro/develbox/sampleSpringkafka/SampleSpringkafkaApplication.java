package ro.develbox.sampleSpringkafka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.EnableKafka;

@EnableKafka
@SpringBootApplication
public class SampleSpringkafkaApplication {

	public static void main(String[] args) {
		SpringApplication.run(SampleSpringkafkaApplication.class, args);
	}

}
