package ro.develbox.sampleSpringkafka.controler;

import javax.annotation.security.RolesAllowed;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ro.develbox.sampleSpringkafka.dto.AdInfoDto;
import ro.develbox.sampleSpringkafka.service.AdInfoService;

@RolesAllowed("user")
@RestController("/adinfo")
@RequestMapping(value = "/adinfo")
public class AdInfoController {

	@Autowired
	private AdInfoService adInfoService;
	
	@PostMapping()
	public void addAdInfo(@RequestBody @Valid AdInfoDto adInfo) {
		adInfoService.process(adInfo);
	}
	
}
