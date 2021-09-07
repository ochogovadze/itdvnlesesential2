package PackageCar;

public class Main {
        public static void main(String[] args) {
            Car CarDefault =new Car();
            Car CarWithOneParameter = new Car(2006);
            Car CarWithTwoParameter = new Car(2008, CarWithOneParameter.getColor());

            //result
            System.out.println(CarDefault.getYar()+CarDefault.getColor());
            System.out.println(CarWithOneParameter.getYar()+CarWithOneParameter.getColor());
            System.out.println(CarWithTwoParameter.getYar()+CarWithTwoParameter.getColor());
        }
    }
