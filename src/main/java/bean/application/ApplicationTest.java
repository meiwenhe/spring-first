package bean.application;


import bean.MyTestBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ApplicationTest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring/beanFactoryTest.xml");
        MyTestBean bean =  (MyTestBean) context.getBean("myTestBeanId");
        System.out.println( bean.getTestString());
    }
}
