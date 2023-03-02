public abstract class Vehicule {

    String brand;
    int kilometers;

    public Vehicule(String brand, int kilometers) {
        this.brand = brand;
        this.kilometers = kilometers;
    }

    // Getter
    public String getBrand() {
        return this.brand;
    }

    public int getKilometers() {
        return this.kilometers;
    }

    // Setter
    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setKilometers(int kilometers) {
        this.kilometers = kilometers;
    }

    public abstract String doStuff();

}   