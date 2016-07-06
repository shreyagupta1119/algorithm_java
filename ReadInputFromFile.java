import java.util.*;
import java.io.*;

public class ReadInputFromFile {
	public static void main(String[] args) {
                BufferedReader br = null;
		try {
			String str;
			br = new BufferedReader(new FileReader("/Users/pakhan/Workspce/pankajkh-temp-090516/algorithm_java/input.txt"));	
			File file = new File("/Users/pakhan/Workspce/pankajkh-temp-090516/algorithm_java/out.txt");

			
			if (!file.exists()) {
				file.createNewFile();
			}
			FileWriter fw = new FileWriter(file.getAbsoluteFile());
			BufferedWriter bw = new BufferedWriter(fw);

			while((str = br.readLine()) != null) {
				bw.write(str + "\n");
			}
                        bw.close();
			br.close();
		} catch (IOException ex){
			ex.printStackTrace();
		}	
		return;
	}
}
