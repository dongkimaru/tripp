package mul.cam.a.controller;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import mul.cam.a.service.MemberService;

@Controller
public class MemberController {
	//service 연결
	@Autowired
	MemberService service;
	
	@RequestMapping(value = "main.do", method = RequestMethod.GET)
	public String main() {
		System.out.println("MemberController main " + new Date());
		
		return "main";
	}
	
	@RequestMapping(value = "login.do", method = RequestMethod.GET)
	public String login() {
		System.out.println("MemberController login " + new Date());
		
		return "login";
	}
	
	@RequestMapping(value = "loginAf.do", method = RequestMethod.POST)
	public String loginAf() {
		System.out.println("MemberController loginAf " + new Date());
		
		return "loginAf";
	}
	
	@RequestMapping(value = "regi.do", method = RequestMethod.GET)
	public String regi() {
		System.out.println("MemberController regi " + new Date());
		
		return "regi";
	}

	//git test
}
