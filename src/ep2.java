import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.Date;

public class ep2 {

	public static void main(String[] args) {
		String imgFileName = "banner.jpg";
		String imgFilePath = "C:\\";
		String imgOutFileName = "google2.png";
		File imgFile = new File(imgFilePath, imgFileName);
		File outFile = new File(imgFilePath, imgOutFileName);
		
		if(imgFile.exists()) {
			try(FileInputStream in = new FileInputStream(imgFile)){
				FileOutputStream out = new FileOutputStream(outFile);
				
				int _data;
				byte[] byt = new byte[4096];
				Date date = new Date();
				long time1 = date.getTime();
				while((_data = in.read()) != -1) {
					out.write(byt,0,(char)_data);	
//					out.write((char)_data);
				}
				Date date2 = new Date();
				long time2 = date2.getTime();
				System.out.println("耗時:" + (time2-time1)/1000+"秒");
			}catch(IOException e){
				System.out.println("img fail:"+e);
			}
		}else {
			System.out.println("img not found");
		}
		

	}

}
