package galaxy;

public class GalaxyNote10 extends Phone {
//	int cameraZoom;
	int pen;
	String model = "GalaxyNote10";
	
	GalaxyNote10() {
		super(10);
//		cameraZoom = 5;
		pen = 10;
	}
//	public void call() {
//		System.out.println("GalaxyNote10전화 걸기...");
//	}
//	public void calc() {
//		System.out.println("GalaxtyNote10 계산기");
//	}
//	public void text() {
//		System.out.println("GalaxyNote10 문자 기능");
//	}
//	public void picture() {
//		System.out.println("사진 촬영");
//	}
	public void draw() {
		System.out.println(model + "GalaxyNote20 그림그리기 -> 펜 : " + pen);
	}
}
