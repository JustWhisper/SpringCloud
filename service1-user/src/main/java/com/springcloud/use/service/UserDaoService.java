package com.springcloud.use.service;

import com.springcloud.use.entity.UserInfo;

import java.util.List;

public interface UserDaoService {
	List<UserInfo> test(String username);
}
