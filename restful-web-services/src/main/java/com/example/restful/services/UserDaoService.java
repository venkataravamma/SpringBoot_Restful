package com.example.restful.services;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.restful.bean.User;

@Service
public class UserDaoService {

	public static int usercount=5;
	
	private static List<User> users= new ArrayList<>();
	
	static {
		users.add(new User(1,"venky",new Date()));
		users.add(new User(2,"Nag",new Date()));
		users.add(new User(3,"sujiki",new Date()));
		users.add(new User(4,"kumari",new Date()));
		users.add(new User(5,"veekshit",new Date()));
	}
	
	public List<User> findAll(){
		return users;
	}
	
	public User save(User user) {
		if(user.getId()==null) {
			user.setId(++usercount);
		}
		users.add(user);
		return user;
	}
	public User findOne(int id) {
		for(User user:users) {
			if(user.getId() ==id) {
				return user;
			}
		}
		return null;
	}
}
