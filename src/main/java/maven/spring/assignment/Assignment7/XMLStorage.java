package maven.spring.assignment.Assignment7;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service("xml")
@ConditionalOnProperty("scientific")
//@Primary
public class XMLStorage implements FileStorage{

	
	public void save() {
	
		System.out.println("file saved in xml");		
	}

	
}

