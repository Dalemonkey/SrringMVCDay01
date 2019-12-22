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
	 * ��@ModelAttribute ��ǵķ��� �� ����ÿ��Ŀ�귽��ִ��ǰ��SpringMVC���ã�
	 * 
	 * ע�⣺ ��@ModelAttribute���εķ����У�����Mapʱ�ļ���Ҫ��Ŀ�귽���������͵ĵ�һ����ĸСд�ַ���һ�£�
	 *  ����������Ϊ User  �����Map�е�ֵΪuser
	 */
	@ModelAttribute
	private void TestModleAttribute(@RequestParam(value ="id" ,required=false) Integer id,Map<String,Object> map){
		System.out.println("Test method....");
		if(id!=null){
			User user = new User("chenjian", "123456", "139@qq.com", 18, 1);
			map.put("user", user);
			System.out.println("���ݿ��е�Date : "+ user);
		}
	}

	@RequestMapping("/TestModelAttribute")
	public ModelAndView TestModelAttribute(User user){
		ModelAndView modleAndView = new ModelAndView(SUCCESS);
		adders add = new adders();
		add.setCity("����");
		add.setProvince("����");
		modleAndView.addObject("add", add);
		System.out.println("�޸�   :"+ user);
		return modleAndView;
	}

	@RequestMapping("/TestModelAttribute11")
	public String TestModelAttribute(){
		
		return SUCCESS;
	}
}
