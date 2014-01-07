package com.ebajar.springtest;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		
		return "home";
	}
	
	
	@RequestMapping(value = "/page2")
	public String page2(Model model) {
		
		String arr[] = {"1","2","3","4"};
		String myName = "Sazzad";
		int x = 99+93;
		
		model.addAttribute("myarray", arr);
		model.addAttribute("myname", myName);
		model.addAttribute("myno", x);
		
		return "page2";
	}
	@RequestMapping(value = "/table")
	public String table(Model model) {
		String str="This is for test  for new line break.";
		String ary[]={"111","222","333","444","555","666"};
		float f=45.7f;
		//int s[10][10]={1,2,3,4,5};
		
		model.addAttribute("string",str);
		model.addAttribute("stringarray",ary);
		model.addAttribute("value",f);
					
		return "table";
	}
	@RequestMapping(value = "/page2/calculate", method = RequestMethod.GET)
	public String calculate(Locale locale, Model model,HttpServletRequest request) {
		
		int x = Integer.parseInt(request.getParameter("i1"));
		int y = Integer.parseInt(request.getParameter("i2"));
		
		int z = 0;
		z = x+y;
		
		model.addAttribute("result" , z);
		
		return "page2";
	}
	@RequestMapping(value = "/table/add", method = RequestMethod.GET)
	public String add(Locale locale, Model model,HttpServletRequest request) {
		
		int ff = Integer.parseInt(request.getParameter("ii1"));
		int ss = Integer.parseInt(request.getParameter("ii2"));
		int dd = Integer.parseInt(request.getParameter("ii3"));
		
		int ad = 0;
		ad = ff+ss+dd;
		
		model.addAttribute("rslt" , ad);
		
		return "table";
	}
	
	// i am writing some stuff 
	
}
