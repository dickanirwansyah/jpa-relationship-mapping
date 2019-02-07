package com.dicka.jpaonetoone2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;

import com.dicka.jpaonetoone2.entity.Address;
import com.dicka.jpaonetoone2.entity.Library;
import com.dicka.jpaonetoone2.repository.AddressRepository;
import com.dicka.jpaonetoone2.repository.LibraryRepository;

@SpringBootApplication
public class JpaOneToOne2Application {

	public static void main(String[] args) {
		SpringApplication.run(JpaOneToOne2Application.class, args);
	}

}

@Component
class RunnerTestData implements CommandLineRunner{

	@Autowired
	private LibraryRepository libRepo;
	
	@Autowired
	private AddressRepository addRepo;
	
	@Override
	public void run(String... args) throws Exception {
		
		addRepo.save(new Address("street 3", "zipcode 3", new Library("name 3")));
	}
}

