package com.inti.formation.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public abstract interface IGenericRepository <G, I> extends JpaRepository<G, I> {

}
