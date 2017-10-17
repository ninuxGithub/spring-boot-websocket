package com.example.demo.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.bean.Site;

@Controller
@RequestMapping("/angular")
public class AngularController {

	@RequestMapping("/input")
	public String input() {
		return "angular/input";
	}

	@RequestMapping("/service")
	public String service() {
		return "angular/service";
	}
	@RequestMapping("/api")
	public String api() {
		return "angular/api";
	}
	@RequestMapping("/inject")
	public String inject() {
		return "angular/inject";
	}
	@RequestMapping("/route")
	public String route() {
		return "angular/route";
	}

	@RequestMapping(value = "/angularGet")
	@ResponseBody
	public Map<String, String> angularGetMethod() {
		Map<String, String> map = new HashMap<>();
		map.put("key", "value");
		return map;
	}

	@RequestMapping(value = "/ajax")
	@ResponseBody
	public Map<String, List<Site>> ajax() {
		Map<String, List<Site>> map = new HashMap<>();
		List<Site> list = new ArrayList<>();
		list.add(new Site("菜鸟教程", "www.runoob.com", "CN"));
		list.add(new Site("Google", "www.google.com", "USA"));
		list.add(new Site("Facebook", "www.facebook.com", "USA"));
		list.add(new Site("微博", "www.weibo.com", "CN"));
		map.put("sites", list);
		return map;
	}

}
