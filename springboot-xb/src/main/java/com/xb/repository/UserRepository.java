package com.xb.repository;

import com.xb.entity.RBAC.UserInfo;
import com.xb.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

    User findById(long id);

    Long deleteById(Long id);


}