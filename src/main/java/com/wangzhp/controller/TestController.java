package com.wangzhp.controller;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import javax.ws.rs.CookieParam;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.wangzhp.model.user;

@Controller
public class TestController {
	
	 @RequestMapping(value = "/index")
	 public String Home(){
		 
		   return "index";
	 }
	
	 @RequestMapping(value = "/Hello", method = RequestMethod.GET)
	   public String Hello(String str,Model model){

		 ModelAndView  view =new ModelAndView();
		 HashMap<String,String> map=new HashMap<String,String>();
		 map.put("str1", "1111");
		 map.put("str2", "2222");
		 map.put("str3", "3333");
		 view.addObject("str", str);
		 model.addAttribute("str", map);
		
		     return "Hello";

	   }
	 @ResponseBody 
	 @RequestMapping(value = "/testRestJosn/{id}", method = RequestMethod.GET)
	   public  
	   Person Hello(@PathVariable int id){

		 Person p=new Person("王志平","25岁");
	       return p;
	 }
	 @RequestMapping(value = "/view", method = RequestMethod.GET)
	   public ModelAndView view(String str,Model model){

		 ModelAndView  view =new ModelAndView("view");
		 view.addObject("str", str);
		 model.addAttribute("str", str);
		
		   return view;

	   }
	 
	 
	 @RequestMapping(value = "/testModel", method = RequestMethod.POST)
	   public String testModel(user user){
	    System.out.println(user.toString());
		 //
		    return "redirect:/test/demo";
	 }
	 
	 
	  /** 
	  *  有 @ModelAttribute 标记的方法, 会在每个目标方法执行之前被 SpringMVC 调用!  
	  */  
	 @ModelAttribute  
	 public void getUser(@RequestParam(value="id",required=false) Integer id,   
	         Map<String, Object> map){  
		 Date d=new Date();

	     System.out.println("modelAttribute method");  
	     if(id != null){  
	         //模拟从数据库中获取对象  
	         user user = new user("eee","wangzhp",d,(double) 1);  
	         System.out.println("从数据库中获取一个对象: " + user);  
	           
	         map.put("user", user);  
	     }  
	 }  
	 
//	 @RequestMapping(value = "/index")
//	 public String Index(){
//		 
//		   return "index";
//	 }
	
		 
	 
	
}
