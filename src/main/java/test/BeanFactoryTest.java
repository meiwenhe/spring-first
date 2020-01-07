package test;
import bean.MyTestBean;
import bean.cycle.TestA;
import bean.initdestroy.InitAndDestroyBean;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.testng.annotations.Test;

public class BeanFactoryTest {

    public  static  void main(String[] args){

        testSimpleLoad();
    }

   /* @Test*/
    public static void testSimpleLoad(){

        //BeanFactory factory = new XmlBeanFactory(new ClassPathResource("spring/beanFactoryTest.xml"));
        BeanFactory factory = new XmlBeanFactory(new ClassPathResource("spring/spring-mvc.xml"));
        MyTestBean myTestBean = (MyTestBean) factory.getBean("myTestBeanId");
        MyTestBean myTestBean2 = (MyTestBean) factory.getBean("myTestBeanId");
        System.out.println(myTestBean.getTestString());

        //循环依赖测试
        /*BeanFactory factory = new XmlBeanFactory(new ClassPathResource("spring/cycle.xml"));
        TestA testA = (TestA) factory.getBean("testA");*/


       /* ApplicationContext context =
                new ClassPathXmlApplicationContext("spring/beanFactoryTest.xml");
        MyTestBean myTestBean1  = (MyTestBean) context.getBean("myTestBeanId");
        System.out.println(myTestBean1.getTestString());*/


        //FileSystemXmlApplicationContext  绝对文件路径
        /*ApplicationContext context = new FileSystemXmlApplicationContext
                ("H:/idea_workspace/spring-book/spring-first/src/main/resources/spring/beanFactoryTest.xml");
        MyTestBean myTestBean1  = (MyTestBean) context.getBean("myTestBeanId");
        System.out.println(myTestBean1.getTestString());*/


        /*AbstractApplicationContext context =
                new ClassPathXmlApplicationContext("spring/initAndDestroyBean.xml");
         InitAndDestroyBean myTestBean = (InitAndDestroyBean) context.getBean("initAndDestroy");
        System.out.println(myTestBean.getTestString());
        context.registerShutdownHook();*/
    }
}
