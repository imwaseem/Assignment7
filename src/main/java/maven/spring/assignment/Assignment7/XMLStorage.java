package maven.spring.assignment.Assignment7;

import java.io.File;
import java.lang.reflect.Field;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@ConditionalOnProperty(value="xmlFile")
@Service("xml")
@Primary

public class XMLStorage extends FileStorage{

	
	public void save(Object object){
		
	       String content = '<'+object.getClass().getSimpleName()+'>'+ System.lineSeparator() ;
	       Field[] fields= object.getClass().getFields();
	     
	       for(int i=0;i<fields.length;i++){
			try {
			
				content+='<'+fields[i].getName()+'>'; 
				content+=fields[i].get(object);
				content+='<'+File.separator+fields[i].getName()+'>'+ System.lineSeparator(); 
			
			} catch (IllegalArgumentException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	       }
	    content+= '<'+object.getClass().getSimpleName()+'>' ;
	   	File file = new File("xml_file.xml");
	   	writeFile(file,content);

				
	}
	
	
	
}

