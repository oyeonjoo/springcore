package spring.core.ch02.ex02;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class Timer {
            // 메소드가 퍼블릭     해당 주소의           *: all, 모든 class 의 메소드
            // 여기서 .. 은 n개가 와도 된다 라는 뜻이다.(0개이상의 무언가)
   @Pointcut("execution(public * spring.core.ch02.ex02..*(..))")
   private void myPointcut() {} // 포인트컷에 마이포인트라고 이름을 붙여준 것
   
   @Around("myPointcut()")
   public Object clock(ProceedingJoinPoint jp) throws Throwable {
      System.out.println(jp.getSignature()); // 조인포인트의 패턴을 기술한다
      
      long start = System.currentTimeMillis(); // jp전에 실행
      Result result = (Result)jp.proceed(); // proceed를 쓰려고 ProceedingJoinPoint를 쓴 것이다
      long end = System.currentTimeMillis(); // jp후에 실행
      
      System.out.println("경과시간: " + (end - start));
      
      result.setResult(result.getResult() + "(clock)"); // jp로부터 리턴받은 값을
      return result;
   }
}