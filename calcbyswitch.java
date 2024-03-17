import java.util.*;
public class calcbyswitch{
   public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      System.out.print("enter your experession:");
      int a=sc.nextInt();
      char d=sc.next().charAt(0);
      int b=sc.nextInt();
      switch(d){
         case'+':System.out.print(a+" " +d+ " " +b+ "=" +(a+b));
      break;
         case'-' : System.out.print(a+" " +d+ " " +b+" ="+(a-b));
      break;
         case'*' : System.out.print(a+" " +d+ " " +b+" ="+(a*b));
      break;
         case'/' : System.out.print(a+" " +d+ " " +b+" ="+(a/b));
      break;
          default:System.out.print("error");
          }
        }
      }
