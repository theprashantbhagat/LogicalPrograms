package randomInInterview;

import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicatesExample {
	
    public static void main(String[] args) {
    	
    	
        List<MyObject> myList = List.of(
                new MyObject("test", 1, 200),
                new MyObject("test1", 2, 300),
                new MyObject("test2", 3, 400),
                new MyObject("test", 4, 500),
                new MyObject("test3", 5, 600)
        );
        
        List<MyObject> distinctList = myList.stream()
                .collect(Collectors.toMap(MyObject::getUser, 
                		obj -> obj, (existing, replacement) -> existing))
                .values()
                .stream()
                .collect(Collectors.toList());

        distinctList.forEach(System.out::println);

//        List<MyObject> distinctList = myList.stream()
//                .distinct(MyObject::compareByUser)
//                .collect(Collectors.toList());
//
//        distinctList.forEach(System.out::println);
    }
}
