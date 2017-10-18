package com.ry.DI02;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//与@Component注解功能相同，但意义又不同的还有三个：
//1、 @Repository: 注解在 Dao实现类上
//2、 @Service: 注解在Service实现类上
//3、@Controller: 注解在SrpingMVC的处理器上 

@Scope("prototype")  //默认为singleton  单例
@Component("mySchool")  //组件，表示当前类被Spring 容器所管理
public class School {
	@Value("清华大学")
	private String name;

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "School [name=" + name + "]";
	}
	
	
	
}
