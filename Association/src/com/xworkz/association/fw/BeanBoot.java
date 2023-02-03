package com.xworkz.association.fw;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xworkz.association.fw.beans.BottleBean;
import com.xworkz.association.fw.beans.TrainBean;

public class BeanBoot {

	public static void main(String[] args) {
		String xmlMetaInfopath = "resources/Spring.xml";
		ApplicationContext context = new ClassPathXmlApplicationContext("resources/Spring.xml");

		TrainBean refOfBean = context.getBean(TrainBean.class);
		System.out.println(refOfBean);

		BottleBean refOfBean1 = context.getBean(BottleBean.class);
		System.out.println(refOfBean1);

	}

}
