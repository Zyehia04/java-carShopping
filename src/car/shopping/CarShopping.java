/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/*
Zein Yehia
Period: 2
Car Shopping
*/



package car.shopping;

// Import Scanner Class
import java.util.Scanner;

public class CarShopping
{
    private static Scanner kb = new Scanner(System.in);
    
    // Create static Scanner Object call it kb

   public static void main(String[] args)
   {
      int totalCost = 0;
      totalCost += base();
      totalCost += automaticWindows();
      totalCost += remoteKeylessEntry();
      totalCost += onStarSystem();
      totalCost += abs();
      totalCost += adjustPedals();
      totalCost += sunRoof();
      totalCost += coldPackage();
      totalCost += gps();
      totalCost += nitro();
      totalCost += antiGravity();
      
      //TODO: call methods that you write for each feature

      //TODO: print the total cost of the vehicle
       System.out.println(totalCost);
   }
   
   public static int base()
   {
      System.out.println("Our inventory:");
      System.out.println("Model 1 - $15,000");
      System.out.println("Model 2 - $24,000");
      System.out.println("Model 3 - $40,000");
       System.out.println("Which base model did the customer choose?"
               + "(enter full model name ex. Model 1): ");
      String model = kb.nextLine();
      if(model.equalsIgnoreCase("Model 1"))
      {
         return 15000;
      }
      else if(model.equalsIgnoreCase("Model 2"))
      {
         return 24000;
      }
      else if(model.equalsIgnoreCase("Model 3"))
      {
         return 40000;
      }
      //...
      else{
        return 0;
      }
   }
   
   public static int automaticWindows()
   {
      System.out.print("Automatic Windows for $500? (y/n) > ");
      String window = kb.nextLine();
      
      if(window.equalsIgnoreCase("y")){
          return 500;
      }
      
      
      //...
      else{
          return 0;
      }
   }
   public static int remoteKeylessEntry(){
       System.out.print("Remote Keyless Entry for $1000? (y/n) > ");
       String key = kb.nextLine();
       
       if(key.equalsIgnoreCase("y")){
           return 1000;
       }
       else{
           return 0;
       }
       
   }
   public static int onStarSystem(){
       System.out.print("On Star System for $1000? (y/n) > ");
       String star = kb.nextLine();
       
       if(star.equalsIgnoreCase("y")){
           return 1000;
       }
       else{
           return 0;
       }
       
   
    }
   public static int abs(){
       System.out.print("Anti-Lock Brakes for $500? (y/n) > ");
       String abs = kb.nextLine();
       
       if(abs.equalsIgnoreCase("y")){
           return 500;
       }
       else{
           return 0;
       }
    }
   public static int adjustPedals(){
       System.out.print("Adjustable Pedals and Telescoping Steering Wheels for $1000? (y/n) > ");
       String adj = kb.nextLine();
       
       if(adj.equalsIgnoreCase("y")){
           return 1000;
       }
       else{
           return 0;
       }
   }
   public static int sunRoof(){
       System.out.print("Sunroof for $800? (y/n) > ");
       String sun = kb.nextLine();
       
       if(sun.equalsIgnoreCase("y")){
           return 800;
       }
       else{
           return 0;
       }
   }
   public static int coldPackage(){
       System.out.print("Heated Seats/Windshield Heater for $1500? (y/n) > ");
       String cold = kb.nextLine();
       
       if(cold.equalsIgnoreCase("y")){
           return 1500;
       }
       else{
           return 0;
       }
   }
   public static int gps(){
       System.out.print("GPS for $750? (y/n) > ");
       String gps = kb.nextLine();
       
       if(gps.equalsIgnoreCase("y")){
           return 750;
       }
       else{
           return 0;
       }
   }
   public static int nitro(){
       System.out.print("nitro for $2000? (y/n) > ");
       String nitro = kb.nextLine();
       
       if(nitro.equalsIgnoreCase("y")){
           System.out.println("how much nitro do you want?");
           System.out.println("Quarter - $600");
           System.out.println("Half - $1200");
           System.out.println("Full - $2400");
           String tank = kb.nextLine();
           if(tank.equalsIgnoreCase("quarter")){
               return 600;
           }
           if(tank.equalsIgnoreCase("half")){
               return 1200;
           }
           if(tank.equalsIgnoreCase("full")){
               return 2400;
           }
           else{
               return 0;
           }
       }
       else{
           return 0;
       }
   }
    public static int antiGravity(){
       System.out.print("anti gravity for $100000? (y/n) > ");
       String gps = kb.nextLine();
       
       if(gps.equalsIgnoreCase("y")){
           return 100000;
       }
       else{
           return 0;
       }
   }
}
