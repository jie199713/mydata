package com.action;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class control {
	
	@ResponseBody
	@RequestMapping("login")
	private String login(HttpServletRequest request) {
		System.out.println(11111);
		return "adasdased";
		// TODO Auto-generated method stub

	}
}
