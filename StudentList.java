import java.io.*;
import java.text.*;
import java.util.*;
public class StudentList {
	public static void main(String[] args){
		if(args[0].length() != 1) 
			System.out.println(Constants.invalidInput);
		if(args[0].equals(Constants.inputA)) {
			System.out.println(Constants.dataStatus);			
			try {
				
			String studentNames[] = getString();			
			for(String studentName : studentNames) {
				 System.out.println(studentName.trim()); 
				}
			} catch (Exception exception){

			} 
			System.out.println(Constants.dataLoaded);
		}
		else if(args[0].equals(Constants.inputR)) {
			System.out.println(Constants.dataStatus);			
				try {
			String studentNames[] = getString();	
			System.out.println(studentNames[0].trim());
			Random random = new Random();
			int randomNumber = random.nextInt();
			System.out.println(studentNames[randomNumber]);
			} catch (Exception e){

			} 
			System.out.println(dataLoaded);			
		}
		else if(args[0].contains(Constants.inputPlus)){
			System.out.println(Constants.dataStatus);			
			try {
				BufferedWriter bufferedWriter = new BufferedWriter(
					new FileWriter(Constants.fileName, true));
			String index = args[0].substring(1);
	        Date date = new Date();
	        String dateFormatSample = Constants.dateFormat;
	        DateFormat dateFormat = new SimpleDateFormat(dateFormatSample);
	        String updatedDate= dateFormat.format(date);
			bufferedWriter.write(", "+index+Constants.listUpdate+updatedDate);
			bufferedWriter.close();
			} catch (Exception e){

			}
							
			System.out.println(Constants.dataLoaded);	
		}
		else if(args[0].contains(Constants.inputQues)) 
		{
			System.out.println(Constants.dataStatus);			
			try {
			String studentNames[] = getString();	
			boolean done = false;
			String firstName = args[0].substring(1);
			for(int index = 0; index<studentNames.length && !done; index++) {
				if(studentNames[index].equals(firstName)) {
					System.out.println(Constants.foundStatus);
					done=true;
					}
				}
			} catch (Exception e){

			} 
			System.out.println(dataLoaded);				
		}
		else if(args[0].contains(Constants.inputC)) {
			System.out.println(dataStatus);			
			try {
				
			String studentNames[] = getString();
			char letters[] = line.toCharArray();			
			boolean in_word = false;
			int count=0;
			for(char letter:letters) {
				if(letter == Constants.space) {
					if (!in_word) {	
						count++; 
						in_word =true;	
					}
					else { 
						in_word=false;
					}			
				}
			}
			System.out.println(count + wordFound + studentNames.length);
			} catch (Exception e){

			} 
			System.out.println(dataLoaded);
							
		}
		else System.out.println(Constants.invalidInput);
	}
		private static string getString(){
			try{
				BufferedReader bufferedReader = new BufferedReader(
					new InputStreamReader(
							new FileInputStream(Constants.fileName))); 
				String line = bufferedReader.readLine();
		}catch(exception Exception){
			
		}
		return ling.split(Constants.lineSplit);
	}
}