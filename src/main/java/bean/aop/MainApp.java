package bean.aop;

import com.mei.study.framework.servlet.v1.MyDispatcherServlet;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class MainApp {
   public static void main(String[] args) {
      ApplicationContext context = 
             new ClassPathXmlApplicationContext("spring/myAop.xml");
      Student student = (Student) context.getBean("student");
      student.getName();
      student.getAge();      
      student.printThrowException();

      MyDispatcherServlet myDispatcherServlet = new MyDispatcherServlet();
   }
}