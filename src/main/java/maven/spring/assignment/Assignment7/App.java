package maven.spring.assignment.Assignment7;

import java.lang.reflect.Field;
import java.util.Arrays;

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
   
    
    public static void main( String[] args ) throws IllegalArgumentException, IllegalAccessException
    {
    
        ConfigurableApplicationContext configurableApplicationContext = SpringApplication.run(App.class, args);
        Test demo = configurableApplicationContext.getBean(Test.class);
        demo.test();
    }
   
    
}
