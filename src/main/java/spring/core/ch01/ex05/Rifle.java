//2022-09-23
package spring.core.ch01.ex05;

import org.springframework.stereotype.Component;

//id 직접 지정
//@Component("rifleGun")
public class Rifle implements Gun{
	@Override
	public void fire() {
		System.out.println("소총 탕탕.");
	}
}
