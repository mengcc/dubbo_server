/**
 * All rights Reserved, Designed By tydic.com
 * @Author mengzs
 * @Date 2017年10月23日 下午3:02:03
 */
package com.mzs.dubbo_server.service;

import java.util.List;

import com.mzs.dubbo_server.bean.User;

/**
 * @Author mengzs 
 * @Date 2017年10月23日
 */
public interface UserQueryService {

	/**
	 * 查询所有用户
	 * @return
	 */
	public List<User> findAllUser();
	
	/**
	 * 根据用户名查询用户
	 * @return
	 */
	public User findByUsername(String username);
}
