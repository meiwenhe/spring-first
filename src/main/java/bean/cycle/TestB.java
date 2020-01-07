package bean.cycle;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.context.WebApplicationContext;

public class TestB {

    private TestC c;
    @Autowired
    private WebApplicationContext webApplicationContext;

    public TestB(TestC c){
        this.c = c;
    }
}
