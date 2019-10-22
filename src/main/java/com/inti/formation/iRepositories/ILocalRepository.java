package com.inti.formation.iRepositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.inti.formation.entities.Local;

@Repository
public interface ILocalRepository extends JpaRepository<Local, Integer> {

}
