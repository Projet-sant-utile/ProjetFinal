package com.inti.formation.repositories;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.time.LocalDate;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.inti.formation.SantUtileBackEndApplication;
import com.inti.formation.entities.Patient;
import com.inti.formation.iRepositories.IPatientRepository;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = SantUtileBackEndApplication.class)

public class IPatientRepositoryTest {
	@Autowired
	private IPatientRepository iPatientRepository;
	private static final Logger LOGGER = LoggerFactory.getLogger(IPatientRepositoryTest.class);

	@Test
	public void givenEntityRepository_whenSaving() {
		LOGGER.info("-----------------Testing givenEntityRepository_whenSaving Method ---------------------");
		System.out.println(iPatientRepository);
		Patient addedPatient = iPatientRepository.save(
				new Patient(1, null, "05550500550", "qsdqsqsd@qsdqs", "qsfdqs", "jean", "jean", LocalDate.now(), null));
		LOGGER.info("----------------- Patient saved ---------------------");
		LOGGER.info("----------------- Searching for Patient---------------------");
		Patient foundPatient = iPatientRepository.getOne(addedPatient.getId());
		LOGGER.info("----------------- Patient found ---------------------");
		LOGGER.info("----------------- Verifying Patient ---------------------");
		assertNotNull(foundPatient);
		assertEquals(addedPatient.getFirstname(), foundPatient.getFirstname());
		LOGGER.info("----------------- Patient veridied ---------------------");
	}
}
