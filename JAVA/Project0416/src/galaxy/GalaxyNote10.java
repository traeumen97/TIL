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
//		System.out.println("GalaxyNote10��ȭ �ɱ�...");
//	}
//	public void calc() {
//		System.out.println("GalaxtyNote10 ����");
//	}
//	public void text() {
//		System.out.println("GalaxyNote10 ���� ���");
//	}
//	public void picture() {
//		System.out.println("���� �Կ�");
//	}
	public void draw() {
		System.out.println(model + "GalaxyNote20 �׸��׸��� -> �� : " + pen);
	}
}
