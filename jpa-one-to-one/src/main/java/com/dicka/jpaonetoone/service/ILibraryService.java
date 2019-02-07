package com.dicka.jpaonetoone.service;

import java.util.List;

import com.dicka.jpaonetoone.entity.Library;
import com.dicka.jpaonetoone.model.RequestData;

public interface ILibraryService {

	List<Library> findAllLibrary();
	Library createLibrary(Library library);
	Library createLibrary(RequestData data);
	Library findOneLibrary(Integer libraryId);
}
