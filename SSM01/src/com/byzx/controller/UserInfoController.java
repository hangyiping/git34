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
 * @文件名: UserController.java
 * @类功能说明:控制层
 * @作者: ChangYiPing
 * @Email: 1395184365@qq.com
 * @日期: 2019年4月29日上午8:58:33
 * @修改说明:<br>
 * 
 *            <pre>
 * 	 <li>作者: ChangYiPing</li> 
 * 	 <li>日期: 2019年4月29日上午8:58:33</li> 
 *	 <li>内容: </li>
 *            </pre>
 */
//@Controller表示控制层，@RequestMapping("/userInfo")表示父路径
@Controller
@RequestMapping("/userInfo")
public class UserInfoController {
	
	@Resource
	private UserInfoService userInfoService;

	
	//登录验证       /login  路径
	@RequestMapping("/login")
	public String login(UserInfo userInfo, HttpServletRequest request,HttpServletResponse response) {
		
		//根据前端传来的userInfo（账号密码）调用userService.login方法
		UserInfo resultUserInfo =userInfoService.login(userInfo);
		System.out.println("*******login*********"+resultUserInfo);
		//结果为空则失败,将用户输入的错误信息存入request并返回原页面
		if (resultUserInfo == null) {//如果结果为null，即账号密码与数据库不匹配
			request.setAttribute("userInfo", userInfo);//将用户输入的账号密码存进userInfo，作为回显
			request.setAttribute("errorMsg", "用户名或密码错误！");
			return "login";
			
		} else {		//否则，输入正确跳转成功页面
			HttpSession session = request.getSession();
			session.setAttribute("currentUserInfo", resultUserInfo);
			return "forward:/userInfo/list.do";
		}
	}
	
	
	/**
	 * @方法名: list
	 * @方法说明: 视图
	 * @作者: ChangYiPing
	 * @邮箱：1395184365@qq.com
	 * @日期: 2019年4月29日下午3:18:30
	 * @return
	 * @return: String
	 */
	
	//查询所有用户信息,跳转用户列表
/*	@RequestMapping("/list")
	public ModelAndView list() {
		List<UserInfo> userInfoList = userInfoService.findAllUserInfo();
		ModelAndView mav=new ModelAndView();
		mav.addObject("userInfoList",userInfoList);
		mav.setViewName("/list");
		return mav;
		*/
		
	}

