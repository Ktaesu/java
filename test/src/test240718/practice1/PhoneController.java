package test240718.practice1;

public class PhoneController {
	
	private String[] result = new String[2];
	
	public String[] method() {
		
		Phone[] p = new Phone[2];
		
		p[0] = new GalaxyNote9();
		p[1] = new V40();
		
		for(int i=0; i<p.length; i++) {
			result[i] = ((SmartPhone)p[i]).printInformation();
			
		}
		return result;
	}
	
	

}
