package spring.core.ch01.ex03;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import spring.core.ch01.ex01.Pistol;
import spring.core.ch01.ex01.Rifle;
import spring.core.ch01.ex02.Shooter;

@Configuration
public class AppConfig {
	@Bean
	public Pistol pistol() {
		return new Pistol();
	}
	
	@Bean
	public Rifle rifle() {
		return new Rifle();
	}
	
	@Bean
	public Shooter shooter1() {
		return new Shooter("최한석", pistol()); // pistol은 메소드
	}
	
	@Bean
	public Shooter shooter2() {
		Shooter shooter = new Shooter();
		shooter.setName("한아름");
		shooter.setGun(rifle());
		
		return shooter;
	}
}
// bean의 정보를 메소드로 적는다, 단점은 내가 직접 new를 써야하는 것이다. 장점은 어노테이션만 있으면 직접 쓰지 않아도 된다는 것이다.