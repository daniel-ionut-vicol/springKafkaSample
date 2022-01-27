package ro.develbox.sampleSpringkafka.dto;

import javax.validation.constraints.NotBlank;

import lombok.Data;

@Data
public class UserDto {

	private String userId;
	@NotBlank
	private String email;
	@NotBlank
	private String userName;
	@NotBlank
	private String firstName;
	@NotBlank
	private String lastName;
}
