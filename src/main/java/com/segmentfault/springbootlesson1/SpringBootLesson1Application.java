package com.segmentfault.springbootlesson1;

import java.util.HashMap;
import java.util.Map;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@SpringBootApplication
@Controller
@EnableAutoConfiguration
public class SpringBootLesson1Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootLesson1Application.class, args);
	}
	
	
	@RequestMapping("/")
	@ResponseBody
	public String home(){
		return "hello word";
	}

	@RequestMapping("/rest")
	@ResponseBody
	public Map<String , Object> rest(){
		Map<String , Object> map = new HashMap<>();
		map.put("saa", "bbb");
		map.put("123", 333);
		return map;
	}
}
