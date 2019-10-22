package com.inti.formation.iServices;

import java.util.List;

import javax.persistence.EntityNotFoundException;

import org.springframework.stereotype.Service;

public interface IGenericService<G, I> {
	
	public G add(G g);

	public G update(G g)
		throws EntityNotFoundException;
	
	public void deleteById(I id)
		throws EntityNotFoundException;

	public G getById(I id)
		throws EntityNotFoundException;

	public List<G> findAll();

}
