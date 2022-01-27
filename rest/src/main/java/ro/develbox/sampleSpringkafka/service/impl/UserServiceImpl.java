package ro.develbox.sampleSpringkafka.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import ro.develbox.sampleSpringkafka.dto.UserDto;
import ro.develbox.sampleSpringkafka.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	Logger logger = LoggerFactory.getLogger(AdDownloadServiceImpl.class);

	@Override
	public List<UserDto> getUsers() {
		logger.debug("get users");
		return new ArrayList<UserDto>();
	}

	@Override
	public UserDto getUser(String userId) {
		logger.debug("get user {}", userId);
		return null;
	}

	@Override
	public UserDto createUser(UserDto user) {
		logger.debug("createUser user {}", user);
		return null;
	}

	@Override
	public UserDto updateUser(UserDto user) {
		logger.debug("updateUser user {}", user);
		return null;
	}

	@Override
	public void deleteUser(String userId) {
		logger.debug("delete user {}", userId);
	}

}
