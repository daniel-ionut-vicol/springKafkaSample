package ro.develbox.sampleSpringkafka.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import ro.develbox.sampleSpringkafka.dto.AdInfoDto;
import ro.develbox.sampleSpringkafka.service.AdInfoService;

@Service
public class AdInfoServiceImpl implements AdInfoService{

	Logger logger = LoggerFactory.getLogger(AdDownloadServiceImpl.class);
	
	@Override
	public void process(AdInfoDto adInfo) {
		logger.debug("Process adInfo {}", adInfo);
		//TODO put to queue topic
	}

	
}
