package com.Test.Controller;

import java.util.Arrays;
import java.util.Date;
import java.util.Map;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;
import com.Test.User.User;


@SessionAttributes("user")
@Controller
@RequestMapping("/SpringMVC")
public class RequestMappingTest {
	
	private static final String SUCCESS = "success";
	/***
	 * ʹ��method������ָ������ʽ
	 * @return
	 */
	@RequestMapping(value="/RequestMapping1", method=RequestMethod.POST )
	public String RequestMapping1(){
		System.out.println("Test RequestMapping1");
		return SUCCESS;
	}
	
	@RequestMapping("/RequestMapping2")
	public String RequestMapping2(){
		System.out.println("Test RequestMapping2");
		return SUCCESS;
	}
	
	/***
	 * RequestParam ע������ �� ӳ���������
	 * valueֵ�����������
	 * required �ò����Ƿ���룬Ĭ��ΪTrue
	 * defaultValue ���������Ĭ��ֵ
	 * @param UN
	 * @param age
	 * @return
	 */
	@RequestMapping("/RequestParam")
	public String RequestParam(@org.springframework.web.bind.annotation.RequestParam(value="username") String UN,@org.springframework.web.bind.annotation.RequestParam(value="age") Integer age){
		System.out.println("requestParam is : " + UN + ", age "+age);
		return SUCCESS;
	}
	
	/**
	 * 
	 * �ص㣺
	 * Spring MVC �ᰴ�����������POJO�����������Զ�ƥ��
	 * �Զ�Ϊ�ö����������ֵ��֧�ּ�������
	 */
	@RequestMapping("/TestPOJO")
	public String TestPOJO(User user){
		System.out.println("TestPOJO is  " + user);
		return SUCCESS;
	}
	
	
	/*
	 * �ص�
	 * Ŀ�귽������ֵ ������modleView����
	 * ���п��԰�����ͼ��ģ����Ϣ
	 * SpringMVC���ModleView�� modle���ݷŵ�request �������
	 */
	@RequestMapping("/TestModleView")
	public ModelAndView TestModleView(){
		String viewName = SUCCESS;
		ModelAndView modleView = new ModelAndView(viewName);
		modleView.addObject("Date", new Date());
		modleView.addObject("names", "SpringMVC");
		return modleView;
	}
	
	/**
	 * 
	 * 
	 */
	@RequestMapping("/TestMap")
	public String TestMap(Map<String,Object>map){
		map.put("MapName", Arrays.asList("Tom","Cat","Dog"));
		return SUCCESS;
	}
	
	/**
	 * @SessionAttributes ���˿���ͨ��������ָ����Ҫ�ŵ��Ự�е������⣨ʵ������ʹ��value���ԣ�,
	 * ������ͨ��ģ�����ԵĶ�������ָ����Щģ��������Ҫ�ŵ��Ự�У�ʵ������ʹ�� type���ԣ�
	 * ע�⣺ע��ֻ�ܷ���������棬���ܷ��ڷ�������
	 */
	@RequestMapping("/TestSessionAttributes")
	public ModelAndView TestSessionAttributes(){
		ModelAndView modelAndView = new ModelAndView(SUCCESS);
		User user = new User();
		user.setUsername("SpringMVCTest");
		user.setPassword("123456");
		user.setEmail("139@qq.com");
		user.setAge(12);
		modelAndView.addObject("user", user);
		return modelAndView;
	}
	
	@RequestMapping("/MVCView")
	public String TestMVCView(){
		System.out.println("�Ƿ񾭹���Handle......");
		return "MVCView";
	}
}
