package userInfo;

import java.util.Scanner;

public class User_info {

	public static void main(String[] args) {
		
				  Scanner sc = new Scanner(System.in); 
				  
			        System.out.print("Enter your name: "); 
			        String name = sc.nextLine(); 
			 
			        System.out.print("Enter your age: "); 
			        int age = sc.nextInt(); 
			        sc.nextLine(); 
			 
			        System.out.print("Enter your favorite color: "); 
			        String color = sc.nextLine(); 
			        System.out.println("Hello, " + name + "! You are " + age + " years old and your favorite color is " + color + "."); 
			        

			}



	}

