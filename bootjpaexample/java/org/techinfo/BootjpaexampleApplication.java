package org.techinfo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.techinfo.dao.UserRepository;
import org.techinfo.entity.User;

@SpringBootApplication
public class BootjpaexampleApplication {

	public static void main(String[] args) {
		
	 ApplicationContext context=SpringApplication.run(BootjpaexampleApplication.class, args);
	 UserRepository userRepository= context.getBean(UserRepository.class);
	 User user = new User();
	 user.setName("Shubham  kr roy");
	 user.setCity("Karnakta bangalore");
	 user.setStetus("Jr. Java Developer");
//	 User user1 = userRepository.save(user);
//	 System.out.println(user1);
	 userRepository.deleteById(402);
//	 System.out.println(user1);
	}

}
