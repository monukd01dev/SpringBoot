package com.springdatajpa;

import com.springdatajpa.entity.User;
import com.springdatajpa.repository.UserRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringDataJpaApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringDataJpaApplication.class, args);
		UserRepository userRepository = context.getBean(UserRepository.class);

		//creating user
		User user = new User();
		user.setName("Monu Kumar");
		user.setCity("Delhi");
		user.setDomain("Java Developer");

		User user1 = userRepository.save(user);

		System.out.println(user1);


	}

}
