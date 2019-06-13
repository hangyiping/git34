package com.byzx.service.Impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.byzx.dao.UserInfoDao;
import com.byzx.model.UserInfo;
import com.byzx.service.UserInfoService;

/**
 * @�ļ���: UserServiceImpl.java
 * @�๦��˵��: ʵ���� mybatis ������ӿڣ�����Ҫʵ���� mybatis�����Ϊ���㣬�ӿ����㴦��
 * @����: ChangYiPing
 * @Email: 1395184365@qq.com
 * @����: 2019��4��28������7:20:01
 * @�޸�˵��:<br>
 * 
 *            <pre>
 * 	 <li>����: ChangYiPing</li> 
 * 	 <li>����: 2019��4��28������7:20:01</li> 
 *	 <li>����: </li>
 *            </pre>
 */

@Service() // ��ע��ʵ��bean
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