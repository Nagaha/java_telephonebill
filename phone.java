import java.util.*;
public class phone {
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of calls:");
        int calls=sc.nextInt();
        double bill=0.0;
        if(calls<=100){
          bill=200.00;
            
        }
        else if(calls>100 && calls<=150){
          calls-=100;
          bill=200+(calls*0.60);
        }
        else if(calls>150 && calls<=200){
          calls-=150;
          bill=200+(calls*0.50)+(0.60*50);
        }
        else{
          calls-=200;
         bill=200+(0.60*50)+(0.50*50)+(calls*0.40);
        }
       System.out.println("The bill amount is: "+bill);     
    }

}
