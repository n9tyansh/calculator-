import java.util.Scanner;
public class calculator { 
    public static void main (String args[]){
        Scanner sc = new Scanner (System.in);
      
        System.out.println("enter firstnumber : ");
        Double num1 = sc.nextDouble();

        System.out.println("enter (+,-,*,/) : ");
        char operator = sc.next().charAt(0);

        System.out.println("enter second number : ");
        int num2 = sc.nextInt();

        Double result;

        switch(operator){
            case '+' :
                result = num1 + num2 ;
                System.out.println("result = " + result);
                break ; 

            case '-' :
                result = num1 - num2 ;
                System.out.println("result = "+ result);
                break;

            case '*' : 
                result = num1*num2;
                System.out.println("result = "+ result);
                break;
            case '/':
                if(num2!=0){
                    System.out.println("result = "+ num1/num2);
                    }
                    else {
                        System.out.println("infinite");
                    }
                    break;

            default:
                System.out.println("invalid operator");
             
            

        }



        
        

        
        
    }
}