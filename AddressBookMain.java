package contactlist;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author Suraj kale
 * 
 */
public class AddressBookMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       System.out.println("Wel-come to AddressBook System");
       ArrayList<Contact> contactList = new ArrayList<Contact>();
       AddressBookMain add = new AddressBookMain();
         
        //method call
       add.addContactDetails();
      
	}     
   
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
		
		System.out.println(cont);
 }
}
