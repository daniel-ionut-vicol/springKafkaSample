package ro.develbox.sampleSpringkafka.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import ro.develbox.sampleSpringkafka.dto.AdInfo;

@RestController("/adinfo")
public class AdInfoController {

	@Autowired
	private AdInfoService adInfoService;
	
	@PostMapping()
	public void addAdInfo(@RequestBody AdInfo adInfo) {
		adInfoService.process(adInfo);
	}
	
}
