package ro.develbox.sampleSpringkafka.service;

import ro.develbox.sampleSpringkafka.dto.AdInfoDto;
import ro.develbox.sampleSpringkafka.dto.AdResponseDto;

public interface AdDownloadService {
	public AdResponseDto saveAdImg(AdInfoDto adInfo);
}
