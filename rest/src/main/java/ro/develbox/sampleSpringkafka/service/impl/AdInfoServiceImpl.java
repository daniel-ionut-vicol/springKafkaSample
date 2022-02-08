package ro.develbox.sampleSpringkafka.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import ro.develbox.sampleSpringkafka.config.kafka.TopicProducer;
import ro.develbox.sampleSpringkafka.dto.AdInfoDto;
import ro.develbox.sampleSpringkafka.service.AdInfoService;

@Service
public class AdInfoServiceImpl implements AdInfoService{

	Logger logger = LoggerFactory.getLogger(AdDownloadServiceImpl.class);
	
	@Autowired
	private TopicProducer producer;
	
	@Override
	public void addAdInfo(AdInfoDto adInfo) {
		ObjectMapper objectMapper = new ObjectMapper();
		logger.debug("Process adInfo {}", adInfo);
		try {
			producer.send(objectMapper.writeValueAsString(adInfo));
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	
}
