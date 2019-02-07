package com.dicka.jpaonetoone.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dicka.jpaonetoone.entity.Address;
import com.dicka.jpaonetoone.entity.Library;
import com.dicka.jpaonetoone.model.RequestData;
import com.dicka.jpaonetoone.repository.AddressRepository;
import com.dicka.jpaonetoone.repository.LibraryRepository;

@Service
public class LibraryService implements ILibraryService{

	@Autowired
	private LibraryRepository libRepo;
	
	@Autowired
	private AddressRepository addRepo;
	
	@Override
	public List<Library> findAllLibrary() {
		List<Library> libs = new ArrayList<Library>();
		for (Library library : libRepo.findAll())
			libs.add(library);
		return libs;
	}

	@Override
	public Library createLibrary(Library library) {
		return libRepo.save(library);
	}

	@Override
	public Library findOneLibrary(Integer libraryId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Library createLibrary(RequestData data) {
		Library library = new Library();
		library.setName(data.getLibraryName());
		
		Address address = new Address();
		address.setStreet(data.getAddresStreet());
		address.setZipCode(data.getAddresZipcode());
		
	
		address.setLibrary(library);
		library.setAddress(address);
	
		
		libRepo.save(library);
		addRepo.save(address);
		
		return library;
	}

}
