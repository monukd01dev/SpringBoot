package com.springdatajpa;

import com.springdatajpa.entity.User;
import com.springdatajpa.repository.UserRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.Iterator;
import java.util.List;

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

		//saving user
		//save(entity) and saveAll(iterable)
//			User user1 = userRepository.save(user);
//			Iterable<User> userList = List.of(new User("dummy1","city1","domain1"),
//					new User("dummy2","city2","domain2"),
//					new User("dummy3","city3","domain3"));
//
//			userList.forEach(user2 -> {
//				System.out.println(user2);
//			});
//		saving all
//			Iterable<User> savedList = userRepository.saveAll(userList);
//			savedList.forEach(System.out::println);

//		Deleting by id
//		1. delete(entities)
//		2. deleteAll()
//		3. deleteAll(iterable<entity>)
//		4. deleteById(IntegerId)

//			List.of(1,2,52,102,152,202,252).forEach(userRepository::deleteById);

//		Getting Data
//		1. findById(IntegerId) return optional
//		2. findAll() return iterable

//		getting data of user from specific user list
//			List.of(253,254,255).forEach(user1 ->{
//				User temp = userRepository.findById(user1).get();
//				temp.setCity("Delhi");
//				userRepository.save(temp);
//			});

//		userRepository.deleteAllById();

//		using custom finder method which I have created
//		userRepository.findByName("dummy1").forEach(System.out::println);
//		userRepository.findByNameStartingWith("dummy").forEach(System.out::println);

		//jpql
		userRepository.getAllUser().forEach(System.out::println);

//		userRepository.updateCity("Andhra Pradesh",255);
		userRepository.deleteByCity("Andhra Pradesh");

//		userRepository.getAllUser().forEach(System.out::println);

		//native
		System.out.println("===========================================================");

		userRepository.nativeGetAll().forEach(System.out::println);

	}

}
