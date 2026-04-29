public class Vehicle {
    public static void horn() {
    }


        public static void main (String[]args){
            Car c = new Car();
            c.horn();
            c.override("audi");



        }
    }




    class Car extends Vehicle {
      String name;
        public static void override(String name) {


            System.out.println("running");

        }

    }




