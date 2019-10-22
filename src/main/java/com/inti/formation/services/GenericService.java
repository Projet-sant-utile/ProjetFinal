package com.inti.formation.services;

import java.util.List;

import javax.persistence.EntityExistsException;
import javax.persistence.EntityNotFoundException;

import org.springframework.data.jpa.repository.JpaRepository;

import com.inti.formation.iServices.IGenericService;

public abstract class GenericService <G, I> implements IGenericService<G, I> {

	protected JpaRepository<G, I> genericRepository;
	
	@Override
	public G add(G g)
		throws EntityExistsException
	{
		boolean personExists = genericRepository.existsById(g.getById());
		if ( personExists )
			throw new EntityExistsException();
		return genericRepository.save(g);
	}

	@Override
	public G update(G g)
		throws EntityNotFoundException
	{
		boolean userExists = genericRepository.existsById(g.getId());
		if ( !userExists )
			throw new EntityNotFoundException();
		return genericRepository.save(g);
	}

	@Override
	public G getById(I id)
		throws EntityNotFoundException
	{
		boolean userExists = genericRepository.existsById(id);
		if ( !userExists )
			throw new EntityNotFoundException();
		return genericRepository.getOne(id);
	}

	@Override
	public void deleteById(I id)
		throws EntityNotFoundException
	{
		boolean userExists = genericRepository.existsById(id);
		if ( !userExists )
			throw new EntityNotFoundException();
		genericRepository.deleteById(id);
	}

	@Override
	public List<G> findAll()
	{
		return genericRepository.findAll();
	}

	
}
