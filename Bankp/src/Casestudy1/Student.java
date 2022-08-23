package Casestudy1;

public class Student {
private double  marks;
private String name;

 public Student(){}
 public Student(double marks, String name){
	 this.setMarks(marks);
	 this.setName(name);
 }
public double getMarks() {
	return marks;
}
public void setMarks(double marks) {
	this.marks = marks;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
@Override
public String toString() {
	return "Student [marks=" + marks + ", name=" + name + "]";
}
 

}

