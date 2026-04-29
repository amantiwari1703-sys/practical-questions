import java.util.Scanner;
public class Bank {
    int accountNo;
    String name;
    int balance;
public static void detail(){

    Scanner sc=new Scanner(System.in);
    System.out.println("acc no");
    int accountNo=sc.nextInt();

   String name=sc.nextLine();
    System.out.println("name");
   int balance= sc.nextInt();
    System.out.println("balance no");
   System.out.println(accountNo);
    System.out.println(name);
  System.out.println(balance);



}
public static void withdraw(){
    Scanner tc=new Scanner(System.in);
   int accountNo= tc.nextInt();
   String name=tc.nextLine();
  int balance=tc.nextInt();
   System.out.println(accountNo);
   System.out.println(name);
    System.out.println(balance);


}
public static void checkBalance(){
    Scanner ec=new Scanner(System.in);
   int accountNo=ec.nextInt();
  String name=ec.nextLine();
   int balance= ec.nextInt();
   System.out.println(accountNo);
    System.out.println(name);
    System.out.println(balance);

}
public static void validation(){

    Scanner ug=new Scanner(System.in);
    int accountNo=ug.nextInt();
    String name=ug.nextLine();
    int balance= ug.nextInt();
    if(accountNo>45&&name.equals("admin")){
        System.out.println("valid");
    } else if (balance==5) {
        System.out.println("more valid" );


    }

}








public static void main(String args[]){
detail();
 withdraw();
checkBalance();
 validation();
// String menu ="deposit";
// switch (menu){
//     case "deposit":
//         System.out.println("money");
//     case "withdraw":
//         System.out.println("drawers");
//     case "exit":
//         System.out.println("no money");


 }
}


