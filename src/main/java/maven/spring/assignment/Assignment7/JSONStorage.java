package maven.spring.assignment.Assignment7;

import java.io.File;

import java.lang.reflect.Field;
import java.util.Arrays;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service("json")
//@Primary
public class JSONStorage extends FileStorage{

	public void save(Object object){
		
			String content= "{"+System.lineSeparator();
		//String content = '{'+System.lineSeparator()+(object.getClass().getSimpleName())+ System.lineSeparator() ;
	       Field[] fields= object.getClass().getFields();
	  
	       
	       for(int i=0;i<fields.length;i++){
			try {
			
				content+="\""+fields[i].getName()+"\""+':'; 
				content+="\""+fields[i].get(object)+"\","+System.lineSeparator();
					
			} catch (IllegalArgumentException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	       }
	        content+= '}' ;
	   	File file = new File("Json_file.json");

	   	writeFile(file,content);

	System.out.println("JSON file created");

	}
	
	

}
