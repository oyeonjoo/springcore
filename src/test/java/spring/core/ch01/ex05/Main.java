//2022-09-23
package spring.core.ch01.ex05;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
	public static void main(String[] args) {
		ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
		
		Shooter shooter = ctx.getBean("shooter", Shooter.class);
		shooter.fire();
	}
}

//dependency에러가 나오면 @Autowired일 확률이 높음
//두 번째로 많이 나는 에러는 bean type이 없을 때 ex) @Confonent을 안해줌 그런경우는 @Nullable