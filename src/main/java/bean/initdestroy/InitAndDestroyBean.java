package bean.initdestroy;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class InitAndDestroyBean implements InitializingBean, DisposableBean {
    @Override
    public void destroy() throws Exception {
        System.out.println("InitAndDestroyBean.destroy");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("InitAndDestroyBean.init");
    }


    private String testString = "testString";

    public String getTestString(){
        return this.testString;
    }
    public void setTestString(String testString){
        this.testString = testString;
    }
}
