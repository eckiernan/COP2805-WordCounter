import java.io.*;
import java.util.*;

public class WordCounter {

	public static void main(String[] args) throws Exception {
			
		BufferedReader reader = new BufferedReader(new FileReader("text1.txt"));
		String line = "", str = "";
		int wordsCount = 0;
		while ((line = reader.readLine()) != null) {
			str += line + " ";
		}
		StringTokenizer tokenizer = new StringTokenizer(str);
		while (tokenizer.hasMoreTokens()) {
			String string = tokenizer.nextToken();
			wordsCount++;
		}
		System.out.println("Number of words in file: " + wordsCount);

	}	
}
