import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ep3 {

	public static void main(String[] args) {
		String filePath = "C:\\";
		String fileName = "ReaderBig5.txt";
//		try(FileReader in = new FileReader(new File(filePath,fileName));){
		try(BufferedReader in = new BufferedReader(new FileReader(new File(filePath,fileName)))){
			
			String lineData;
			while((lineData = in.readLine()) != null) {
				System.out.println(lineData);
			}
				
				
		}catch(IOException e){
			System.out.println("img fail:"+e);
		}
		

	}

}
