package com.springcloud.use.controller;

import com.springcloud.use.dao.UserInfoDao;
import com.springcloud.use.entity.UserInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.List;

@RestController
public class ClientRest {

	@Autowired
	UserInfoDao userInfoDao;

	@RequestMapping("/test")
	public List<UserInfo> test()throws IOException{
		return userInfoDao.findOneUserInfo("admin");
	}
}
