package ro.develbox.sampleSpringkafka.dto;

import javax.validation.constraints.NotBlank;

import lombok.Data;

@Data
public class AdResponseDto {
	@NotBlank
	private String message;
	private boolean error;
}
