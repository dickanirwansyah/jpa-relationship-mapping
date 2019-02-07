package com.dicka.jpaonetoone.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dicka.jpaonetoone.entity.Library;
import com.dicka.jpaonetoone.model.RequestData;
import com.dicka.jpaonetoone.service.ILibraryService;

@RestController
@RequestMapping(value = "/api/v1/library")
public class LibraryController {

	private final Logger LOG = LoggerFactory.getLogger(LibraryController.class);
	
	@Autowired
	private ILibraryService libraryService;
	
	@GetMapping()
	public List<Library> findAll(){
		LOG.info("--> test findAll <--");
		return libraryService.findAllLibrary();
	}
	
	/** by default using request jpa body **/
	@PostMapping()
	public Library saveLibrary(@RequestBody Library library){
		LOG.info("--> test saveLibrary <--");
		return libraryService.createLibrary(library);
	}
	
	/** using custom request **/
	@PostMapping(value = "/create")
	public Library saveLibrary(@RequestBody RequestData requestData){
		return libraryService.createLibrary(requestData);
	}
}
