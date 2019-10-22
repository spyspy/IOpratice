import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ep1 {

	public static void main(String[] args) {
		String filePath = "C:\\";
		String fileName = "big5.txt";
		File file = new File(filePath, fileName);
		
		if(file.exists()) {
			//IO Stream 會自己關閉
			try(FileReader fr = new FileReader(file)) {
				int _char;
				while((_char = fr.read()) != -1) {
					System.out.print((char)_char);
				}
				
			} catch (IOException e) {
				System.out.println("file not found"+e);
			}
		}else {
			System.out.println("file not found");
		}
	}

}
