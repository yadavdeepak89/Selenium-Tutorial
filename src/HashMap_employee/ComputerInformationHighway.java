package HashMap_employee;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class ComputerInformationHighway {
	
	public static void main(String[] args) {
		display();
	}

	public static void callContact(String name){
		System.out.println("Calling: "+name);
	}
	public static void saveContact(String name, long number){
		System.out.println("Saving contact: " + name  +": "+number);
		File file=new File("F:\\file.txt");
		try {
		
				//file.createNewFile();
		
				PrintWriter pw=new PrintWriter(new FileWriter(file,true));
				pw.println(name +":   "+number);
				pw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
	}
	
	public static void findNumber(String name){
		System.out.println("Could not find number " +name);
	}
	
	public static void display(){
		System.out.println("What would you like to do");
		System.out.println("1. Call contact");
		System.out.println("2. Save contact");
		System.out.println("3. Find Number.");
		
		Scanner in =new Scanner(System.in);
		String name;
		int choice=in.nextInt();
		in.nextLine();
		
	 	
		switch(choice){
			
			case 1:
				System.out.println("\nWho would you like to call? (FirstName LastName)");
				name=in.nextLine();
				callContact(name);
				break;
			case 2:
				System.out.println("\nWhat is the name of person you would like to save? (FirstName LastName)");
				name=in.nextLine();
				System.out.println("\nWhat is the phone number of the person you are saving? (4564564645)");
				long number=in.nextLong();
				in.nextLine();
				saveContact(name, number);
				break;
			case 3:
				System.out.println("\nWhat is the name of person whose phone number you are searching(FirstName LastName)");
				findNumber(in.nextLine());
				break;
			default:
				break;
				
		}
		
	}
}
