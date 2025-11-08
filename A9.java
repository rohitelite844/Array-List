import java.util.ArrayList;
public class A9 {

	public static void main(String[] args) {
		ArrayList<String> list1=new ArrayList();
		list1.add("1");
		list1.add("2");
		list1.add("3");
		list1.add("4");
		System.out.println(list1);
		
		ArrayList<String> list2=new ArrayList();
		list2.add("A");
		list2.add("B");
		list2.add("C");
		list2.add("D");
        System.out.println(list2);
	    
	   list1.removeAll(list1); 
	   list1.addAll(list2);
	   System.out.println("-After Copy-");
	   System.out.println(list1);
	   System.out.println(list2);
	   
	   
	    
	    

}}
