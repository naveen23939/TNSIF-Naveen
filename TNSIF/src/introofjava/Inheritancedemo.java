package introofjava;

class Animal{
	String name;
	
	
	Animal(String name){
		this.name = name;
	}
	
	void display() {
		System.out.println("Animal Name: "+name);
	}
}

class Dog extends Animal{

	String breed;
	
	Dog(String name , String breed){
		super(name);
		this.breed = breed;
	}
	
	void showDetails() {
		display();
		System.out.println("Dog Breed: "+breed);
	}
	
}


class grandparent{
	void gp() {
		System.out.println("Grand parent class");
	}
}

class Parent extends grandparent {
	void p() {
		System.out.println("Parent class");
	}
}

class Child extends Parent{
	void child() {
		System.out.println("Child class");
	}
}


class Parent1{
	void pt1() {
		System.out.println("parent 1");
	}
}

class Parent2{
	void pt2() {
		System.out.println("parent 2");
	}
}


//hierarichcial inheritance
class Fruit{
	void show() {
		System.out.println("I like to eat fruits");
	}
}

class Apple extends Fruit{
	void AppleDemo() {
		System.out.println("I like to eat apple");
	}
}

class Grapes extends Fruit{
	void GrapesDemo() {
		System.out.println("I like to eat grapes");
	}
}




public class Inheritancedemo {

	public static void main(String[] args) {
		
		Dog d = new Dog("John","Seberian Husky");
		d.showDetails();
		
		Child c = new Child();
		c.child();
		c.p();
		c.gp();
		
		
		Apple a = new Apple();
		a.AppleDemo();
		a.show();

		Grapes g = new Grapes();
		g.GrapesDemo();
		g.show();





		
	
	}

}
