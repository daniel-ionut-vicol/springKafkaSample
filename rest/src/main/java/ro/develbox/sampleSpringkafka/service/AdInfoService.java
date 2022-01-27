package ro.develbox.sampleSpringkafka.service;

import ro.develbox.sampleSpringkafka.dto.AdInfo;

public interface AdInfoService {

	public void process(AdInfo adInfo);
	
}
