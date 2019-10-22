package com.example.shardingjdbc;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
	@Autowired
	private JdbcTemplate jdbcTemplate;
	private ArrayList<UserPO> userList = new ArrayList<UserPO>();

	@PostConstruct
	private void setData() {
		Date date = new Date();
		userList.add(new UserPO("659841", "老王", 22, 1, date));
		userList.add(new UserPO("359846", "老张", 33, 1, date));
		userList.add(new UserPO("244795", "老沈", 18, 1, date));
		userList.add(new UserPO("268974", "老郭", 55, 2, date));
		userList.add(new UserPO("885416", "老罗", 18, 2, date));
		userList.add(new UserPO("879567", "老刘", 25, 2, date));
	}

	@GetMapping("addUser")
	public Object addUser() {
		String sql = "insert into t_user(id_number, name, age, gender, birth_date) values (?,?,?,?,?)";
		for (UserPO user : userList) {
			jdbcTemplate.update(sql, user.getIdNumber(), user.getName(), user.getAge(),
					user.getGender(), user.getBirthDate());
		}
		return "success";
	}

	@GetMapping("getAllUser")
	public Object getUserList() {
		String sql = "select * from t_user";
		List<Map<String, Object>> userMapList = jdbcTemplate.queryForList(sql);
		return userMapList;
	}
}
