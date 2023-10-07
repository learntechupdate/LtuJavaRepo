package collections;

import java.util.ArrayList;
import java.util.List;

public class ListDemo {
	
	public static void main(String[] args) {
		
		List<Integer> a = new ArrayList();
		a.add(340);
		a.add(450);
//		a.add("Tester");
		a.add(1, 300);
		
		
		System.out.println(a.get(1));
		
		for (Object oo : a) {
			System.out.println(oo);
		}
		
		System.out.println("index Forloop");
		for (int i = 0; i < a.size(); i++) {
			
			System.out.println(a.get(i));
		}
	}

}
