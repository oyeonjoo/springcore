package spring.core.ch01.ex02;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Setter;
import spring.core.ch01.ex01.Gun;

@Setter // lombok에게 setter를 만들게 한다 > 클래스에 자바코드로 자동 생성된다
@NoArgsConstructor // arg가 없는 생성자
@AllArgsConstructor // arg가 있는 생성자
public class Shooter {
	private String name;
	private Gun gun;
	
	public void fire() {
		System.out.print(name + ": ");
		gun.fire();
	}
} // 스프링 컨테이너
