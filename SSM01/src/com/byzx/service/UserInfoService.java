package com.byzx.service;

import java.util.List;

import com.byzx.model.UserInfo;

/**@文件名: UserService.java
 * @类功能说明: 接口，处理业务 面向接口 
 * @作者: ChangYiPing
 * @Email: 1395184365@qq.com
 * @日期: 2019年4月28日下午7:15:44
 * @修改说明:<br> 
 * <pre>
 * 	 <li>作者: ChangYiPing</li> 
 * 	 <li>日期: 2019年4月28日下午7:15:44</li> 
 *	 <li>内容: </li>
 * </pre>
 */
public interface UserInfoService {

	//验证用户登录信息	
		public UserInfo login(UserInfo userInfo);
		
		//public List<UserInfo> findAllUserInfo();

}
