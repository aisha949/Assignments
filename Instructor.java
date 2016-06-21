public interface Instructor{
	int getOfficeHour();
	Course[]getTeachingCourses();
}
 class Course{
 	int courseCode;
 	int creditHours;
 	String title;
 	public Course(int courseCode,int creditHours,String title){
 		this.courseCode=courseCode;
 		this.creditHours=creditHours;
 		this.title=title;
 	}
 	public int getcourseCode(){
 		return courseCode;
 	}
 	public void setcourseCode(int newcourseCode){
 		this.courseCode=newcourseCode;
 	}
 	public int getcreditHours(){
 		return creditHours;
 	}
 	public void setcreditHours(int newcreditHours){
 		this.creditHours=newcreditHours;
 	}
 	public String gettitle(){
 		return title;
 	}
 	public void settitle(String newtitle){
 		this.title=newtitle;
 	}
 	public String toString(){
 		return "\ncourseCode\n"+courseCode+"\ncreditHours\n"+creditHours+"title"+title;
 	}
 	
 }
 class Faculty extends MonthlyEmployee implements Instructor{
 	int officeHours;
 	 Course[]teachingCourses();
 }