//2022-09-23 ioc의 방법 3단계
package spring.core.ch01.ex05;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Component;

@Component
public class Shooter {
	@Autowired @Nullable private Gun pistol; // @Nullable: null이어도 괜찮다
	@Autowired @Nullable private Gun rifleGun;
	
	public void fire() {
		try {
			pistol.fire();
			rifleGun.fire();
		} catch (NullPointerException e) {}
		
	}
}
// ioc는 @Component, di는 @Autowired로 표현한다
// 1개의 클래스에 동일한 type의 bean이 2개 이상일 경우, 그 다음엔 id로 찾아본다. (보통은 1개에 1개가 맞음)
// type이 Gun이면서 pistol인 것, type이 Gun이면서 rifle인 것을 찾는다.
// Gun type이 2개이기 때문에 에러가 난다 rifle > rifleGun으로 바꿔주면 에러가 나지 않는다.
