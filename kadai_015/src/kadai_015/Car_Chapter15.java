package kadai_015;

public class Car_Chapter15 {
	private int gear;
	private int speed;
	
	public Car_Chapter15(int gear,int speed) {
		this.gear = gear;
		this.speed = speed;
	}
	public void changeGear(int afterGear) {
		if(afterGear > 5) {	
			this.gear = 1;
			return;
		}
		this.gear = afterGear; 
		
	}
	
	public void run() {
		System.out.println("時速"+gear*speed+"km");
	}

}
