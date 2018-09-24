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
	
	public void setFirstName (String fnm) {
		fname=fnm;
	}
	
	public String getFirstName(String fnm) {
		return fname;
	}
	
	public void setLastName (String lnm) {
		lname = lnm;
	}
	 public String getLastName (String lnm) {
		 return lname;
	}
	
	public void setBirthDateDay (int bdtd) {
		bdtd=BdayDay;
	}
	
	public void setBirthDateMonth (int bdtm) {
		bdtm = BdayMonth;
	}
	
	public void setBirthDateYear (int bdty) {
		bdty = BdayYear;
	}

	public int getBirthDateDay (int bdtd) {
		return BdayDay;
	}
	
	public int getBirthDateMonth (int bdtm) {
		return BdayMonth;
	}
	
	public int getBirthDateYear (int bdty) {
		return BdayYear;
	}
	
	public void setSocSec (String ss) {
		ss = SocSec;
	}
	
	public String getSocSec (String ss) {
		return SocSec;
	}
	
	public void setGradYear (String gy) {
		gy = GradYear;
	}
	
	public String getGradYear (String gy) {
		return GradYear;
	}
	
	public void setMotherMaidName (String mmn) {
		mmn = MMaidName;
	}
	
	public String getMotherMaidName (String mmn) {
		return MMaidName;
	}
	
	public void setGPA (double gpa) {
		gpa = GPA;
	}
	
	public double getGPA (double gpa) {
		return GPA;
	}
	
	public void setAddress (String adrs) {
		adrs = HomeAddress;
	}
	public String getAddress (String adrs) {
		return HomeAddress;
	}
	
	public void setPhoneNum (String num) {
		num = PhoneNumber;
	}
	
	public String getPhoneNum (String num) {
		return PhoneNumber;
	}
	
	public void setEmail (String eml) {
		eml = Email;
	}
	
	public String getEmail (String eml) {
		return Email;
	}
	 public void setDressSize (String drs) {
		 drs = DressSize;
	}
	
	 public String getDressSize (String drs) {
		 return DressSize;
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
		student1.setFirstName(fName);
		
		System.out.println("Please enter student's last name");
		student1.setLastName(reader.nextLine());
		
		
		
		System.out.println("Please enter Student's birth Month (Number)");
		student1.setBirthDateMonth(reader.nextInt());
		System.out.println("Day of month");
		student1.setBirthDateDay(reader.nextInt());
		System.out.println("Birth Year");
		student1.setBirthDateYear(reader.nextInt());
		
		System.out.println("Please enter student's graduation year");
		student1.setGradYear(reader.nextLine());
		
		System.out.println("Please input student's GPA");
		student1.setGPA(reader.nextDouble());
		
		System.out.println("Please enter student's social security number");
		student1.setSocSec(reader.nextLine());
		
		System.out.println("Input student's mother's maiden name");
		student1.setMotherMaidName(reader.nextLine());
		
		System.out.println("Please input student's home address");
		student1.setAddress(reader.nextLine());
		
		System.out.println("Please input student's phone number");
		student1.setPhoneNum(reader.nextLine());
		
		System.out.println("Please input student email address");
		student1.setEmail(reader.nextLine());
		
		System.out.println("Please input student dress size");
		student1.setDressSize(reader.nextLine());
		
		System.out.println(student1.displayProfile());
		
		

}
}
