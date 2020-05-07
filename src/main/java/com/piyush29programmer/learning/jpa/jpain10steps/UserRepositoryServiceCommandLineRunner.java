package com.piyush29programmer.learning.jpa.jpain10steps;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.piyush29programmer.learning.jpa.jpain10steps.entity.User;
import com.piyush29programmer.learning.jpa.jpain10steps.service.UserDAOService;
import com.piyush29programmer.learning.jpa.jpain10steps.service.UserRepository;

@Component
public class UserRepositoryServiceCommandLineRunner implements CommandLineRunner{

	private static final Logger logger = LoggerFactory.getLogger(UserRepositoryServiceCommandLineRunner.class);
	
	@Autowired
	private UserRepository userRepository;
	
	@Override
	public void run(String... args) throws Exception {
		User user = new User("Jill", "Admin 2");
		userRepository.save(user);
		logger.info("New user is created :" + user);
		
		Optional<User> userWithIdOne = userRepository.findById(1L);
		logger.info("User with id 1  :" + userWithIdOne);
		
		List<User> users = userRepository.findAll();
		logger.info("All user  :" + users);
		
		
	}
	
}
