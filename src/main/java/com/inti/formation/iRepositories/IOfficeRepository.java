package com.inti.formation.iRepositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.inti.formation.entities.Office;

@Repository
public interface IOfficeRepository extends JpaRepository<Office, Integer>{

}
