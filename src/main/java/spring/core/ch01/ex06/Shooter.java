package spring.core.ch01.ex06;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Component;

@Component
public class Shooter {
	@Autowired private Pistol pistol;
	@Autowired @Nullable private Rifle rifle;
	
	public void fire() {
		pistol.fire();
		if(rifle != null)rifle.fire();
	}
}

//계획한 null은 if로 작성하는게 좋고, 계획되지 않은 null을 try로 감싸는게 좋음