import java.util.Scanner;
public class factorial{
    static int fact_method(int no){
        if(no==1){
            return 1;
        }else{
            return no*fact_method(no-1);
        }
    }
    public static void main(String args[]){
        int no, fact;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no to find the factorial:");
        no = sc.nextInt();
        fact = fact_method(no);
        System.out.println("The factorial of "+no+" is "+fact);
    }
}