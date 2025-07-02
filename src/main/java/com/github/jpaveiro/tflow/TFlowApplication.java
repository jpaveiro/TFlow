package com.github.jpaveiro.tflow;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class TFlowApplication {

	public static void main(String[] args) {
		SpringApplication.run(TFlowApplication.class, args);
	}
}
