package randomInInterview;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StudentSortExample {
	
	public static void main(String[] args) {
		
		
		List<Student> stu=new ArrayList<>();
		stu.add(new Student("A", 20));
		stu.add(new Student("N", 20));
		stu.add(new Student("N", 30));
		stu.add(new Student("N", 50));
		
		Collections.sort(stu);
		
		System.out.println("Sorted student:");
		for(Student student:stu)
		{
			System.out.println("Name:"+student.getName()+", Age: "+student.getAge());
		}

	}
       
    
}