import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
public class FileReaderDemo {
	public static void main(String[] args) {
		String path="C:\\Users\\002UMX744\\Documents\\visual studio";
		BufferedReader reader=null;
		String line=null;
		try {
			FileReader fr=new FileReader(path); //opening file stream
			reader = new BufferedReader(fr);// rapping buffer around it
			
			while(true) {
				line=reader.readLine();//reads a line from buffer
				if(line == null)// EOF
					break;
				System.out.println(line);
			}
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			try {
				if(reader!=null)
					reader.close();
			}catch(IOException e) {
				e.printStackTrace();
			}
		}
	}

}
