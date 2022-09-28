package spring.core.ch01.ex06;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface NoComponent { // 컴포넌트하지 않으려고 만드는 어노테이션

}

/*
과제:
class에 적용하고, bean 상태에서 살아남아 있는 annotaion을 만들어라.
*/