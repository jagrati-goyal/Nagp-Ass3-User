package org.selflearning.msa.repository;

import org.selflearning.msa.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {

	
}
