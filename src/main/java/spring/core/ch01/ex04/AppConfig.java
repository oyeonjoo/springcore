//2022-09-23 config1, 2, AppConfig 통합
package spring.core.ch01.ex04;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import spring.core.ch01.ex01.Gun;
import spring.core.ch01.ex02.Shooter;

@Configuration
@Import({Config1.class, Config2.class}) // configuration 통합, 총 3개가 통합된 것이다.
public class AppConfig {
	//멤버변수 선언(configuration) 후 @Autowired를 선언하면 di할 객체를 찾아준다.
	@Autowired private Gun pistol;
	@Autowired private Gun rifle; // @Autowired: 컨테이너가 해당 기능을 찾아서 di를 해준다
	
	@Bean
	public Shooter shooter1() {
		return new Shooter("최한석", pistol); // pistol은 멤버변수명이다.
	}
	
	@Bean
	public Shooter shooter2() {
		Shooter shooter = new Shooter();
		shooter.setName("한아름");
		shooter.setGun(rifle);
		
		return shooter;
	}
}
