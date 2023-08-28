
package atm;

import java.util.Scanner;

class Atm_Interface
{
    float balance = 1000000f;
    Scanner s=new Scanner(System.in);
    public void Withdraw(){
        System.out.println("Enter the Amount for Withdraw : ");
        float amount=s.nextFloat();
        try{
            if(balance >= amount){
                balance = balance-amount;
                System.out.println(amount+"\t Withdraw Successful");
                System.out.println("Current Amount is : \t" +balance);
            }
            else
                System.out.println("Insufficient Balance!!..");
        }catch(Exception e){
            System.out.println(e);
        }
    }
    public void Diposit(){
        System.out.println("Enter the Amount for Diposit : ");
        float amount = s.nextFloat();
        try{
            if(amount <= balance){
                balance = balance + amount;
                System.out.println(amount+"\t Diposited Successful ");
                System.out.println("Current Amount is : \t"+balance);
            }
            else
                System.out.println("'Sorry!!' Deposet Limit is 1000000");
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
class bank extends Atm_Interface{
    public void check(){
        System.out.println("Available Balance is : \t" +balance);
    }
public class ATM {
    
    
    public static void main(String[] args) {
        Scanner pinnum=new Scanner(System.in);
        int pin;
        System.out.println("Enter your PIN :");
        pin=pinnum.nextInt();
        
        bank bc = new bank();
        System.out.println("Your current Balance is : \t" +bc.balance);
        while(true){
            System.out.println("\t*****WEL-COME to UBI ATM SERVICES*****");
            
            System.out.println("1.WITHDRAW BALANCE");
            System.out.println("2.DEPOSIT BALANCE");
            System.out.println("3.CHECK BALANCE");
            System.out.println("4.EXIT");
            System.out.println("Select your Choice : ");
            int ch = pinnum.nextInt();
            switch(ch){
                case 1:
                    bc.Withdraw();
                    break;
                case 2:
                    bc.Diposit();
                    break;
                case 3:
                    bc.check();
                    break;
                case 4:
                    System.out.println("\t*** THANK YOU FOR VISIT***");
                    System.exit(0);
    
                case 5:
                default:
                    System.out.println("\t***INVALID CHOICE***");
            }
        }
    }
    
}
}

