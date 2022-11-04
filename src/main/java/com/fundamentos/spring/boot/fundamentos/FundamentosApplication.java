package com.fundamentos.spring.boot.fundamentos;

import com.fundamentos.spring.boot.fundamentos.bean.MyBean;
import com.fundamentos.spring.boot.fundamentos.bean.MyBeanWithDependency;
import com.fundamentos.spring.boot.fundamentos.bean.MyBeanWithProperties;
import com.fundamentos.spring.boot.fundamentos.component.ComponentDependecy;
import com.fundamentos.spring.boot.fundamentos.bean.Persona;
import com.fundamentos.spring.boot.fundamentos.pojo.UserPojo;
import org.springframework.beans.factory.annotation.Autowired;
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
	private UserPojo userPojo;
	private MyBeanWithProperties myBeanWithProperties;

	public FundamentosApplication(@Qualifier("componentImplement") ComponentDependecy componentDependecy, MyBean myBean, MyBeanWithDependency myBeanWithDependency, Persona persona, MyBeanWithProperties myBeanWithProperties, UserPojo userPojo){
		this.componentDependecy= componentDependecy;
		this.myBean=myBean;
		this.myBeanWithDependency=myBeanWithDependency;
		this.persona=persona;
		this.myBeanWithProperties=myBeanWithProperties;
		this.userPojo=userPojo;
	}
	public static void main(String[] args) {

		SpringApplication.run(FundamentosApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		componentDependecy.saludar();
		myBean.print();
		myBeanWithDependency.printWithDependecy();
		persona.saludar();
		System.out.println(myBeanWithProperties.function());
		System.out.println(userPojo.getEmail() + "-"+ userPojo.getPassword());
	}
}
