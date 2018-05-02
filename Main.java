import java.util.Scanner;
import java.util.concurrent.TimeUnit;

/* Boolean: True or false, 0 or 1, data types, 1 bit in size
    
      byte: 8-bit signed two's complement integer, used for saving memory in large arrays. Value 
      -128 to 127
      
      char:
      short: 16-bit signed two's complement integer. used to save memory in large arrays, value -32,768 
      to 32,767
      
      int:  32-bit signed two's complement integer, value -2^31 to (2^31)-1
      
      long: a 64-bit two's complement integer. value -2^63 to (2^63)-1
      
      float: single-precision 32-bit IEEE 754 floating point. Use a float instead of double if you need 
      to save memory in large arrays of floating point numbers.
        
      double: designed especially for scientific calculations, where approximation errors are acceptable. 64-bit
      
      variable: a piece of memory that can contain a data value.
    
    */

/**
* My 'Integration2' project aims to hit all the requirements of Integration 1,2 and 3 that we were assigned.
* Most things throughout my program aren't connected and act like exercises to show that I am capable
* of coding and capable of doing various things throughout java.
* @author  Kristopher Perry
* @version 1.0
* @since   2014-04-30
*/

public class Main {

 
  
  // handled the checked exception using the throws keyword, to prevent error when I use 
  // thread sleep. 

public static void main(String[] args) throws InterruptedException {
    Scanner input = new Scanner(System.in);
    Player playerObject = new Player();

    System.out.println("Enter your name here: ");
    String name = input.nextLine();

    // Access the fields and methods of an object 
    // trims the name so there is no white space
    playerObject.simpleName(name.trim());
    
    /* thread.sleep is used a lot to slow down the program, 
    otherwise it would fly thorugh and not seem as user friendly */
    
    Thread.sleep(1000);
    LocalDateExample.main(args);
    LocalTimeExample.main(args);
    Thread.sleep(1000);
    

    // checks user input to see if there is an 'i' in the string
    if (name.indexOf("i") > 0) {
      System.out.println("Your name have an 'i' in it!");
    } else {
      System.out.println("Your name does not have an 'i' in it.");
    }
    
    Thread.sleep(1000);
    
    System.out.println("Your name backwards is... ");

    reverse.backwards(name);
    
    Thread.sleep(2000);
    
    reverse.wrong(name);
    
    Thread.sleep(2000);
    
    reverse.append(name);
    
    
    Thread.sleep(2000);

    Scanner reader = new Scanner(System.in);
    System.out.println("Enter a number to be squared: ");
    int x = reader.nextInt();
    // Casting being used here
    int y = (byte) x;
    int z = y * y;
    System.out.println("The answer is " + z + ".");
    
    Thread.sleep(1000);
    
    System.out.println("Enter a number to be cut in half: ");
    int u = reader.nextInt();
    int b = u / 2;
    System.out.println(u + " cut in half equals " + b);

    Thread.sleep(2000);
    
    Array.main(x);
    Thread.sleep(1000);
    Array.main1(args);
    
    Thread.sleep(2000);
    
    System.out.println("How old are you?");
    int a = reader.nextInt();
    		
    // used to tell user their name that was aquired at the beginning of the program and also the age that they provide.
    Encapsulate obj = new Encapsulate();
    
    obj.setName(name);
    obj.setAge(a);
      
    System.out.println("Your name: " + obj.getName());
    System.out.println("Your age: " + obj.getAge());
    
    Thread.sleep(1000); 
    
    System.out.println("Here's every age you've been up to this point: ");
    
    Thread.sleep(1000);
    
    Loop.ageCountdown(a);
    
    Thread.sleep(1000);
    
    Done[] thelist = new Done[2];
    Over o = new Over();
    Future f = new Future();
    
    thelist[0] = o;
    thelist[1] = f;
    // example of polymorphism
    for(Done q: thelist) {
    	q.statement();
    }
    
    Thread.sleep(1000);
    System.out.println("Enter 10 numbers, some negative and some positive and I can filter out the negatives.");
    
    
    Predicates.main(args);
    
    Thread.sleep(2000);
   
    
   BankAccount a1 = new BankAccount();
   
   System.out.println("An example of using Array's will be shown below");
   Thread.sleep(500);
   System.out.println("I have used an array to store 'Mr. , Ms, and  Mrs. ' and then located them and used their location to write out names");
   Thread.sleep(1000);
   
   Array.main2(args);
   Thread.sleep(1000);
   
   a1.setBalance(-2);
   
   
	}
}
