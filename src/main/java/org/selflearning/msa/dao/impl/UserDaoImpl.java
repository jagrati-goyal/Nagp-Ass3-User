package org.selflearning.msa.dao.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.selflearning.msa.dao.UserDao;
import org.selflearning.msa.dto.UserDTO;
import org.selflearning.msa.model.User;
import org.selflearning.msa.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserDaoImpl implements UserDao {
	
	@Autowired
	private UserRepository userRepository;
	
	public UserDTO getUserById(String userId) {
		int id = Integer.parseInt(userId);
		Optional<User> result = userRepository.findById(id);
		UserDTO userDto = null;
		if (result.isPresent()) {
			User user = result.get();
			userDto = new UserDTO();
			userDto.setName(user.getName());
			userDto.setAge(user.getAge());
			userDto.setEmail(user.getEmail());
		}
		return userDto;
	}
}
