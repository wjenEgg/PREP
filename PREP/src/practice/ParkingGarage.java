package practice;

import java.util.Date;
import java.util.HashMap;

public class ParkingGarage {
	HashMap<String, Date> space=new HashMap<String, Date>();
	int capacity=50;
	public ParkingGarage(int capacity){
		this.capacity=capacity;
	}
	public String In(String carid){
		if(!space.containsKey(carid) && space.size()<capacity)
			space.put(carid, new Date());
		return carid+" is in at "+space.get(carid).toString();
	}
	public String Out(String carid){
		Date enter= new Date();
		if(space.containsKey(carid)){
			enter=space.get(carid);
			space.remove(carid);
		}
		return carid+" is out at "+ (new Date().compareTo(enter));
	}
	public static void main(String args[]){
		ParkingGarage pg = new ParkingGarage(50);
		System.out.println(pg.In("abc"));
		System.out.println(pg.In("123"));
		System.out.println(pg.Out("abc"));
	}
}
