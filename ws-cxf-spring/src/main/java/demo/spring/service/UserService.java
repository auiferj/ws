package demo.spring.service;

import java.util.List;

import javax.jws.WebService;

import demo.spring.bean.User;

@WebService
public interface UserService {
	User getUserById(long id);

	List<User> getAllUsers();
}
