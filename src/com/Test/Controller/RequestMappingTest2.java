package com.Test.Controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.Test.User.User;
import com.Test.User.adders;

@Controller
@RequestMapping("/SpringMVC2")
public class RequestMappingTest2 {

	private final String SUCCESS = "success";

	/**
	 * 有@ModelAttribute 标记的方法 ， 会在每个目标方法执行前被SpringMVC调用！
	 * 
	 * 注意： 在@ModelAttribute修饰的方法中，放入Map时的键需要和目标方法参数类型的第一个字母小写字符串一致！
	 *  例：参数类为 User  则放入Map中的值为user
	 */
	@ModelAttribute
	private void TestModleAttribute(@RequestParam(value ="id" ,required=false) Integer id,Map<String,Object> map){
		System.out.println("Test method....");
		if(id!=null){
			User user = new User("chenjian", "123456", "139@qq.com", 18, 1);
			map.put("user", user);
			System.out.println("数据库中的Date : "+ user);
		}
	}

	@RequestMapping("/TestModelAttribute")
	public ModelAndView TestModelAttribute(User user){
		ModelAndView modleAndView = new ModelAndView(SUCCESS);
		adders add = new adders();
		add.setCity("贵阳");
		add.setProvince("贵州");
		modleAndView.addObject("add", add);
		System.out.println("修改   :"+ user);
		return modleAndView;
	}

	@RequestMapping("/TestModelAttribute11")
	public String TestModelAttribute(){
		
		return SUCCESS;
	}
}
