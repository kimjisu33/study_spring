package kr.hs.study.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.hs.study.beans.TestBean1;
import kr.hs.study.beans.TestBean2;
import kr.hs.study.beans.TestBean3;

public class MainClass {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("kr/hs/study/config/config.xml");
		
		TestBean1 t1=ctx.getBean("t1",TestBean1.class);
		t1.print();
		
		System.out.println("-----------------------------");
		
		TestBean2 t2=ctx.getBean("t2",TestBean2.class);
		System.out.println(t2.getData3());
		System.out.println(t2.getData4());
		
System.out.println("-----------------------------");
		
		TestBean3 t3=ctx.getBean("t3",TestBean3.class);
		System.out.println(t3.getData5());
		System.out.println(t3.getData6());
		System.out.println(t3.getData7());
		
		ctx.close();
	}

}
