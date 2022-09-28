//2022-09-23 - 3단계 @Component
package spring.core.ch01.ex05;

//@Component
public class Pistol implements Gun{
	@Override
	public void fire() {
		System.out.println("권총 탕탕.");
	}
}
// 스캔하다가 컴포넌트가 발견되면 ioc한다. ioc name을 표현한 것이다.
// 클래스 이름을 딴 소문자로 pistol이 bean의 이름이 된다