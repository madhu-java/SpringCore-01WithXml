package com.madhu.beans;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class MyMainApp {

	public static void main(String[] args) {
		/* this old appraoch few classes are depricated..
		Resource resource=new ClassPathResource("Beans.xml");
		BeanFactory factory=new XmlBeanFactory(resource);
		factory.getBean("credit","CreditCardPay.class");
		*/
		
		ApplicationContext factory= new ClassPathXmlApplicationContext("Beans.xml");
		 factory.getBean("credit","CreditCardPay.class");
		 factory.getBean("debit","DebitCardPay.class");
		 PaymentProcess process = (PaymentProcess) factory.getBean("payment","PaymentProcess.class");
		 process.doPayment(100.01);

	}

}
