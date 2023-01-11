package helloworld.controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

public class HelloWorldController implements Controller {

	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception{
		String name = request.getParameter("name");
		System.out.println("Hi");
		Map<String, String> map = new HashMap<String,String>(); 
		System.out.println("Hiiii");

		map.put("name", name);

		return new ModelAndView("welcome", map);
	}

}



