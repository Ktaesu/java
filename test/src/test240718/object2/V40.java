package test240718.object2;

public class V40 extends SmartPhone implements NotePen {

	
	
	public V40() {
		super();
		this.setMaker("LG");
	}

	@Override
	public String charge() {
		
		return "고속충전, 고속무선 충전";
	}

	@Override
	public String makeCall() {
		
		return "번호를 누르고 통화버튼을 누름";
	}

	@Override
	public String takeCall() {
		
		return "전화받기 버튼을 누름";
	}

	@Override
	public String picture() {
		
		return "1200만, 1600만 화소 트리플 카메라";
	}

	@Override
	public String touch() {
		
		return "정전식";
	}
	
	@Override
	public boolean bluetoothPen() {
		
		return false;
	}

	@Override
	public String printInformation() {
		
		String result = " ";
		result += (this.getMaker() + " V40은 " + this.getMaker() + "에서 만들어졌고 제원은 다음과 같다.\n");
		result += (this.makeCall() + "\n");
		result += (this.takeCall()+ "\n");
		result += (this.picture()+ "\n");
		result += (this.charge()+ "\n");
		result += (this.touch()+ "\n");
		result += (this.bluetoothPen());		
		
		return result;
	}

}
