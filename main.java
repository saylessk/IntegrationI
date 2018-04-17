import java.util.Scanner;
import java.util.concurrent.TimeUnit;



/* Boolean: True or false, 0 or 1, data types, 1 bit in size
    
      byte: 8-bit signed two's complement integer, used for saving memory in large arrays. Value -128 to 127
      
      char:
      short: 16-bit signed two's complement integer. used to save memory in large arrays, value -32,768 to 32,767
      
      int:  32-bit signed two's complement integer, value -2^31 to (2^31)-1
      
      long: a 64-bit two's complement integer. value -2^63 to (2^63)-1
      
      float: single-precision 32-bit IEEE 754 floating point. Use a float instead of double if you need to save memory in large arrays of floating point numbers.
        
      double: designed especially for scientific calculations, where approximation errors are acceptable. 64-bit
      
      variable: a piece of memory that can contain a data value.
    
    */





public class main {

  private static final String String = null;

public static void main(String[] args) throws InterruptedException {
    Scanner input = new Scanner(System.in);
    player playerObject = new player();

    System.out.println("Enter your name here: ");
    String name = input.nextLine();

    // Acces the fields and methods of an object 
     
    playerObject.simpleName(name.trim());

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
    
    array.main(x);
    Thread.sleep(1000);
    array.main1(args);
    
    Thread.sleep(2000);
    
    System.out.println("How old are you?");
    int a = reader.nextInt();
    		
    
    Encapsulate obj = new Encapsulate();
    
    obj.setName(name);
    obj.setAge(a);
      
    System.out.println("Your name: " + obj.getName());
    System.out.println("Your age: " + obj.getAge());
    
    Thread.sleep(1000);
    
    System.out.println(");
    
    loop.ageCountdown(a);
  }




  

}
