package br.com.ebrockes.springbatchexample.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.ebrockes.springbatchexample.model.User;

public interface UserRepository extends JpaRepository<User,Integer>{

}
