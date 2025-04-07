package com.liu.springboot_rui.repository;

import com.liu.springboot_rui.pojo.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository   // spring bean
public interface UserRepository extends CrudRepository<User,Integer> {

}
