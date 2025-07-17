package oops;

import java.util.Scanner;

public class Author {
 private String name;
 private String email;
 private char gender;
public Author(String name,String email,char gender) {
	this.name=name;
	this.email=email;
	this.gender=gender;
}
public String getName() {
	return name;
	}
public void setName(String name) {
	this.name=name;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email=email;
}
public char getGender() {
	return gender;
	}
public void setGender(char gender) {
	this.gender=gender;
}

}
class Book{
	private String name;
	private double price;
	private int qtyInStock;
	private Author author;
    public Book(Author author,String name,double price,int qtyInStock) {
    	this.author=author;
    	this.name=name;
    	this.price=price;
    	this.qtyInStock=qtyInStock;
    }
    public String getName() {
    	return name;
    	}
    public Author getAuthor() {
    	return author;
    }
    public double getPrice() {
    	return price;
    	}
    public int getQtyInStock() {
    	return qtyInStock;
    }
}
    class Main{
    	public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter author name:");
			String authorName=sc.nextLine();
			System.out.println("Enter author email:");
			String authorEmail=sc.nextLine();
			System.out.println("Enter author gender(M/F):");
			char authorGender=sc.nextLine().charAt(0);
			Author author=new Author(authorName,authorEmail,authorGender);
			System.out.println("Enter book name:");
			String bookName=sc.nextLine();
			System.out.println("Enter book price:");
			double bookPrice=sc.nextDouble();
			System.out.println("Enter book qtyInStock:");
			int qtyInStock=sc.nextInt();
			Book book =new Book(author,bookName,bookPrice,qtyInStock);
			 System.out.println("\n--- Book Details ---");
		        System.out.println("Book Name: " + book.getName());
		        System.out.println("Author Name: " + book.getAuthor().getName());
		        System.out.println("Author Email: " + book.getAuthor().getEmail());
		        System.out.println("Author Gender: " + book.getAuthor().getGender());
		        System.out.println("Price: " + book.getPrice());
		        System.out.println("Quantity in stock: " + book.getQtyInStock());

		        sc.close();

			
		}
    }

