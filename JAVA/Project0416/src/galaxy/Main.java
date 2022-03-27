package galaxy;

public class Main {
	public static void main(String[] args) {
		GalaxyS20 s20 = new GalaxyS20();
		s20.calc();
		s20.call();
		s20.text();
		s20.fingerprint();
		
		GalaxyNote10 n10 = new GalaxyNote10();
		n10.calc();
		n10.call();
		n10.text();
		n10.draw();
		
		GalaxyA10 a10 = new GalaxyA10();
		a10.calc();
		a10.call();
		a10.text();
		a10.fingerprint();
	}

}
