import java.io.*;
import java.text.*;
import java.util.*;
public class StudentList {
	public static void main(String[] args) {

//		Check arguments
		if(args[0].equals("a")) {
			System.out.println("Loading data ...");			
			try {
				BufferedReader bufferedReader = new BufferedReader(
					new InputStreamReader(
							new FileInputStream("students.txt"))); 
			String line = bufferedReader.readLine();
			String studentNames[] = line.split(",");			
			for(String studentName : studentNames) {
				 System.out.println(studentName.trim()); 
				}
			} catch (Exception exception){

			} 
			System.out.println("Data Loaded.");
		}
		else if(args[0].equals("r")) {
			System.out.println("Loading data ...");			
				try {
					BufferedReader bufferedReader = new BufferedReader(
						new InputStreamReader(
							new FileInputStream("students.txt"))); 
			String line = bufferedReader.readLine();
			//System.out.println(r);
			String studentNames[] = line.split(",");	
			System.out.println(studentNames[0].trim());
			Random random = new Random();
			int randomNumber = random.nextInt();
			System.out.println(studentNames[randomNumber]);
			} catch (Exception e){

			} 
			System.out.println("Data Loaded.");			
		}
		else if(args[0].contains("+")){
			System.out.println("Loading data ...");			
			try {
				BufferedWriter bufferedWriter = new BufferedWriter(
					new FileWriter("students.txt", true));
			String index = args[0].substring(1);
	        Date date = new Date();
	        String dateFormatSample = "dd/mm/yyyy-hh:mm:ss a";
	        DateFormat dateFormat = new SimpleDateFormat(dateFormatSample);
	        String updatedDate= dateFormat.format(date);
			bufferedWriter.write(", "+index+"\nList last updated on "+updatedDate);
			bufferedWriter.close();
			} catch (Exception e){

			}
							
			System.out.println("Data Loaded.");	
		}
		else if(args[0].contains("?")) 
		{
			System.out.println("Loading data ...");			
			try {
				BufferedReader bufferedReader = new BufferedReader(
					new InputStreamReader(
						new FileInputStream("students.txt"))); 
			String line = bufferedReader.readLine();
			String studentNames[] = line.split(",");	
			boolean done = false;
			String firstName = args[0].substring(1);
			for(int index = 0; index<studentNames.length && !done; index++) {
				if(studentNames[index].equals(firstName)) {
					System.out.println("We found it!");
					done=true;
					}
				}
			} catch (Exception e){

			} 
			System.out.println("Data Loaded.");				
		}
		else if(args[0].contains("c")) {
			System.out.println("Loading data ...");			
			try {
				BufferedReader bufferedReader = new BufferedReader(
					new InputStreamReader(
						new FileInputStream("students.txt"))); 
			String line = bufferedReader.readLine();
			String studentNames[] = line.split(",");
			char letters[] = line.toCharArray();			
			boolean in_word = false;
			int count=0;
			for(char letter:letters) {
				if(letter ==' ') {
					if (!in_word) {	
						count++; 
						in_word =true;	
					}
					else { 
						in_word=false;
					}			
				}
			}
			System.out.println(count +" word(s) found " + studentNames.length);
			} catch (Exception e){

			} 
			System.out.println("Data Loaded.");
							
		}
	}
}