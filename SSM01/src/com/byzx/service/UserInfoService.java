package com.byzx.service;

import java.util.List;

import com.byzx.model.UserInfo;

/**@�ļ���: UserService.java
 * @�๦��˵��: �ӿڣ�����ҵ�� ����ӿ� 
 * @����: ChangYiPing
 * @Email: 1395184365@qq.com
 * @����: 2019��4��28������7:15:44
 * @�޸�˵��:<br> 
 * <pre>
 * 	 <li>����: ChangYiPing</li> 
 * 	 <li>����: 2019��4��28������7:15:44</li> 
 *	 <li>����: </li>
 * </pre>
 */
public interface UserInfoService {

	//��֤�û���¼��Ϣ	
		public UserInfo login(UserInfo userInfo);
		
		//public List<UserInfo> findAllUserInfo();

}
