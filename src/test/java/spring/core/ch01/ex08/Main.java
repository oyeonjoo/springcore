//2022-09-26
package spring.core.ch01.ex08;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
	public static void main(String[] args) {
		ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
		
		Lion lion1 = ctx.getBean(Lion.class);
		Lion lion2 = ctx.getBean(Lion.class);
		
		Leopard leopard1 = ctx.getBean(Leopard.class);
		Leopard leopard2 = ctx.getBean(Leopard.class); // 여기까진 singleton으로 몇 번을 콜해도 하나가 나옴
		
		Lapin lapin1 = ctx.getBean(Lapin.class);
		Lapin lapin2 = ctx.getBean(Lapin.class); //prototype이기 때문에 false가 나옴
		
		System.out.println("Lion: " + (lion1 == lion2)); //true
		System.out.println("Leopard: " + (leopard1 == leopard2)); //true
		System.out.println("Lapin: " + (lapin1 == lapin2)); //false
	}
}
