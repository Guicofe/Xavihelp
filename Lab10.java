import java.util.*;
import java.io.*;

public class Lab10 {
 public static void main(String[] args) {
	Scanner s = new Scanner (System.in);

	//YOU DO THIS:
	//Declare an ArrayList to hold Student Objects
  ArrayList <Student> classroom = new ArrayList<Student> ();

	String reply = "y";
  int i = 0;
  boolean goodinput = false;
  String userName = "";
  double gpa = -1;
  String name = "";
  int takecount = 0;
  //enter info + error handeling
	do {

    while (!goodinput){
      try{

        System.out.print("Enter the student's name: ");
    		name = s.nextLine();
        if (name.equals("")){
          throw new IllegalStateException();
        }
        else{
          goodinput = true;
        }
      }//end try
        catch(IllegalStateException e){
          System.out.println("Name is required (Please re-enter)");
        }
    }//end while
    goodinput = false;
    while (!goodinput){
      try{

        System.out.print("Enter student's user name: ");
    		userName = s.nextLine();
        if (userName.equals("")){
          throw new IllegalStateException();
        }
        else{
          goodinput = true;
        }
      }//end try
        catch(IllegalStateException e){
          System.out.println("User name is required (Please re-enter)");
        }
    }//end while
    goodinput = false;
    while (!goodinput){
      try{
        System.out.print("Enter student's WID #: ");
        wid = s.nextLine();
        if (wid.equals("")){
          throw new IllegalStateException();
        }//end if
        else if (wid.length() < 9){
          throw new NumberFormatException();
        }//end if
        else{
          goodinput = true;
        }
      }//end try
      catch(IllegalStateException e){
        System.out.println("User name is required (Please re-enter)");
      }
      catch(NumberFormatException n){
        System.out.println("WID must contain 9-digits - no characters (Please re-enter)");
      }
    }//end while
    int counter = 0;
    while (!goodinput){
      try{
        counter = 0;
        System.out.print("Enter student's GPA: ");
        gpa = Double.parseDouble(s.nextLine());
        while ((gpa > 4.0) || (gpa < 0)){
          System.out.println("Error, value is not in range!");
          System.out.print("Enter student's GPA: ");
          gpa = Double.parseDouble(s.nextLine());
        }//end while
      }//end try
        catch(NumberFormatException n){
          System.out.println("GPA has to be a double.");
          counter++;
        }
      if (counter > 0){
        goodinput = false;
      }
      else{
        goodinput = true;
      }

    }//end while
		//YOU DO THIS:
		//Create a student object and add to the arraylist
    Student student = new Student (name, userName, gpa, wid);
    for(int x = 0; x <= student.length(); x++){
      if (student.equals(student[x])){
        takecount++
      }//end if
    }//end for
    if (takecount == 0){
    classroom.add(i, student);
		System.out.println("Student added to the arraylist...");
    }
    else{
      System.out.println("Student already exists.");
    }
		System.out.print("\nAdd another student? ('Y' or 'N'): ");
		reply = s.nextLine();
    i++;
    goodinput = false;

	} while (reply.equalsIgnoreCase ("Y"));

	//YOU DO THIS:
	//Create a loop that uses the toString method in the Student class
	// to display all objects added to the arraylist
  for (int x = 0; x < classroom.size(); x++)
  {
    System.out.println(classroom.get(x));
  }//end for loop
  System.out.println("All students displayed.");

   HashMap<String, Student> studentHashMap = new HashMap<>();
   for(Student student : classroom) {
     studentHashMap.put(student.getWid(), student);
   }



 } // end main
} // end class Lab10
