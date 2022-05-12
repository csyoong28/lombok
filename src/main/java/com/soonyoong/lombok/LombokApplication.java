package com.soonyoong.lombok;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.soonyoong.lombok.model.Alien;

import lombok.extern.java.Log;

@SpringBootApplication
@Log
public class LombokApplication {

	public static void main(String[] args) {
		SpringApplication.run(LombokApplication.class, args);
		Alien alien1 = new Alien();
		alien1.setName("alien1");
		alien1.setAge(1);
		System.out.println(alien1);
		log.info(alien1.toString());
		
	}

}
