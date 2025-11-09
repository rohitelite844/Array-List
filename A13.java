import java.util.ArrayList;
import java.util.Collection;

public class A13 {

	public static void main(String[] args) {
		ArrayList<String> list1=new ArrayList();
		list1.add("Red");
		list1.add("Blue");
		list1.add("Green");
		list1.add("Pink");
		System.out.println(list1);
		
		ArrayList<String> list2=new ArrayList();
		list2.add("Red");
		list2.add("Blue");
		list2.add("Orange");
		list2.add("Pink");
        System.out.println(list2);
        
        for(String colours : list1){
        	if(list2.contains(colours)){
        		System.out.println("yes");
        	}
        	else{
        		System.out.println("no");
        	}
        }
        
	}

}
