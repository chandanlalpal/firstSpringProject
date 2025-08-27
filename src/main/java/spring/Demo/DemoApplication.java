package spring.Demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
		System.out.println("hello");
	}

    /*
    http://localhost:8080/demo/apis/demo1
    http://localhost:8080/demo/apis/demo2
    http://localhost:8080/sample/apis/sample1
    http://localhost:8080/simple/apis/simple1
     */

}
