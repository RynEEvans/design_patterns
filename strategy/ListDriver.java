package strategy;

import java.util.ArrayList;

/**
 * Creates lists of information, and displays the sorted versions of the lists
 */
public class ListDriver {

    /**
     * Creates a new ListDriver
     */
    public ListDriver(){}

    /**
     * Main entryway to the program
     * Creates the lists, and displays the sorted lists
     */
    public void run() {
        AppartmentList appartmentList = new AppartmentList();
        appartmentList.add("Saga", 1, 1, 1375);
        appartmentList.add("Saga", 2, 2, 799);
        appartmentList.add("Saga", 3, 3, 920);

        appartmentList.add("Pulaski Square Townhomes", 3, 3, 980);

        appartmentList.add("650 Lincoln", 3, 3, 915);
        appartmentList.add("650 Lincoln", 2, 1, 800);
        appartmentList.add("650 Lincoln", 1, 1, 1400);

        appartmentList.add("Green Street Crossing", 3, 3, 1012);
        appartmentList.add("Green Street Crossing", 2, 1, 850);
        appartmentList.add("Green Street Crossing", 1, 1, 1520);

        ArrayList<Appartment> sortedAppartments = appartmentList.getSortedList();
        System.out.println("\n***** Highest Price to Lowest *****\n");
        displayList(sortedAppartments);

        appartmentList.setSortBehavior(new QuickSort());
        sortedAppartments = appartmentList.getSortedList();
        System.out.println("\n***** Lowest Price to Highest *****\n");
        displayList(sortedAppartments);
    }

    /**
     * Loops through and displays each item in the list items
     * @param items list to display
     */
    private void displayList(ArrayList<Appartment> appartments){
        for(Appartment appartment : appartments){
            System.out.println(appartment);
        }
    }

    public static void main(String[] args){
        ListDriver driver = new ListDriver();
        driver.run();
    }
}