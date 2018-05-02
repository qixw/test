package com.test.controller;

import com.test.service.XMLCreater;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author ：qixuewei@jinlianchu.com
 * @Description ：
 * @ClassName ：TestController
 * @date ：2018/1/17 10:12
 */

@Controller
public class TestController {


	@RequestMapping("/login")
	public String login(HttpServletRequest request){

		return "loginsuccess";
	}

	@RequestMapping(value = "/xml",produces = "application/xml")
	@ResponseBody
	public String xmlTest(HttpServletRequest request, HttpServletResponse response){
		//response.setHeader("Content-Type","text/xml;charset=utf-8");
		return  XMLCreater.createXML();
	}
}
