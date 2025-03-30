class Course{
	String courseName;
	int duration;
	
	Course(String courseName, int duration){
		this.courseName=courseName;
		this.duration=duration;
	}
	void displayDetails(){
		System.out.println("Course name: "+courseName);
		System.out.println("Duration of course: "+duration+" months");
	}
}

class OnlineCourse extends Course{
	String platform;
	boolean isRecorded;
	OnlineCourse(String courseName, int duration, String platform, boolean isRecorded){
		super(courseName, duration);
		this.platform=platform;
		this.isRecorded=isRecorded;
	}
	@Override
	void displayDetails(){
		super.displayDetails();
		System.out.println("Course available on: "+platform);
		System.out.println("Are the courses recorded? "+(isRecorded? "Yes" : "No"));
	}
}

class PaidOnlineCourse extends OnlineCourse{
	double fee;
	int discount;
	
	PaidOnlineCourse(String courseName, int duration, String platform, boolean isRecorded, double fee, int discount){
		super(courseName, duration, platform, isRecorded);
		this.fee=fee;
		this.discount=discount;
	}
	@Override
	void displayDetails(){
		super.displayDetails();
		System.out.println("Course fee: "+fee);
		System.out.println("Discount percent: "+discount+"%");
		System.out.println("Total fee: "+(fee-(fee*discount/100)));
	}
}

public class EducationCourse{
	public static void main(String[] args){
		PaidOnlineCourse c1=new PaidOnlineCourse("Java", 6, "Microsoft Teams", true, 5000.0, 5);
		c1.displayDetails();
	}
}
