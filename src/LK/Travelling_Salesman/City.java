package LK.Travelling_Salesman;

/**
 * Project "Travelling Salesman Problem"
 * "City.java" created by David Wu on Sun,09.01.17.
 */

public class City {
	
	private String name;
	private double x;
	private double y;
	
	public City(String name, double x, double y){
		this.name = name;
		this.x = x;
		this.y = y;
	}
	
	public double getX(){
		return x;
	}
	
	public double getY(){
		return y;
	}

    @Override
    public String toString() {
        return name+" ("+x+"|"+y+")";
    }
}
