package spring.core.ch02.ex03;

import java.time.LocalDateTime;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class Timer {
	@Before("execution(* spring..*(int))")
	public void clockStart(JoinPoint jp) {
		System.out.println(jp.toShortString());
		System.out.println("시작 시각: " + LocalDateTime.now());
	} // 조인포인트가 되는 것은 메소드, 파라미터가 int인 메소드
	
	@After("within(spring..Calculator)")
	public void clockEnd(JoinPoint jp) {
		System.out.println(jp.toShortString());
		System.out.println("종료 시각: " + LocalDateTime.now());
	} // 클래스안에 있는 메소드, 클래스 관점
	
	@AfterReturning(pointcut="bean(calc*)", returning="result")
	public void printResult(JoinPoint jp, int result) { // 변수명과 일치
		System.out.println(jp.toShortString() + ": " + result);
	}
	// 조인포인트가 실행 성공하는 경우, 빈의 관점, returning: 조인포인트 리턴값에 붙이는 이름 > result 변수에 저장
}
// 어드바이스는 어라운드, 비포, 애프터 등의 어노테이션이 붙은 메소드이다
// 어드바이스를 가지고 있는 bean이 에스펙이다.
// n개의 빈으로부터 공통된 에스펙을 분리해서 가지고 있는 빈이 에스펙이다
// @before : join point 전에 실행되는 것
// 메소드 관점 + 클래스 관점