package spring.core.ch01.ex02;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("app.xml", Main.class);
		// xml 문서를 읽을 수 있는 컨테이너, 직접 컨테이너를 만든 것이다. Main.class: class 타입의 객체가 리턴된다.
		Shooter shooter1 = ctx.getBean("shooter1", Shooter.class);
		Shooter shooter2 = ctx.getBean("shooter2", Shooter.class); // IOC
		// 자동으로 오브젝트 타입으로 프로모션 되었기 때문에, 꺼내면서 shooter 타입으로 캐스팅해준다, getBean으로 꺼낸다
		// new Shooter는 컨테이너가 하고, 나는 꺼내쓰는 것이다.
		shooter1.fire();
		shooter2.fire();
	}
}
