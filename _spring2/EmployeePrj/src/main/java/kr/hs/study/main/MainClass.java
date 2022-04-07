package kr.hs.study.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.hs.study.beans.Designer;
import kr.hs.study.beans.Developer;
import kr.hs.study.beans.Employee;
import kr.hs.study.beans.publisher;

public class MainClass {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("kr/hs/study/config/config.xml");
		
		Employee e1=ctx.getBean("designer", Designer.class);
		Employee e2=ctx.getBean("developer", Developer.class);
		Employee e3=ctx.getBean("publisher", publisher.class);

		e1.Checkin();
		e1.Checkout();
		e2.Checkin();
		e2.Checkout();
		e3.Checkin();
		e3.Checkout();
	}

}
