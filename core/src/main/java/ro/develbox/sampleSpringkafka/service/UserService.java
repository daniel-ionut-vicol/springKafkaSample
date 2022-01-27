package ro.develbox.sampleSpringkafka.service;

import java.util.List;

import ro.develbox.sampleSpringkafka.dto.UserDto;

public interface UserService {
	public List<UserDto> getUsers();
	public UserDto getUser(String userId);
	public UserDto createUser(UserDto user);
	public UserDto updateUser(UserDto user);
	public void deleteUser(String userId);
}
