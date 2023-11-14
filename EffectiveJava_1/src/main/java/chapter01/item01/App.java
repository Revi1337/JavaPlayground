package chapter01.item01;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {

    public static void main(String[] args) {
        ApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
        HelloService helloService = annotationConfigApplicationContext.getBean(HelloService.class);
        System.out.println(helloService.hello());
    }
}
