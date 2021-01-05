package com.displaydateproject.displaydate;

import java.text.SimpleDateFormat;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	@RequestMapping("/")
	public String index() {
		return "index.jsp";
	}
	
	@RequestMapping("/date")
	public String date(Model model) {
		java.util.Date mydate = new java.util.Date() ;
		SimpleDateFormat formatter = new SimpleDateFormat("EEEEE dd-MMMMMMM-yyyy");
		String formattedDate = formatter.format(mydate);
		
		model.addAttribute("date", formattedDate);
		return "date.jsp";
	}
	
	@RequestMapping("/time")
	public String time(Model model) {
		java.util.Date  mydate = new java.util.Date() ;
		SimpleDateFormat formatter = new SimpleDateFormat("HH:mm a" );
		String formattedTime = formatter.format(mydate);
		model.addAttribute("time", formattedTime);
		return "time.jsp";
	}
}
