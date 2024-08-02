package test240718.object2;

public class Run {
	public static void main(String[] args) {
		
		PhoneController phController = new PhoneController();
		
		String[] result = phController.mathod(); 
		
		for(String res : result) {
			System.out.println(res);
			System.out.println();
		}
	}

}
