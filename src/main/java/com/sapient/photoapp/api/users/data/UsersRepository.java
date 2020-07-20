package com.sapient.photoapp.api.users.data;

import org.springframework.data.repository.CrudRepository;

//has already provided interface methods and custom methods for crud operations
public interface UsersRepository extends CrudRepository<UserEntity, Long> {

	//this method name should 
	UserEntity findByEmail(String email);
}
