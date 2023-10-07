package org.ltu.oops;


abstract class  Human{
	
	//abstract class
	public abstract void eat(); 
	
	public void walk() {
		System.out.println("waking");
	}
}

class Man extends Human
{

	//concrete class
	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("Eating");
	}
	
 
}
public class AbstractDemo {
	public static void main(String[] args) {
		
//		Human h = new Human(); we cannot instistiate abstract
		
		Human h = new Man();
		h.eat();
		h.walk();
		
	}

}
