package EmailApp;

import java.util.Scanner;

public class Email {

	private String firstName;
	private String lastName;
	private String password;
	private String department;
	private String email;
	private int mailboxCapacity = 500;
	private String alternateEmail;
	private String companySuffix = "gmail.com";
	private int defaultPasswordLength = 8;

// Constructor to receive the first and last name 
	public Email(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
		System.out.println("Email created: " + " " + this.firstName + " " + this.lastName);

		// Call a method asking for the Department
		this.department = setDepartment();
		System.out.println("Department: " + this.department);

		// Call a method that returns a random password
		this.password = randomPassword(defaultPasswordLength);
		System.out.println("Your password is :" + this.password);

		// combine elements to generate email
		email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + department + "." + companySuffix;
		System.out.println("Your Email is :" + email);

	}

// Ask for the Department 
	private String setDepartment() {
		System.out.println(
				"Department Code\n 1 for Sales \n 2 for Development\n 3 for Accounting\n 0 for none\nEnter Department Code");
		Scanner scn = new Scanner(System.in);

		int depchoice = scn.nextInt();
		if (depchoice == 1) {
			return "Sales";
		} else if (depchoice == 2) {
			return "Development";
		} else if (depchoice == 3) {
			return "Accounting";
		} else {
			return " ";
		}

	}

// Generate a random password 
	private String randomPassword(int length) {
		String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789#$@%^&*";

		char[] password = new char[length];

		for (int i = 0; i < length; i++) {
			int random = (int) (Math.random() * passwordSet.length());
			password[i] = passwordSet.charAt(random);

		}
		return new String(password);
	}

// set the mail Box capacity 
	public void setMailboxCapacity(int capacity) {
		this.mailboxCapacity = capacity;
	}

// set the alternate email 
	public void setAlternateEmail(String altEmail) {
		this.alternateEmail = altEmail;
	}

// change the password	
	public void changePassword(String Password) {
		this.password = password;
	}

	public int getMailboxCapacity() {
		return mailboxCapacity;
	}

	public String getAlternateEmail() {
		return "Alternate Email :" + alternateEmail;
	}

	public String getPassword() {
		return password;
	}

	public String showinfo() {

		return " Name :" + firstName + " " + lastName + "\n Company Email : " + email + "\n MailBox Capacity : "
				+ mailboxCapacity + "mb";

	}

}
