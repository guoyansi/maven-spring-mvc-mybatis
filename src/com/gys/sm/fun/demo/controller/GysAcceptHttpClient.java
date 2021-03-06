package com.gys.sm.fun.demo.controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;

@Controller
@RequestMapping("/httpClient")
public class GysAcceptHttpClient {

	@ResponseBody
	@RequestMapping("/post")
	public String post(@RequestBody String param){
		System.out.println("接受参数"+param);
		Map<String, Object> map=new HashMap<String, Object>();
		map.put("name", "gys");
		map.put("age", 26);
		return JSON.toJSONString(map);
	}
	
	@ResponseBody
	@RequestMapping("/get")
	public String get(HttpServletRequest request){
		System.out.println("接受参数:"+request.getParameter("name"));
		System.out.println("接受参数:"+request.getParameter("age"));
		Map<String, Object> map=new HashMap<String, Object>();
		map.put("name", "gys");
		map.put("age", 26);
		return JSON.toJSONString(map);
	}
}
