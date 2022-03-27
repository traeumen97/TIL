package galaxy;

public class Phone {
	int cameraZoom;
	
	Phone() {
		
	}
	Phone(int cameraZoom) {
		this.cameraZoom = cameraZoom;
	}
	public void call() {
		System.out.println("전화 걸기...");
	}
	public void calc() {
		System.out.println("계산기");
	}
	public void text() {
		System.out.println("문자 기능");
	}
	public void picture() {
		System.out.println("사진 촬영");
	}
	public void fingerprint() {
		System.out.println("지문 인식 됩니다.");
	}
}
