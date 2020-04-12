package org.selflearning.msa.controller;

import org.selflearning.msa.dto.UserDTO;
import org.selflearning.msa.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
	
	private static Logger LOG = LoggerFactory.getLogger(UserController.class);
	
	@Autowired
	private UserService userService;
	
	@Value("${spring.datasource.url:35.239.130.146}")
	private String mySqlUrl;
	
	@GetMapping(value = "/user/{userId}")
	public UserDTO getUser(@PathVariable String userId) {
		LOG.info("Inside user service");
		LOG.info("My SQL url {}", mySqlUrl);
		UserDTO user = userService.getuserbyId(userId);
		if (null != user) {
			LOG.info("User with user id " + userId + " is present ");
		} else {
			user = new UserDTO();
			LOG.info("User with user id " + userId + " not found");
		}
		return user;
	}

}
