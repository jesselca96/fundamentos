package com.fundamentos.spring.boot.fundamentos;

import com.fundamentos.spring.boot.fundamentos.component.ComponentDependecy;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FundamentosApplication implements CommandLineRunner {

	private ComponentDependecy componentDependecy;
	public FundamentosApplication(ComponentDependecy componentDependecy){
		this.componentDependecy= componentDependecy;
	}
	public static void main(String[] args) {

		SpringApplication.run(FundamentosApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		componentDependecy.saludar();
	}
}
