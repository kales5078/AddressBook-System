package contactlist;

import java.util.ArrayList;
import java.util.Scanner;

public class EditContact {
	
	static ArrayList<Contact> contactList = new ArrayList<Contact>();
	
	//create a method to get input from user
	  public void addContactDetails() {
		    
		    Scanner sc = new Scanner(System.in);
			System.out.println("Enter the contact details:");
			System.out.println("Enter the first name:");
			String firstName = sc.next();
			System.out.println("Enter the last name:");
			String lastName = sc.next();
			System.out.println("Enter the address:");
			String address = sc.next();
			System.out.println("Enter the city:");
			String city = sc.next();
			System.out.println("Enter the state:");
			String state = sc.next();
			System.out.println("Enter the email:");
			String email = sc.next();
			System.out.println("Enter the phonenumber:");
			int  phoneNumber = sc.nextInt();
			System.out.println("Enter the zip:");
	    	int  zip =sc.nextInt();
	    	
	    	Contact cont = new Contact();
	        cont.setFirstname(firstName);
			cont.setLastname(lastName);
			cont.setCity(city);
			cont.setEmail(email);
			cont.setAddress(address);
			cont.setState(state);
			cont.setZip(zip);
			cont.setPhonenumber(phoneNumber); 
						
	 }
	
	// create method to edit Contact Details
	
		
	  public void editContactDetails(String fName) {
		  
		  for (Contact cont : contactList) {

				if (cont.getFirstname().equals(fName)) {
                     
					System.out.println("Enter the detail which needs to be updated:");

					System.out.println("1 : First Name of the contact to be edited");
					System.out.println("2 : Last Name of the contact to be edited");
					System.out.println("3 : Address of the contact to be edited");
					System.out.println("4 : City of the contact to be edited");
					System.out.println("5 : State of the contact to be edited");
					System.out.println("6 : Zip of the contact to be edited");
					System.out.println("7 : Phone Number of the contact to be edited");
					System.out.println("8 : Email of the contact to be edited");

					System.out.println("Select the Number for the contact detail ");
                    Scanner sc = new Scanner(System.in);
					int choice = sc.nextInt();
					switch (choice) {
					case 1: 
						System.out.println("Enter First Name: ");
						String firstName = sc.next();
						cont.setFirstname(firstName);
						break;			
		
					case 2: 
						System.out.println("Enter last name: ");
						String lastName = sc.next();
						cont.setLastname(lastName);
						break;
					
					case 3: 
						System.out.println("Enter Address: ");
						String address = sc.next();
						cont.setAddress(address);
						break;
					
					case 4: 
						System.out.println("Enter City: ");
						String city = sc.next();
						cont.setCity(city);
						break;
					
					case 5: 
						System.out.println("Enter State: ");
						String state = sc.next();
						cont.setState(state);
						break;
					
					case 6: 
						System.out.println("Enter Zip: ");
						long zip = sc.nextLong();
						cont.setZip(zip);
						break;
					
					case 7: 
						System.out.println("Enter Phone Number:");
						long phoneNumber = sc.nextLong();
						cont.setPhonenumber(phoneNumber);
						break;
					
					case 8: 
						System.out.println("Enter Email Code: ");
						String email = sc.next();
						cont.setEmail(email);
						break;
						
					default:
							break;
				}
		}
			
	}

}

	
public static void main(String[] args) {
		// TODO Auto-generated method stub

	       EditContact add = new EditContact();
	       
	       boolean flag = true ;
	       while(flag) {
	         Scanner sc  = new Scanner(System.in);
	         System.out.println("Enter your choice");
	        
	         
	         System.out.println("Press 1 to Add contact ");
	         System.out.println("Press 2 to Edit contact");
	         int Cho = sc.nextInt();
	         switch(Cho) {
	    		case 1:
	    			System.out.println("Add your contact Details");
	    		      add.addContactDetails();
	    			break;
	    		case 2:
	    			System.out.println("Edit first Name to edit Contact");
	    			String firstName = sc.next();
	    			add.editContactDetails(firstName);
	    			break;	
	    		
	    		default:
	    		System.out.println("Enter correct choice");

	     	}
	       
		}     
	   
	}	
	
}
