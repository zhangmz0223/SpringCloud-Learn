package com.microservice.provider.repository;

import com.microservice.provider.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author zhangmz
 * @version 1.0.0
 * @date 2017/09/21
 */
@Repository
public interface UserRepository extends JpaRepository<User, Long > {}

