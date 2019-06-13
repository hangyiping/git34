package com.byzx.service.Impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.byzx.dao.UserInfoDao;
import com.byzx.model.UserInfo;
import com.byzx.service.UserInfoService;

/**
 * @文件名: UserServiceImpl.java
 * @类功能说明: 实现类 mybatis 是面向接口，不需要实现类 mybatis里面分为三层，接口运算处理。
 * @作者: ChangYiPing
 * @Email: 1395184365@qq.com
 * @日期: 2019年4月28日下午7:20:01
 * @修改说明:<br>
 * 
 *            <pre>
 * 	 <li>作者: ChangYiPing</li> 
 * 	 <li>日期: 2019年4月28日下午7:20:01</li> 
 *	 <li>内容: </li>
 *            </pre>
 */

@Service() // 用注解实现bean
public class UserInfoServiceImpl implements UserInfoService {

	@Resource
	private UserInfoDao userInfoDao;
	
	@Override
	public UserInfo login(UserInfo userInfo) {
		
		
		return userInfoDao.login(userInfo);
	}

	/*@Override
	public List<UserInfo> findAllUserInfo() {
		
		return userInfoDao.findAllUserInfo();
	}*/

}