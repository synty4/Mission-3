
package JournalsM3;
import java.util.HashMap;
import java.util.Scanner;

/**
 * Classe Main
 
 */
public class Main {
	
	public static void main(String[] args) {
		
		Journals journals = new Journals(args[0]);
		Reader reader = journals.getInput();
		
		HashMap<String,Magazine> hashmap = new HashMap<String,Magazine>();
		
		String line = reader.readNextLine();
		if (line == null)
			System.out.println("Your file does not contain any usefull content");
		line = reader.readNextLine();
		if (line == null)
			System.out.println("Your file does not contain any usefull content");
		
		while (true) {
			String[] parseLine = journals.parseLine(line);
			
			Magazine magazine = new Magazine(parseLine);
			
                        hashmap.put(parseLine[1].toLowerCase(), magazine);

			line = reader.readNextLine();

			if (line == null)
				break;
			while (line.equals("")) { 
				line = reader.readNextLine();
				if (line == null)
					break;
			}
		}
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter title magazine");
		System.out.println("Enter q to stop");
		
		String title;
		title = in.nextLine();
		while (!title.equals("q")) {
                        Magazine magazine = (Magazine) hashmap.get(((String) title).toLowerCase());
			if (magazine == null) {
				System.out.println("Your magazine hasn't been found");
			}
			else {
				System.out.println(magazine.toString());
			}
			title = in.nextLine();
		}
		
		in.close();
		reader.close();
	}
}
