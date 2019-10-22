import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class ep4 {
	//nio
	public static void main(String[] args) throws IOException {
		String filePath = "C:\\";
		String fileName = "ReaderBig5.txt";
		File file = new File(filePath,fileName);
		Path path = file.toPath();//Java 7
		List<String> lines = Files.readAllLines(path,Charset.defaultCharset());
		List<String> lines2 = Files.readAllLines(path,Charset.forName("utf-8"));
		
		for(String line : lines2) {
			System.out.println(line);
		}
		

	}

}
