package com.byzx.dao;

import java.util.List;

import com.byzx.model.UserInfo;

/**@文件名: UserInfoDao.java
 * @类功能说明: 接口，操作数据库
 * @作者: ChangYiPing
 * @Email: 1395184365@qq.com
 * @日期: 2019年4月28日下午7:01:44
 * @修改说明:<br> 
 * <pre>
 * 	 <li>作者: ChangYiPing</li> 
 * 	 <li>日期: 2019年4月28日下午7:01:44</li> 
 *	 <li>内容: </li>
 * </pre>
 */
public interface UserInfoDao {

//验证用户登录信息	
	public UserInfo login(UserInfo userInfo);
	
	//public List<UserInfo> findAllUserInfo();

}
