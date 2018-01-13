package LK.Travelling_Salesman;

import java.util.ArrayList;

/**
 * Project "Travelling Salesman Problem"
 * "TSP_Driver.java" created by David Wu on Sun,09.01.17.
 */

public class TSP_Driver {

	public static void main(String[] args) {

		ArrayList<City> cities = getCities();

		// MST-walk algorithm:
		ArrayList<Edge> MST = TSP_MST.MST(cities);
		ArrayList<City> MSTTour = TSP_MST.MSTTour(MST);
		System.out.println("MST weight: " + TSP_MST.weight(MST));
		System.out.println("MST tour length: " + TSP_MST.length(MSTTour));

		// Print MST
		for (int i = 0; i < MSTTour.size(); i++) {
            System.out.print(MSTTour.get(i)+"-->");
		}
        System.out.print(MSTTour.get(0));

	}

	// sample City input
    public static ArrayList<City> getCities () {
        ArrayList<City> result = new ArrayList<City>();
        result.add(new City("a", 100.0, 100.0));
        result.add(new City("b", 300.0, 300.0));
        result.add(new City("c", 300.0, 500.0));
        result.add(new City("d", 500.0, 100.0));
        result.add(new City("e", 600.0, 100.0));
        result.add(new City("f", 200.0, 600.0));
        result.add(new City("g", 300.0, 600.0));
        return result;
    }

}
