package oops;

public class Fruit {
  String name;
  String taste;
  String size;
  
  public Fruit(String name,String taste,String size) {
	  this.name=name;
	  this.taste=taste;
	  this.size=size;
	  
  }
  public void eat() {
	  System.out.println("The "+name +" is very" + taste);
  }
}
class Apple extends Fruit{

	public Apple() {
		super("Apple","Sweet","medium");
		
	}
	public void eat() {
		System.out.println("The Apple is very sweet");
	}
}
	class Orange extends Fruit{
		public Orange() {
			super("Orange","sour","small");
			
		}
		public void eat() {
			System.out.println("The orange is sour");
		}
	}
class Myfruit{
		public static void main(String[] args) {
			Apple apple=new Apple();
			apple.eat();
			Orange orange=new Orange();
		     orange.eat();
		
	}
}
