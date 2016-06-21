public class Students{
	 String name;
	 int id;
	 double gpa;
	 public Students(String name,int id,double gpa){
	 	this.name=name;
	 	this.id=id;
	 	this.gpa=gpa;
	 }
	 public String getname(){
	 	return name;
	 }
	 public void setname(String newName){
	 	this.name=newName;
	 }
	  public int getid(){
	 	return id;
	 }
	 public void setgpa(int newID){
	 	this.id=newID;
		}
		 public double getgpa(){
	 	return gpa;
	 }
	 public void setgpa(double newGPA){
	 	this.gpa=newGPA;
	}
	public String toString(){
		return"ID"+id+"Name"+name+"GPA"+gpa;
	}
}
	public class GraduateStudent extends Students{
		String thesisTitle;
		public GraduateStudent(String name,int id,double gpa,String thesisTitle){
			super(name,id,gpa);
			this.thesisTitle=thesisTitle;
		}
		public String getthesisTitle(){
			return thesisTitle;
		}
		public void setthesisTitle(String newThesisTitle){
			this.thesisTitle=newThesisTitle
		}
		public String toString(){
			return super.toString()+"ThesisTitle"+thesisTitle;
		}
	}