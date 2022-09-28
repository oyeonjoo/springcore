//2022-09-26
package spring.core.ch02.ex01;

public class Calculator {
	private void calc() {
		try {
			Thread.sleep((long)(Math.random() * 1000));
		} catch(Exception e) {}
	}
	
	public void start() {
		long start = System.currentTimeMillis();
		calc();
		long end = System.currentTimeMillis();
		
		System.out.println("경과시간: " + (end - start));
	}
} // 계산기: 계산하다, 토끼: 자다, 중복: 시간을 측정하다 > 별도의 객체를 만든다
