import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class AplicatiaDoi {
	public static void main (String[] args) throws FileNotFoundException {
		
		Scanner in = new Scanner(new File("Students.txt"));
		List<String> Students = new ArrayList<String>();
		
		while(in.hasNextLine()) {
			Students.add(in.nextLine());
		}
		for(int i = 0; i < Students.size(); i++) {
			System.out.println("name: " + Students.get(i));
		}
		in.close();
	}
}


