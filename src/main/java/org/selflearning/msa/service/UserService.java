package org.selflearning.msa.service;

import org.selflearning.msa.dto.UserDTO;
import org.selflearning.msa.model.User;

public interface UserService {

	public UserDTO getuserbyId(String userId);
}
