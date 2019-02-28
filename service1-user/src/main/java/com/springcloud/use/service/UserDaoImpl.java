package com.springcloud.use.service;

import com.springcloud.use.dao.UserInfoDao;
import com.springcloud.use.entity.UserInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class UserDaoImpl implements UserDaoService {

	@Autowired
	private UserInfoDao userInfoDao;

	@Override
	public List<UserInfo> test(String username) {
		return userInfoDao.findOneUserInfo(username);
	}
}
