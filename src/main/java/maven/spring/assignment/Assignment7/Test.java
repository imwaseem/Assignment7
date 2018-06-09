package maven.spring.assignment.Assignment7;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;

@Component
public class Test {
	 @Autowired
	  @Qualifier("xml")
	  FileStorage obj;
	public void test(){
		obj.save();
	}
}
