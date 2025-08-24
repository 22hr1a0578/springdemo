package com.mite.springconsdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication (
	scanBasePackages ={"com.mite.springconsdemo","com.mite.util"}
)
public class SpringconsdemoApplication {

	public static void main(String[] args) {

		SpringApplication.run(SpringconsdemoApplication.class, args);
	}

}
