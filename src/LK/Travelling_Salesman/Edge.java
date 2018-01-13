package LK.Travelling_Salesman;

/**
 * Project "Travelling Salesman Problem"
 * "Edge.java" created by David Wu on Sun,09.01.17.
 */

public class Edge {
	
	// holds start city and end city of edge
	private City start;
	private City end;
	
	public Edge(City start, City end){
		this.start = start;
		this.end = end;
	}
	
	public City getStart(){
		return start;
	}
	
	public City getEnd(){
		return end;
	}

	@Override
	public String toString() {
		return start.toString() + " - " + end.toString();
	}
}
