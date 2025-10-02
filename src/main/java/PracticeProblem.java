import java.io.FileReader;
import java.io.IOException;

public class PracticeProblem {

	public static void main(String args[]) {

	}
//Question 1
public static String readFile(String filename) {
FileReader inputStream = null;
StringBuilder builder = new StringBuilder();
try {
	inputStream = new FileReader(filename); 
	int c;
	while ((c = inputStream.read()) != -1) {
	builder.append((char) (c));
	}
} catch (IOException e) {
		System.out.println(e); 
} finally {
		try {
			if (inputStream != null) {
 			inputStream.close();
		}
 	} catch (IOException e) {
		System.out.println("Error closing"); //
	}
}
return builder.toString();
}
//Question 2
public static String backwardsReadFile(String filename) {
	FileReader reader = null;
	StringBuilder builder = new StringBuilder();
	try {
		reader = new FileReader(filename);
		int c;
		while ((c = reader.read()) != -1) {
		builder.append((char) (c));	}
		} catch (IOException e) {
		System.out.println(e); 
		} finally {
			try {
				if (reader != null) {
 				reader.close();
		}
 	} catch (IOException e) {
		System.out.println("Error closing"); //
	}
}
return builder.reverse().toString();
}
}