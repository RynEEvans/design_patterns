package strategy;

public class Appartment implements Comparable<Appartment> {
    private String address;
    private int numBedrooms;
    private int numBathrooms;
    private double price;

    public Appartment(String address, int numBedrooms, int numBathrooms, double price){
        this.address = address;
        this.numBedrooms = numBedrooms;
        this.numBathrooms = numBathrooms;
        this.price = price;
    }

    public Appartment() {
        //TODO Auto-generated constructor stub
    }

    @Override
    public int compareTo(Appartment appartment) {
        if(this.price < appartment.price){
            return 1;
        } else if(this.price > appartment.price){
            return -1;
        }
        return 0;
    }

    public String toString(){
        return "$" +  String.format( "%.2f", price )  + " " + address + "\n" + 
        numBedrooms + " bedroom" + getPlural(numBedrooms) + " " + 
        numBathrooms + " bathroom" + getPlural(numBathrooms) + " \n";
    }

    private String getPlural(int num){
        if(num == 1){
            return "";
        } else {
            return "s";
        }
    }
    
}
