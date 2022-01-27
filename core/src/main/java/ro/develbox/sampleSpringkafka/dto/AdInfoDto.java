package ro.develbox.sampleSpringkafka.dto;

import javax.validation.constraints.NotBlank;

import lombok.Data;

@Data
public class AdInfoDto {
	@NotBlank
	private String site;
	@NotBlank
	private String xpath;
	@NotBlank
	private String content;
}
