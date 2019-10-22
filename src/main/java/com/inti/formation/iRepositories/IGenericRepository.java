package com.inti.formation.iRepositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IGenericRepository<G, I> extends JpaRepository<G, I> {

}
