package java8Logical_20;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ConvertObjectToMap {
	
	public static void main(String[] args) {
		
		List<Person> person = List.of(
				new Person("prashant", 27),
				new Person("sujit", 23),
				new Person("rushi", 24),
				new Person("prashant", 26)
				);
		
		//convert objects into a Map with a merge function
		Map<String,Integer> collect = person.stream()
		.collect(Collectors.toMap(Person::getName, Person::getAge
				,(existingValue,newValue)->existingValue
				));
		System.out.println(collect);
		
		/*existingValue: This parameter represents the value associated 
		  with the key that already exists in the Map.
		  newValue: This parameter represents the new value associated 
		  with the key being processed.*/
	}
}

class Person{
	
	private String name;
	private int age;
	
	public Person(String name, int age) {
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
	
	
	
}
