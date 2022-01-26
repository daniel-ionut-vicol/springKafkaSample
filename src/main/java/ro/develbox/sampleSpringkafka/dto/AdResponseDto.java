package ro.develbox.sampleSpringkafka.dto;

import lombok.Data;

@Data
public class AdResponseDto {
	private String message;
	private boolean error;
}
