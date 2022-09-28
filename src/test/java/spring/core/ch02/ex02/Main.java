package spring.core.ch02.ex02;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
	public static void main(String[] args) {
		ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
		
		Calculator calculator = ctx.getBean(Calculator.class);
		Rabbit rabbit = ctx.getBean(Rabbit.class);
		
		System.out.println(calculator.calc().getResult());
		System.out.println(rabbit.sleep().getResult());
	}
} // 클라이언트는 리턴값을 직접 받는 것으로 착각할 수 있다
