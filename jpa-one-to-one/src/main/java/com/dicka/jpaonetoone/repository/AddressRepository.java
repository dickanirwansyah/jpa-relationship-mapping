package com.dicka.jpaonetoone.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dicka.jpaonetoone.entity.Address;

public interface AddressRepository extends JpaRepository<Address, Integer>{

}
