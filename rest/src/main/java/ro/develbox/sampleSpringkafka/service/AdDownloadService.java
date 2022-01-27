package ro.develbox.sampleSpringkafka.service;

import ro.develbox.sampleSpringkafka.dto.AdInfo;
import ro.develbox.sampleSpringkafka.dto.AdResponseDto;

public interface AdDownloadService {
	public AdResponseDto saveAdImg(AdInfo adInfo);
}
