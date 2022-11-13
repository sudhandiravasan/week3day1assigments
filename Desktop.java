package week3.day1Assigments;

public class Desktop extends Computer {
	
	public void desktopsize() {
		System.out.println("Desktop Size is 18Inches");
	}
    
	public static void main(String[] args) {
		Desktop obj = new Desktop();
		obj.ComputerModel();
		obj.desktopsize();
	}
	
	
}
