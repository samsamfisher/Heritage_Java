public class Hanger {
        public static void main(String[] args) {
            Car car = new Car("Clio", 2000000);
            System.out.println(car.doStuff());
            Boat boat = new Boat("Titanic", 2000000);
            System.out.println(boat.doStuff());
        }
}
