package spring.core.ch02.ex04;

import org.springframework.stereotype.Component;

@Component
public class Calculator {
   @Log
   public void add() {
      System.out.println(1 + 2);
   } // jp가 된다
   
   public void minus() {
      System.out.println(2 - 1);
   } // @Log가 없기 때문에 jp가 되지못한다
   
   @Log
   public void divide() {
      int result = 1 / 0;
      System.out.println(result);
   } // jp의 후보가 된다
}