package com.dicka.jpaonetoone;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;

import com.dicka.jpaonetoone.entity.Address;
import com.dicka.jpaonetoone.entity.Library;
import com.dicka.jpaonetoone.repository.LibraryRepository;

@SpringBootApplication
public class JpaOneToOneApplication {

	public static void main(String[] args) {
		SpringApplication.run(JpaOneToOneApplication.class, args);
	}

}

@Component
class RunnerClassData implements CommandLineRunner {

	@Autowired
	private LibraryRepository libraryRepository;
	
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		libraryRepository.save(new Library("name example 1", new Address("street 1", "zip 1")));
		libraryRepository.save(new Library("name example 2", new Address("street 2", "zip 2")));
	}
}


