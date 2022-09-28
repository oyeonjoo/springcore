//2022-09-23
package spring.core.ch01.ex05;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import lombok.AllArgsConstructor;
import spring.core.ch01.ex01.Gun;

@Configuration
@ComponentScan("spring.core.ch01.ex05") // 어느 페이지를 annotaion 할지 지정, 루트패키지를 적어준다
public class AppConfig {

}
