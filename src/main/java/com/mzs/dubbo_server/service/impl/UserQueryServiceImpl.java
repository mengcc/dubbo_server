/**
 * All rights Reserved, Designed By tydic.com
 * @Author mengzs
 * @Date 2017年11月13日 下午1:37:49
 */
package com.mzs.dubbo_server.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.mzs.dubbo_server.bean.User;
import com.mzs.dubbo_server.service.UserQueryService;

/**
 * @Author mengzs 
 * @Date 2017年11月13日
 */
@Service("userQueryService")
public class UserQueryServiceImpl implements UserQueryService {

	/* (non-Javadoc)
	 * @see com.mzs.dubbo_server.service.UserQueryService#findAllUser()
	 */
	@Override
	public List<User> findAllUser() {
		List<User> users = new ArrayList<User>();
		users.add(new User("mzs", "123456"));
		users.add(new User("wyl", "456123"));
		return users;
	}

	/* (non-Javadoc)
	 * @see com.mzs.dubbo_server.service.UserQueryService#findByUsername(java.lang.String)
	 */
	@Override
	public User findByUsername(String username) {
		return new User(username, "123456");
	}

}
