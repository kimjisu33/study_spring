package kr.hs.study.main;


import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.hs.study.beans.Book;
import kr.hs.study.beans.magazine;
import kr.hs.study.beans.novel;
import kr.hs.study.beans.poet;

public class MainClass {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("kr/hs/study/config/config.xml");

		Book b=ctx.getBean("n",novel.class);
		Book p=ctx.getBean("p",poet.class);
		Book m=ctx.getBean("m",magazine.class);
	
		b.buy();
		p.buy();
		m.buy();
	}

}
