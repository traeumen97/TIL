package galaxy;

public class Phone {
	int cameraZoom;
	
	Phone() {
		
	}
	Phone(int cameraZoom) {
		this.cameraZoom = cameraZoom;
	}
	public void call() {
		System.out.println("��ȭ �ɱ�...");
	}
	public void calc() {
		System.out.println("����");
	}
	public void text() {
		System.out.println("���� ���");
	}
	public void picture() {
		System.out.println("���� �Կ�");
	}
	public void fingerprint() {
		System.out.println("���� �ν� �˴ϴ�.");
	}
}
