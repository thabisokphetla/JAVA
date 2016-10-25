package fileIO;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/**
 * 
 * @author Thabiso K Phetla
 *
 */
public class CreateCopyFile {
	 public static void main(String[] args) {
		try {
			File file1 = new File("Information.txt");//This is where you read in the file
			File file2 = new File("Infor.txt");//here the file does not exist therefor it shall be created
			
			InputStream in = new FileInputStream(file1); 
			OutputStream out = new FileOutputStream(file2);
			
			byte[] b = new byte[1024];
			int len;
			while ((len = in.read(b))> 0) {
				out.write(b, 0 , len);
			}
		
			in.close();
			out.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
