package com.inti.formation.controllers;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.verify;

import java.io.IOException;
import java.time.LocalDate;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.inti.formation.SantUtileBackEndApplication;
import com.inti.formation.entities.Patient;
import com.inti.formation.repositories.IPatientRepositoryTest;
import com.inti.formation.services.PatientService;

@WebAppConfiguration
@RunWith(SpringRunner.class)
@SpringBootTest(classes = SantUtileBackEndApplication.class)
public class PatientControllerTest {

	@InjectMocks
	private PatientRestController patientRestController;

	@Autowired
	WebApplicationContext webApplicationContext;

	@Mock
	private PatientService patientServiceToMock;
	protected MockMvc mvc; // Rendre ce webContext comme un mock (= faux) pour une simulation
	protected String uri;

	@Before
	public void setUp() {
		mvc = MockMvcBuilders.webAppContextSetup(webApplicationContext).build();
		MockitoAnnotations.initMocks(this);
	}

	@Autowired
	private PatientService patientService;
	private static final Logger LOGGER = LoggerFactory.getLogger(IPatientRepositoryTest.class);

	public PatientControllerTest() {
		super();
		this.uri = "/user";
	}

	@Test
	public void should_use_add_when_add_for_patient_is_called() {
		LOGGER.info(
				"--------------- Executing should_use_add_when_add_for _patient_is_called test Of PatientControllerTest ---------------");
		Patient patient = new Patient();

		patientRestController.add(patient);

		verify(patientServiceToMock).add(patient);

	}

	// Methode pour vérifier le status http
	@Test
	public void verify_status() {
		LOGGER.info("-------------------------- Testing verify_status method -------------------------");
		LOGGER.info("-------------------------- Constructing Patient -------------------------");
		Patient patient1 = new Patient(1, null, "05550500550", "qsdqsqsd@qsdqs", "qsfdqs", "jean", "jean",
				LocalDate.now(), null);
		MvcResult mvcResult;
		try {
			LOGGER.info("--------------------------Serializing Utilisateur Object -------------------------");
			String inputJson = this.mapToJson(patient1);
			mvcResult = mvc.perform(MockMvcRequestBuilders.post(uri + "/adduser")
					.contentType(MediaType.APPLICATION_JSON_VALUE).content(inputJson)).andReturn();
			LOGGER.info("--------------------------Getting HTTP Status-------------------------");
			int status = mvcResult.getResponse().getStatus();
			LOGGER.info("--------------------------Verifying HTTP Status -------------------------");
			assertEquals(200, status);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	protected final String mapToJson(Object obj) throws JsonProcessingException {
		ObjectMapper objectMapper = new ObjectMapper();
		return objectMapper.writeValueAsString(obj);
	}

	protected final <T> T mapFromJson(String json, Class<T> clazz)
			throws JsonParseException, JsonMappingException, IOException {
		ObjectMapper objectMapper = new ObjectMapper();
		return objectMapper.readValue(json, clazz);
	}

}
