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
	 * 使用method属性来指定请求方式
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
	 * RequestParam 注解作用 ： 映射请求参数
	 * value值即请求参数名
	 * required 该参数是否必须，默认为True
	 * defaultValue 请求参数的默认值
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
	 * 重点：
	 * Spring MVC 会按请求参数名和POJO属性名进行自动匹配
	 * 自动为该对象填充属性值。支持级联属性
	 */
	@RequestMapping("/TestPOJO")
	public String TestPOJO(User user){
		System.out.println("TestPOJO is  " + user);
		return SUCCESS;
	}
	
	
	/*
	 * 重点
	 * 目标方法返回值 可以是modleView类型
	 * 其中可以包括视图和模型信息
	 * SpringMVC会把ModleView的 modle数据放到request 域对象中
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
	 * @SessionAttributes 除了可以通过属性名指定需要放到会话中的属性外（实际上是使用value属性）,
	 * 还可以通过模型属性的对象类型指定那些模型属性需要放到会话中（实际上是使用 type属性）
	 * 注意：注解只能放在类的上面，不能放在方法上面
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
		System.out.println("是否经过该Handle......");
		return "MVCView";
	}
}
