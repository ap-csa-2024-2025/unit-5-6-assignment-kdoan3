import java.util.Scanner;

public class Main
{  
  public static void main(String[] args)
  {
    Dog d1 = new Dog("weiner", "bob", "blue", -1000);
    Dog d2 = new Dog();

    d1.setBreed("pitbull");
    d2.setBreed("daschund");
  }
} 


/* Delete this line to uncomment code **************************
  public static void main(String[] args)

  inDog.setBreed(breed);
    indog.setName(name);
    inDog.setColor(color);
    indog.setSize(size);


  {
    // Uncomment and complete the code below to test your Plane class
    
    Scanner sc = new Scanner(System.in);
    String input = "";
    Plane p = new Plane(1000);
    while (!input.equals("q"))
    {
      System.out.println(p);
      System.out.println("Type \"u\" to move upwards, \"d\" to move downwards, \"n\" for new Plane, \"q\" to quit.");
      // System.out.println(print the plane's location and uncomment);
      input = sc.nextLine();

      if (input.equals("u"))
      {
        // move the plane upwards
      }
      else if (input.equals("d"))
      {
        // move the plane downwards
      }
      else if (input.equals("n"))
      {
        System.out.println("Starting location for a new plane?");
        int location = sc.nextInt();
        sc.nextLine(); // consume the ENTER key left behind by nextInt()
        p = // create new plane at proper location
      }
      else if (input.equals("q"))
      {
        System.out.println("Thank you for using plane simulator");
      }
      else
      {
        System.out.println("Invalid input");
      }
    }
   
  }
   Delete this line to uncomment ************************************/

