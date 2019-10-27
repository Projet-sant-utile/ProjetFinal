package com.inti.formation.iRepositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.inti.formation.entities.User;

@Repository
public interface IUserRepository extends JpaRepository<User, Integer> {

	 List<User> findByEmail(String email);
	
}
