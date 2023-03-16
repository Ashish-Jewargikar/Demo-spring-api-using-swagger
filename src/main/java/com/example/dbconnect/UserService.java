package com.example.dbconnect;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

@Service
public class UserService {
	
	
	@Autowired
	UserRepository userRepository;
	public String addUser(User user) {
		
		userRepository.save(user);
		return "user added succesfully";
	}
	public User getUser(int id) {
		User user = userRepository.findById(id).get();
		return user;
	}
	
	public String deleteUser(int id) {
	    userRepository.deleteById(id);
	    return "User with id " + id + " deleted successfully";
	}
}

