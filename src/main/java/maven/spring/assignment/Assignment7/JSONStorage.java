package maven.spring.assignment.Assignment7;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service("json")
@Primary
public class JSONStorage implements FileStorage{

	public void save() {

		System.out.println("file saved in json");
		
	}
	
	

}
