package com.inti.formation.iRepositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.inti.formation.entities.User;

@Repository
public interface IPersonRepository extends JpaRepository<User, Integer> {

}
