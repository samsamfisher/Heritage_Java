public class Boat extends Vehicule {

    public Boat(String brand, int kilometers) {
        super(brand, kilometers);
    }
    
    @Override
    public String doStuff() {
        return "Je suis " + this.brand + " et je fais glou glou !";
    }
}
