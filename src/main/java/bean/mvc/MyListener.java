package bean.mvc;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class MyListener implements ServletContextListener {
    private ServletContext servletContext = null;
    @Override
    public void contextInitialized(ServletContextEvent sce) {
        this.servletContext = sce.getServletContext();
        //servletContext.setAttribute("");
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {

    }
}
