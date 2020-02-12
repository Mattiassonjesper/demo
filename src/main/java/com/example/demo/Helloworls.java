package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

public class Helloworls {
	
	//using get method and hello-world as URI  
		@RequestMapping(method = RequestMethod.GET, path = "/hello-world")
		public String helloWorld() {
			return "Hello World";
		}

		@RequestMapping(value = "/score", method = RequestMethod.GET)
		public String update(String rev) {
			StringBuilder sb = new StringBuilder(rev);

			return sb.reverse().toString();
		}

		@RequestMapping(value = "/sub", method = RequestMethod.GET)
		public int subtract(int num1, int num2) {

			int difference = num1 - num2;
			return difference;

		}
		
		@RequestMapping(value = "/multipy", method = RequestMethod.GET)
		public int multiply(int num1, int num2) {

			int sum = num1 * num2;
			return sum;

		}
		
		@RequestMapping(value = "/add", method = RequestMethod.GET)
		public int add(int num1, int num2) {

			int sum = num1 + num2;
			return sum;

		}
}
