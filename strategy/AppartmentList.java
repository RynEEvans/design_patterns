package strategy;
import java.util.ArrayList;
import java.util.Collections;

// SortBehavior Interface
interface SortBehavior {
    ArrayList<Appartment> sort(ArrayList<Appartment> appartments);
}

// BubbleSort
class BubbleSort implements SortBehavior {
    @Override
    public ArrayList<Appartment> sort(ArrayList<Appartment> appartments) {
        int n = appartments.size();
        for(int i = 0; i < n - 1; i++) {
            for(int j = 0; j < n - 1; j++) {
                if(appartments.get(j).compareTo(appartments.get(j+1)) > 0) {
                    Collections.swap(appartments, j, j + 1);
                }
            }
        }
        return appartments;
    }
}

// Quicksort
class QuickSort implements SortBehavior {
    @Override
    public ArrayList<Appartment> sort(ArrayList<Appartment> appartments) {
        quickSort(appartments, 0, appartments.size() - 1);
        return appartments;
    }

    private void quickSort(ArrayList<Appartment> appartments, int low, int high) {
        if(low < high) {
            int p = partition(appartments, low, high);
            quickSort(appartments, low, p -1);
            quickSort(appartments, p + 1, high);
        }
    }

    private int partition(ArrayList<Appartment> appartments, int low, int high) {
        Appartment pivot = appartments.get(high);
        int i = low - 1;
        for(int j = low; j < high; j++) {
            if (appartments.get(j).compareTo(pivot) > 0) {
                i++;
                Collections.swap(appartments, i, j);
            }
        }
        Collections.swap(appartments, i + 1, high);
        return i + 1;
    }
}

// ApartmentList 
class AppartmentList {
    private ArrayList<Appartment> appartments;
    private SortBehavior sortBehavior;

    public AppartmentList() {
        this.appartments = new ArrayList<>();
        this.sortBehavior = new BubbleSort(); // This is the default sort
    }

    public void add(String address, int numBedrooms, int numBathrooms, double price) {
        appartments.add(new Appartment(address, numBedrooms, numBathrooms, price));
    }

    public void setSortBehavior(SortBehavior sortBehavior) {
        this.sortBehavior = sortBehavior;
    }

    public ArrayList<Appartment> getSortedList() {
        ArrayList<Appartment> sortedList = new ArrayList<>(appartments);
        return sortBehavior.sort(sortedList);
    }

    public ArrayList<Appartment> getUnSortedList() {
        return new ArrayList<>(appartments);
    }
}