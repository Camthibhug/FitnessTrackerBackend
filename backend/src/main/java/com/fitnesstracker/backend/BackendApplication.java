
package com.fitnesstracker.backend;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
public class BackendApplication {

	public static void main(String[] args) {
		new SpringApplicationBuilder(BackendApplication.class)
		.registerShutdownHook(true)
		.run(args);
	}

}