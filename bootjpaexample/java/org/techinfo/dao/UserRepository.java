package org.techinfo.dao;

import org.springframework.data.repository.CrudRepository;
import org.techinfo.entity.User;

public interface UserRepository extends CrudRepository<User, Integer>{

}
