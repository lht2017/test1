package com.example.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

@RestController
@SpringBootApplication
public class TestApplication {

	public static void main(String[] args) {
		SpringApplication.run(TestApplication.class, args);
	}

	@RequestMapping(value = "/test", method = RequestMethod.GET)
	public String test() {

		return "ipx where ？";
	}
	@RequestMapping(value = "/test1", method = RequestMethod.GET)
	public String test1() {

		return "ipx where test1 ？";
	}

	@RequestMapping(value = "/test4", method = RequestMethod.GET)
	public String test4() {

		return "ipx where test1 ddddd ？";
	}

	@RequestMapping(value = "/test5", method = RequestMethod.GET)
	public String test5() {

		return "ipx where test5 ddddd ？";
	}

}
