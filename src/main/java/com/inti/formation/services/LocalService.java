package com.inti.formation.services;

import java.util.List;

import javax.persistence.EntityNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import com.inti.formation.entities.Local;
import com.inti.formation.iRepositories.ILocalRepository;
import com.inti.formation.iServices.ILocalService;

@Service
public class LocalService extends GenericService<Local, Integer> implements ILocalService {
	@Autowired
	private ILocalRepository repo;

	@Autowired
	public void setGenericRepository(JpaRepository<Local, Integer> repo) {
		this.genericRepository = repo;
	}

	@Override
	public Local add(Local p) {
		return repo.save(p);
	}

	@Override
	public Local update(Local p) throws EntityNotFoundException {
		return repo.save(p);
	}

	@Override
	public void deleteById(Integer id_user) throws EntityNotFoundException {
		repo.deleteById(id_user);
	}

	@Override
	public Local getById(Integer id_user) throws EntityNotFoundException {
		return repo.getOne(id_user);
	}

	@Override
	public List<Local> findAll() {
		return repo.findAll();
	}

}
