package password;
import java.util.Scanner;

import javax.swing.JOptionPane;
/*initialize variables for account type, username and password
 * prompt for and select account type using JOption Pane
 * prompt for username
 * while the username does not match and the trials do not exceed the limit,repeat prompting for username and add the number of trials
 * if trials exceed limit, ask for admin and terminate program
 * if not, prompt for password
 * while the password does not match inputpassword and the trials do not exceed the limit, repeat prompting for password and add the number of trials;
 * if trials exceed limit, ask for admin and terminate program
 * if not, check account
 * branch off of different account types using switch case
 * display response for appropriate account type 
 * terminate program
 */
public class ProjectPassword {
public static void main(String[]args){
	//initializing variables
	String inputpassword,inputusername, staffusername, staffpassword, studentusername, studentpassword, adminusername,adminpassword;
	staffusername = "fzero30";
	staffpassword = "pie";
	studentusername = "zatch338";
	studentpassword = "pie";
	adminusername = "reality7";
	adminpassword = "pie";
	int trial;
	
	
	
	
	String[] choices = {"Admin", "Student", "Staff"};
	String input = (String) JOptionPane.showInputDialog(null, "Choose Account Type","Account Type",JOptionPane.QUESTION_MESSAGE, null, choices, choices[1]);
	System.out.println(input);
	
	
trial = 1;

//get the loops running so that if either condition is not met than you exit the loop for each case
switch (input) {
case "Staff":{
while (trial <= 3) {

	 inputusername = JOptionPane.showInputDialog(null, "What is your Username?");

	if (!staffusername.equals(inputusername) && (trial < 3))
	{
		JOptionPane.showMessageDialog(null, "wrong, try again");
		trial ++;
	}
	else if ((trial == 3) && (!staffusername.equals(inputusername))) 
	{
	JOptionPane.showMessageDialog(null, "good bye, BANNED");	
	System.exit(0);
	} else
		while (trial <= 3) {
			inputpassword = JOptionPane.showInputDialog(null, "What is the password?");

			if (!staffpassword.equals(inputpassword) && (trial < 3))
			{
				JOptionPane.showMessageDialog(null, "wrong, try again");
				trial ++;
			}
			else if ((trial == 3) && (!staffpassword.equals(inputpassword))) 
			{
			JOptionPane.showMessageDialog(null, "good bye, BANNED");	
			System.exit(0);
			}
			else{
				JOptionPane.showMessageDialog(null, " Hello " + staffusername);
				System.exit(0);
			}
		}
}
}


}
switch (input) {

case "Student":{
while (trial <= 3) {

	 inputusername = JOptionPane.showInputDialog(null, "What is your Username?");

	if (!studentusername.equals(inputusername) && (trial < 3))
	{
		JOptionPane.showMessageDialog(null, "wrong, try again");
		trial ++;
	}
	else if ((trial == 3) && (!studentusername.equals(inputusername))) 
	{
	JOptionPane.showMessageDialog(null, "good bye, BANNED");	
	System.exit(0);
	} else
		while (trial <= 3) {
			inputpassword = JOptionPane.showInputDialog(null, "What is the password?");

			if (!studentpassword.equals(inputpassword) && (trial < 3))
			{
				JOptionPane.showMessageDialog(null, "wrong, try again");
				trial ++;
			}
			else if ((trial == 3) && (!studentpassword.equals(inputpassword))) 
			{
			JOptionPane.showMessageDialog(null, "good bye, BANNED");	
			System.exit(0);
			}
			else{
				JOptionPane.showMessageDialog(null, " Hello " + studentusername);
				System.exit(0);
			}
		}
}
}
}


switch (input) {

case "Admin":{
while (trial <= 3) {

	 inputusername = JOptionPane.showInputDialog(null, "What is your Username?");

	if (!adminusername.equals(inputusername) && (trial < 3))
	{
		JOptionPane.showMessageDialog(null, "wrong, try again");
		trial ++;
	}
	else if ((trial == 3) && (!adminusername.equals(inputusername))) 
	{
	JOptionPane.showMessageDialog(null, "good bye, BANNED");	
	System.exit(0);
	} else
		while (trial <= 3) {
			inputpassword = JOptionPane.showInputDialog(null, "What is the password?");

			if (!adminpassword.equals(inputpassword) && (trial < 3))
			{
				JOptionPane.showMessageDialog(null, "wrong, try again");
				trial ++;
			}
			else if ((trial == 3) && (!adminpassword.equals(inputpassword))) 
			{
			JOptionPane.showMessageDialog(null, "good bye, BANNED");	
			System.exit(0);
			}
			else{
				JOptionPane.showMessageDialog(null, " Hello " + adminusername);
				System.exit(0);
			}
		}
}
}
}
}
}