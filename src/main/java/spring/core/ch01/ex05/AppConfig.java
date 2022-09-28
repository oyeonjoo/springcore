//2022-09-23
package spring.core.ch01.ex05;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import lombok.AllArgsConstructor;
import spring.core.ch01.ex01.Gun;

@Configuration
//어느 페이지를 annotaion 할지 지정
@ComponentScan("spring.core.ch01.ex05")
public class AppConfig {

}
