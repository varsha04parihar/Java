package SpringMVCDemo.Spring_Training;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import org.springframework.jdbc.core.JdbcTemplate;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
        
        
        //Auto wired annotation
        AutoWiredAnnotation aa =  context.getBean("autoanno", AutoWiredAnnotation.class);
        System.out.println(aa);
        
        
        //Component annotation
        
        ComponentAnnotation ca =  context.getBean("ca", ComponentAnnotation.class);
        Address add=context.getBean("add",Address.class);
        System.out.println(ca);
        System.out.println(add);
        System.out.println(ca.getAddress());
       
        //jdbc insert 
        JdbcTemplate template = null;

        String query="insert into employee_data(id,name,email) values(?,?,?)";
        int result=template.update(query,11,"Vanya","vanya@gmail.com");
        System.out.println("("+result+")numbers of row inserted");
        
    }
}
