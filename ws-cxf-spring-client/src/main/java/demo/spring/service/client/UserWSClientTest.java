package demo.spring.service.client;

import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import demo.spring.service.User;
import demo.spring.service.UserService;

public class UserWSClientTest {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext(
				new String[] { "applicationContext-client.xml" });
		UserService userService = (UserService) classPathXmlApplicationContext.getBean("userClient");
		User user = userService.getUserById(1000);
		System.out.println(user.getId());
		System.out.println(user.getName());
		System.out.println(user.getAge());
		System.out.println("-------------------");
		List<User> allUsers = userService.getAllUsers();
		for (User u : allUsers) {
			System.out.println(u.getId());
			System.out.println(u.getName());
			System.out.println(u.getAge());
			System.out.println("-------------------");
		}
	}
}
