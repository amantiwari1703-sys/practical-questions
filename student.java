public class student {
    public static void percent(int a,int b){

        int c=a/b*100;
        System.out.println(c);

    }
    public static void condition(int a){
         if(a>90){
             System.out.println("A");


        } else if (a>65){

             System.out.println("B");

         }else if (a==65) {
             System.out.println("c");
         }else{
             System.out.println("Fail");



    }




    }







    String name;
    int a;
    int b;
    int c;

    public  student(String name, int a, int b) {
        this.name=name;
        this.a=a;
        this.b=b;

    }
    public static void main(String args[]) {
        student s=new  student("aman",4,5);
        System.out.println(s.name);
        System.out.println(s.a);
        System.out.println(s.b);
     percent(4,4);
     condition(91);



    }




}