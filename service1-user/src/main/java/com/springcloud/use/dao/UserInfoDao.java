package com.springcloud.use.dao;


import org.springframework.stereotype.Repository;
import com.springcloud.use.entity.UserInfo;

import java.util.List;

@Repository
public interface UserInfoDao {

	List<UserInfo> findOneUserInfo(String username);
}
