package ro.develbox.sampleSpringkafka.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import ro.develbox.sampleSpringkafka.dto.AdInfo;
import ro.develbox.sampleSpringkafka.dto.AdResponseDto;
import ro.develbox.sampleSpringkafka.service.AdDownloadService;

@Service
public class AdDownloadServiceImpl implements AdDownloadService{

	Logger logger = LoggerFactory.getLogger(AdDownloadServiceImpl.class);
	
	@Override
	public AdResponseDto saveAdImg(AdInfo adInfo) {
		logger.debug("Processing {}", adInfo);
		return null;
	}

}
