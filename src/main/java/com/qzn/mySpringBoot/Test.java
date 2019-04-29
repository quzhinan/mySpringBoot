package com.qzn.mySpringBoot;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.qzn.models.User;
import com.qzn.services.mybatis.UserService;

@Controller
public class Test {
	
	@Autowired
	private UserService userService;
	
    @RequestMapping(path = {"/helloSpringBoot"}, method = RequestMethod.GET)
    public String HelloSpring (Model model) throws Exception {
    	List<User> users = userService.queryUsers();
    	ObjectMapper mapper = new ObjectMapper();
    	model.addAttribute("users", mapper.writeValueAsString(users));
        return "hello";
    }
    
    @RequestMapping(path = {"/getUsers"}, method = RequestMethod.GET)
    @ResponseBody
    public List<User> getUsers () throws Exception {
    	List<User> users = userService.queryUsers();
        return users;
    }
}