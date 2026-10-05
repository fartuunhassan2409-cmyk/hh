package laap;

public class Car {
    private String PlatenNumber;
    private String carMoodel;
    private double dallyRate;
    private boolean rented;

    public Car(String platenNumber, String carMoodel, double dallyRate, boolean rent) {
        this.PlatenNumber = platenNumber;
        this.carMoodel = carMoodel;
        this.dallyRate = dallyRate;
        this.rented = rented;
    }

    public String getPlatenNumber() {
        return PlatenNumber;
    }

    public String getCarMoodel() {
        return carMoodel;
    }

    public double getDallyRate() {
        return dallyRate;
    }

    public boolean isRent() {
        return rented;

    }

    public void setDallyRate(double dallyRate) {
        this.dallyRate = dallyRate;
    }

    public void setRent() {
        if (rented) {
            System.out.println("gaariga waa ileg taronic  is xawaara  u shaqeeya");
        } else {
            rented = rented;
            System.out.println("car rented sucessfull");
        }

    }
    public void setRentcar(){
        if (rented){
            rented=false;
            System.out.println("");
        }
    }
}





