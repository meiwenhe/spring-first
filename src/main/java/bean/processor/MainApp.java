package bean.processor;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
   public static void main(String[] args) {
      AbstractApplicationContext context = new ClassPathXmlApplicationContext("spring/processor.xml");
      HelloWorld obj = (HelloWorld) context.getBean("helloWorld");
      obj.getMessage();
      context.registerShutdownHook();

      HelloWorld ob2 = (HelloWorld) context.getBean("helloWorld");
      ob2.getMessage();
      context.registerShutdownHook();
   }
}