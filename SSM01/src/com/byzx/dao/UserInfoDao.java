package com.byzx.dao;

import java.util.List;

import com.byzx.model.UserInfo;

/**@�ļ���: UserInfoDao.java
 * @�๦��˵��: �ӿڣ��������ݿ�
 * @����: ChangYiPing
 * @Email: 1395184365@qq.com
 * @����: 2019��4��28������7:01:44
 * @�޸�˵��:<br> 
 * <pre>
 * 	 <li>����: ChangYiPing</li> 
 * 	 <li>����: 2019��4��28������7:01:44</li> 
 *	 <li>����: </li>
 * </pre>
 */
public interface UserInfoDao {

//��֤�û���¼��Ϣ	
	public UserInfo login(UserInfo userInfo);
	
	//public List<UserInfo> findAllUserInfo();

}
