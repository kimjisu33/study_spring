package kr.hs.study.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import kr.hs.study.beans.TestBean1;

//�ڹٷ� ��ü�� �����϶�� �ϴ� ��������
@Configuration
public class BeanConfigClass {
	
	//<bean id="t1" class="kr.hs.study.beans.TestBean1"/>
	@Bean	//�Ʒ� ������ �޼��带 �����ؼ� TestBean1 ��ü�� ����ž�
	public TestBean1 java1() {
		TestBean1 t1=new TestBean1();
		return t1;
	}
	
	@Bean
	public TestBean1 java2() {
		return new TestBean1();
	}
	
	@Bean
	public TestBean1 java3() {
		return new TestBean1();
	}

}
