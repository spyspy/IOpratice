import java.io.*;

public class ep5 {
	//IO串接:只有同類型的才能串再一起，reader串reader....
	//轉碼
	public static void main(String[] args) {
		String filePath = "C:\\";
		String fileName = "ReaderBig5.txt";
		try(BufferedReader in = new BufferedReader(
				new InputStreamReader(
					new FileInputStream(
						new File(filePath,fileName)), "UTF-8"))){
			
			String lineData;
			while((lineData = in.readLine()) != null) {
				System.out.println(lineData);
			}
				
				
		}catch(IOException e){
			System.out.println("img fail:"+e);
		}
		

	}

}
