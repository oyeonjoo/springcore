//2022-09-23 - 3단계 @Component
package spring.core.ch01.ex05;

//@Component
public class Pistol implements Gun{
	@Override
	public void fire() {
		System.out.println("권총 탕탕.");
	}
}
