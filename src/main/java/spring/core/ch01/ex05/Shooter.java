//2022-09-23 ioc의 방법 3단계
package spring.core.ch01.ex05;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Component;

@Component
public class Shooter {
	//ioc => Componenet
	//di => Autowired
	@Autowired @Nullable private Gun pistol;
	@Autowired @Nullable private Gun rifleGun;
	
	public void fire() {
		try {
			pistol.fire();
			rifleGun.fire();
		} catch (NullPointerException e) {}
		
	}
}

//동일한 type의 bean이 2개 이상일 경우, 그 다음엔 id로 찾아봄. (보통은 1개에 1개가 맞음)
