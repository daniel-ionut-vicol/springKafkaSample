package ro.develbox.sampleSpringkafka.controler;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import ro.develbox.sampleSpringkafka.dto.UserDto;
import ro.develbox.sampleSpringkafka.service.UserService;

@RestController("/user")
@RequestMapping(value = "/user")
public class UserController {

	@Autowired
	private UserService userService;

	@GetMapping
	public List<UserDto> getUsers() {
		return userService.getUsers();
	}

	@GetMapping("{userId}")
	public UserDto getUser(@RequestParam(required = true) String userId) {
		return userService.getUser(userId);
	}

	@PutMapping
	public UserDto createUser(@RequestBody @Valid UserDto userDto) {
		return userService.createUser(userDto);
	}

	@PostMapping("{userId}")
	public UserDto updateUser(@RequestParam(required = true) String userId, @RequestBody @Valid UserDto userDto) {
		userDto.setUserId(userId);
		return userService.updateUser(userDto);
	}

	@DeleteMapping("{userId}")
	public void deleteUser(@RequestParam(required = true) String userId) {
		userService.deleteUser(userId);
	}
}
