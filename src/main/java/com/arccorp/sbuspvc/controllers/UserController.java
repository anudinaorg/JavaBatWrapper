package com.arccorp.sbuspvc.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.arccorp.sbuspvc.model.User;
import com.arccorp.sbuspvc.service.UserService;

@RestController
public class UserController {
	@Autowired
    UserService userService; 
	

	@RequestMapping(value = "/user/", method = RequestMethod.GET)
    public ResponseEntity<List<User>> listAllUsers() {
        List<User> users = userService.findAllUsers();
        if(users.isEmpty()){
            return new ResponseEntity<List<User>>(HttpStatus.NO_CONTENT);//You many decide to return HttpStatus.NOT_FOUND
        }
        ResponseEntity<List<User>> re = new ResponseEntity<List<User>>(users,HttpStatus.OK);
        System.out.println(re.getHeaders());
        return re;
    }
}
