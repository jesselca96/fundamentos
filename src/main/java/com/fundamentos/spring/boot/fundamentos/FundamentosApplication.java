package com.fundamentos.spring.boot.fundamentos;

import com.fundamentos.spring.boot.fundamentos.bean.MyBean;
import com.fundamentos.spring.boot.fundamentos.bean.MyBeanWithDependency;
import com.fundamentos.spring.boot.fundamentos.component.ComponentDependecy;
import com.fundamentos.spring.boot.fundamentos.bean.Persona;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FundamentosApplication implements CommandLineRunner {

	private ComponentDependecy componentDependecy;
	private MyBean myBean;
	private MyBeanWithDependency myBeanWithDependency;

	private Persona persona;

	public FundamentosApplication(@Qualifier("componentImplement") ComponentDependecy componentDependecy, MyBean myBean, MyBeanWithDependency myBeanWithDependency, Persona persona){
		this.componentDependecy= componentDependecy;
		this.myBean=myBean;
		this.myBeanWithDependency=myBeanWithDependency;
		this.persona=persona;
	}
	public static void main(String[] args) {

		SpringApplication.run(FundamentosApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		//componentDependecy.saludar();
		//myBean.print();
		//myBeanWithDependency.printWithDependecy();
		persona.saludar();
	}
}
