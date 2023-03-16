package com.example.dbconnect;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {

	@Autowired
	UserService userService;
	@PostMapping("/addUser")
	public String addUser(@RequestBody User user) {
		
		return userService.addUser(user);
	}
	
	@GetMapping("/getUser")
	public User getUser(@RequestParam("id") int id) {
		
		return userService.getUser(id);
	}
	
	@DeleteMapping("/deleteUser")
	public String deleteUser(@RequestParam("id") int id) {
	    return userService.deleteUser(id);
	}	
}

