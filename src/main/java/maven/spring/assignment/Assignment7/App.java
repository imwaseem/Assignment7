package maven.spring.assignment.Assignment7;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * Hello world!
 *
 */
@SpringBootApplication
public class App 
{
   
    
    public static void main( String[] args )
    {
    
        System.out.println( "Hello World!" );
   
        ConfigurableApplicationContext configurableApplicationContext = SpringApplication.run(App.class, args);
        Test demo = configurableApplicationContext.getBean(Test.class);
        demo.test();
    }
   
}
