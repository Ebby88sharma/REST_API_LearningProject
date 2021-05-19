package com.example.demoProjectGIT;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demoProjectGIT.model.User;
import com.example.demoProjectGIT.repo.UserRepo;

@SpringBootApplication
public class BackendSpringApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(BackendSpringApplication.class, args);
	}

	@Autowired
	private UserRepo userRepo;
	@Override
	public void run(String... args) throws Exception {
		 this.userRepo.save(new User("Ramesh","Kumar","ramu@gmail.com"));	
		 this.userRepo.save(new User("suresh","singh","singh@gmail.com"));	
		 this.userRepo.save(new User("Abhinav","Kumar","Abhinav@gmail.com"));	
		 this.userRepo.save(new User("Santosh","Sharma","sharma@gmail.com"));	
		
	}

}
