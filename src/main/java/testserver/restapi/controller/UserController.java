package testserver.restapi.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import testserver.restapi.mapper.categoriesMapper;
import testserver.restapi.model.categories;
import testserver.restapi.model.categoriesExample;
import testserver.restapi.module.User;

@RestController
public class UserController {
	
	private List<User> users= new ArrayList<User>();
	
	@Autowired
	categoriesMapper cateMapper;
	
//	categoriesExample example= new categoriesExample();
//	List<categories> list= cateMapper.selectByExample(example);
	
	@PostMapping("/user")
	public User create(@RequestBody User user) {
		users.add(user);
		return user;
	}
	
	@GetMapping("/users")
	public List<User> getAllUser() {
		return users;
	}
	
	@GetMapping("/categories")
	public  List<categories> getAll(){
		
		return cateMapper.getAllCategory();
	}
}
