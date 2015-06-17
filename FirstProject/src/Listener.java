

import java.sql.Connection;
import java.sql.DriverManager;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

/**
 * Application Lifecycle Listener implementation class Listener
 *
 */
public class Listener implements ServletContextListener {

    /**
     * Default constructor. 
     */
    public Listener() {
        // TODO Auto-generated constructor stub
    }

	/**
     * @see ServletContextListener#contextInitialized(ServletContextEvent)
     */
    public void contextInitialized(ServletContextEvent servletContextEvent) {
        // TODO Auto-generated method stub
    	try {
    		System.out.println("***Sample listener***");
    		ServletContext sc = servletContextEvent.getServletContext();
    		sc.setAttribute("connection" ,"connection");
    		}catch(Exception e) {
    		e.printStackTrace();
    		}
    }

	/**
     * @see ServletContextListener#contextDestroyed(ServletContextEvent)
     */
    public void contextDestroyed(ServletContextEvent arg0) {
        // TODO Auto-generated method stub
    }	
}
