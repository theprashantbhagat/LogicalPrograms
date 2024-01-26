package randomInInterview;

class Student implements Comparable<Student> {
	
    private String name;
    private int age;
	public Student(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	@Override
	public int compareTo(Student o) {
		//sort the name in ascending order
		int compareTo = this.name.compareTo(o.name);
		if(compareTo !=0) {
			return compareTo;
		}
		//if names are same then sort using age in descending
		return Integer.compare(o.age, this.age);
		//return o.age - this.age;
	}

    
}

