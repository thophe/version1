package com.ecolepratique.version1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Version1Application {

	public static void main(String[] args) {
		SpringApplication.run(Version1Application.class, args);
		System.out.println("Modification 2");
		System.out.println("Modification 3");
		System.out.println("Modification 4");
	}

}
