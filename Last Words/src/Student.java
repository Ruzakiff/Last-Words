import java.util.Scanner;
//Program will create a student class with lots of information

public class Student {
	private String fname;
	private String lname;
	private int BdayDay;
	private int BdayMonth;
	private int BdayYear;
	private String GradYear;
	private String SocSec;
	private String MMaidName;
	private double GPA;
	private String HomeAddress;
	private String PhoneNumber;
	private String Email;
	private String DressSize;
	

	public Student() {
		fname = "";
		lname = "";
		BdayDay = 0;
		BdayMonth = 0;
		BdayYear =  0;
		GradYear = "";
		SocSec = "";
		MMaidName = "";
		GPA = 0.0;
		HomeAddress = "";
		PhoneNumber = "";
		Email = "";
		DressSize = "";
		
		
	}
	

	
	 public String getFname() {
		return fname;
	}



	public void setFname(String fname) {
		this.fname = fname;
	}



	public String getLname() {
		return lname;
	}



	public void setLname(String lname) {
		this.lname = lname;
	}



	public int getBdayDay() {
		return BdayDay;
	}



	public void setBdayDay(int bdayDay) {
		BdayDay = bdayDay;
	}



	public int getBdayMonth() {
		return BdayMonth;
	}



	public void setBdayMonth(int bdayMonth) {
		BdayMonth = bdayMonth;
	}



	public int getBdayYear() {
		return BdayYear;
	}



	public void setBdayYear(int bdayYear) {
		BdayYear = bdayYear;
	}



	public String getGradYear() {
		return GradYear;
	}



	public void setGradYear(String gradYear) {
		GradYear = gradYear;
	}



	public String getSocSec() {
		return SocSec;
	}



	public void setSocSec(String socSec) {
		SocSec = socSec;
	}



	public String getMMaidName() {
		return MMaidName;
	}



	public void setMMaidName(String mMaidName) {
		MMaidName = mMaidName;
	}



	public double getGPA() {
		return GPA;
	}



	public void setGPA(double gPA) {
		GPA = gPA;
	}



	public String getHomeAddress() {
		return HomeAddress;
	}



	public void setHomeAddress(String homeAddress) {
		HomeAddress = homeAddress;
	}



	public String getPhoneNumber() {
		return PhoneNumber;
	}



	public void setPhoneNumber(String phoneNumber) {
		PhoneNumber = phoneNumber;
	}



	public String getEmail() {
		return Email;
	}



	public void setEmail(String email) {
		Email = email;
	}



	public String getDressSize() {
		return DressSize;
	}



	public void setDressSize(String dressSize) {
		DressSize = dressSize;
	}



	public String displayProfile (){
		 String str;
		 str = "Name; " + fname + " " + lname + "\n" +
				 "Birthday: " + BdayMonth + "/" + BdayDay + "/" +BdayYear + "\n" +
				 "Graduation Year: " + GradYear + "\n" +
				 "Social Security: " + SocSec + "\n" +
				 "Mother's Maiden Name: " + MMaidName + "\n" +
				 "GPA: " + GPA + "\n" +
				 "Home Address: " + HomeAddress + "\n" +
				 "Phone Number: " + PhoneNumber + "\n" +
				 "Email: " + Email + "\n" +
				 "Dress Size: " + DressSize + "\n";
		 return str;
	 }
				 
	
	
	
	
	
	



	public static void main (String[] args) {
		//This portion of code asks for user input
			
		Student student1 = new Student();
		Scanner reader = new Scanner(System.in);
		
		
		System.out.println("Please enter student's first name");
		String fName = reader.nextLine();
		student1.setFname(fName);
		
		System.out.println("Please enter student's last name");
		student1.setLname(reader.nextLine());
		
		
		System.out.println("Please enter Student's birth Month (Number)");
		student1.setBdayMonth(reader.nextInt());
		//reader.nextLine();
		System.out.println("Day of month");
		student1.setBdayDay(reader.nextInt());
		//reader.nextLine();
		System.out.println("Birth Year");
		student1.setBdayYear(reader.nextInt());
		reader.nextLine();
		
		System.out.println("Please enter student's graduation year");
		student1.setGradYear(reader.nextLine());
		
		System.out.println("Please input student's GPA");
		student1.setGPA(reader.nextDouble());
		reader.nextLine();
		System.out.println("Please enter student's social security number");
		student1.setSocSec(reader.nextLine());
		
		System.out.println("Input student's mother's maiden name");
		student1.setMMaidName(reader.nextLine());
		
		System.out.println("Please input student's home address");
		student1.setHomeAddress(reader.nextLine());
		
		System.out.println("Please input student's phone number");
		student1.setPhoneNumber(reader.nextLine());
		
		System.out.println("Please input student email address");
		student1.setEmail(reader.nextLine());
		
		System.out.println("Please input student dress size");
		student1.setDressSize(reader.nextLine());
		
		System.out.println(student1.displayProfile());
		
		

}

}
