package maven.spring.assignment.Assignment7;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public abstract class FileStorage {

	public void save(Object object){
		
	}
	
	public void writeFile(File file,String content){
		try {
			OutputStream fop = new FileOutputStream(file);

			// get the content in bytes
			byte[] contentInBytes = content.getBytes();

			fop.write(contentInBytes);
		
			fop.close();

			

		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}
	
}
