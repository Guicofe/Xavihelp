import java.util.*;

public class Student {

  private String name;
  private String userName;
  private double gpa;
  private String wid;

  public Student(String n, String uN, double GP, String stuID){
    name = n;
    userName = uN;
    gpa = GP;
    wid = stuID;
  }//end Student

  public String getName(){
    return name;
  }//end getter

  public double getGPA(){
    return gpa;
  }//end getter

  public String getEmail(){
    return userName.toLowerCase() + "@ksu.edu";
  }//end getEmail

  public String toString(){
    return name + "\nWID #" + wid + "\n" + getEmail() + "\nGPA: " + gpa + "\n";
  }//end toString
  public boolean equals(Student Student){
    return (this.wid.equals(student.wid));
  }//end equals
}//end class
