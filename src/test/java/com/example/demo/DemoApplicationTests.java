package com.example.demo;

import com.example.demo.model.User;
import com.example.demo.service.UserService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.assertEquals;
import com.example.demo.dao.*;

@SpringBootTest
class DemoApplicationTests {

	private final UserService userService;
	DemoApplicationTests(UserService userService) {
		this.userService = userService;
	}


	@Test
	void addUserTest(){ 
		String name = "Phindile";

		assertEquals(name,userService.addUser(User.getName(),User.getSurname()));
	}

	@Test
	void removeUser(long Id){
		long idNumber = 88112834480991L;
		assertEquals(idNumber,userService.removeUser(User.getId()));
	}


	@Test
	void getUserTest(long Id){
		long idNumber = 88112834480991L;
		assertEquals(idNumber,userService.getUser(User.getId()));

	}



}
