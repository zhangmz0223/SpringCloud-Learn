package com.LearnSpringCloud.controller;

import com.LearnSpringCloud.domain.User;
import com.LearnSpringCloud.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zhangmz
 * @version 1.0.0
 * @date 2017/09/21
 */
@RestController
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping( "/{id}" )
    public User findById(@PathVariable Long id) {
	User one = this.userRepository.findOne(id);
	return one;
    }
}