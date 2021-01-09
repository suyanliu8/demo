package com.example.demo;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.bean.Person;
import com.example.demo.service.PersonService;

@SpringBootTest
class PersonServiceTests {

	@Autowired
	private PersonService pservice;
	@Test
	void testSort() {
		List<Person> personList = new ArrayList<>();
		personList.add(Person.builder().id("11").name("刘华").post("1004").build());
		personList.add(Person.builder().id("1").name("马化腾").post("1005,1001").build());
		personList.add(Person.builder().id("22").name("卢山").post("1007").build());
		personList.add(Person.builder().id("15").name("吴志").build());
		
		pservice.sort(personList);
		
		assertTrue(personList.get(0).getId().equals("1"));
		assertTrue(personList.get(3).getId().equals("15"));
	}

}
