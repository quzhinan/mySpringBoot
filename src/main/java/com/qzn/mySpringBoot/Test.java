package com.qzn.mySpringBoot;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.qzn.models.User;
import com.qzn.services.mybatis.UserService;

@RestController
public class Test {
	
	@Autowired
	private UserService userService;
	
    @RequestMapping(path = {"/helloSpringBoot"})
    public String HelloSpring (){
    	List<User> users = userService.queryUsers();
    	for (User user : users) {
    		System.out.println(user.getUsername());
    	}
        return "hello spring boot";
    }
}