package kimx2;

public class SnackController {

		private Snack s = new Snack();
		
		public SnackController() {
			super();
			System.out.println("스넥 컨트롤러 생성됨");
		}
		
		public  String saveData(String kind, String name, 
				String flavor, int numOf, int price) {
			
			s.setKind(kind);
			s.setFlavor(flavor);
			s.setName(name);
			s.setNumOf(numOf);
			s.setPrice(price);
			
			return "저장 완료되었습니다";
		}
			
		public String confirmData() {
			return s.information();
			
		}
			
}





