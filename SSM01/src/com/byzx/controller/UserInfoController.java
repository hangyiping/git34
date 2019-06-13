package com.byzx.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.byzx.model.UserInfo;
import com.byzx.service.UserInfoService;

/**
 * @�ļ���: UserController.java
 * @�๦��˵��:���Ʋ�
 * @����: ChangYiPing
 * @Email: 1395184365@qq.com
 * @����: 2019��4��29������8:58:33
 * @�޸�˵��:<br>
 * 
 *            <pre>
 * 	 <li>����: ChangYiPing</li> 
 * 	 <li>����: 2019��4��29������8:58:33</li> 
 *	 <li>����: </li>
 *            </pre>
 */
//@Controller��ʾ���Ʋ㣬@RequestMapping("/userInfo")��ʾ��·��
@Controller
@RequestMapping("/userInfo")
public class UserInfoController {
	
	@Resource
	private UserInfoService userInfoService;

	
	//��¼��֤       /login  ·��
	@RequestMapping("/login")
	public String login(UserInfo userInfo, HttpServletRequest request,HttpServletResponse response) {
		
		//����ǰ�˴�����userInfo���˺����룩����userService.login����
		UserInfo resultUserInfo =userInfoService.login(userInfo);
		System.out.println("*******login*********"+resultUserInfo);
		//���Ϊ����ʧ��,���û�����Ĵ�����Ϣ����request������ԭҳ��
		if (resultUserInfo == null) {//������Ϊnull�����˺����������ݿⲻƥ��
			request.setAttribute("userInfo", userInfo);//���û�������˺�������userInfo����Ϊ����
			request.setAttribute("errorMsg", "�û������������");
			return "login";
			
		} else {		//����������ȷ��ת�ɹ�ҳ��
			HttpSession session = request.getSession();
			session.setAttribute("currentUserInfo", resultUserInfo);
			return "forward:/userInfo/list.do";
		}
	}
	
	
	/**
	 * @������: list
	 * @����˵��: ��ͼ
	 * @����: ChangYiPing
	 * @���䣺1395184365@qq.com
	 * @����: 2019��4��29������3:18:30
	 * @return
	 * @return: String
	 */
	
	//��ѯ�����û���Ϣ,��ת�û��б�
/*	@RequestMapping("/list")
	public ModelAndView list() {
		List<UserInfo> userInfoList = userInfoService.findAllUserInfo();
		ModelAndView mav=new ModelAndView();
		mav.addObject("userInfoList",userInfoList);
		mav.setViewName("/list");
		return mav;
		*/
		
	}

