package main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import greeter.Greeter;

public class MainForGreet {
	public static void main(String[] args) {
		ApplicationContext ctx = new GenericXmlApplicationContext("classpath:applicationContext.xml");
		//ctx.getBean("greeter", Greeter.class); // bean id 로 접근
		// bean 들을 생성하여 가지고 있는 Spirng container 객체(ctx) 
		// 의존 주입 방식 두가지
			// 1. 생성자를 통해 <contructor-arg ref="(객체를 주입할 경우)" or value="(기본자료형 주입할 경우)">
			// 2. setter method를 통해 <property name="setter method의 이름" ref="(객체를 주입할 경우) or value=("기본자료형을 주입할 경우)">
			// 생성자, setter method 방식 모두 value에는 문자열 형태로 ("") 작성하면, 자동으로 형변환이 되어 들어간다.
			// ex) int형을 주입하는 setter method의 경우 value="4" 로 하면 자동으로 숫자 4가 들어감!
		Greeter greet = ctx.getBean("greeter", Greeter.class);
		System.out.println("인사:"+greet.greet("홍길동"));
		
	}
}
