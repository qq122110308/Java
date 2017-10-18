package com.ry.DI02;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//��@Componentע�⹦����ͬ���������ֲ�ͬ�Ļ���������
//1�� @Repository: ע���� Daoʵ������
//2�� @Service: ע����Serviceʵ������
//3��@Controller: ע����SrpingMVC�Ĵ������� 

@Scope("prototype")  //Ĭ��Ϊsingleton  ����
@Component("mySchool")  //�������ʾ��ǰ�౻Spring ����������
public class School {
	@Value("�廪��ѧ")
	private String name;

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "School [name=" + name + "]";
	}
	
	
	
}
