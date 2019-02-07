package com.dicka.jpaonetoone2.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dicka.jpaonetoone2.entity.Address;

public interface AddressRepository extends JpaRepository<Address, Integer>{

}
