
package theboisproject;

public class FizzBuzz {
  public static void main(String args[]){
      int a=3;
      int b=5;
      int c;
      for(int i=0;i<100;i++){
          if(i%15==0){
              System.out.println("Fizz Buzz");
          }else if(i%5==0){
              System.out.println("Buzz");
          }else if(i%3==0){
              System.out.println("Fizz");
          }else{
              System.out.println(i);
          }
      }
  }  
}
