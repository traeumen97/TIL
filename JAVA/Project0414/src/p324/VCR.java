package p324;

public class VCR {
	boolean power;
	int counter = 0;
	void power() {power = !power;}
	void play() {
		System.out.println("VCR - play()");
	}
	void stop() {
		System.out.println("VCR - stop()");
	}
	void rew() {
		System.out.println("VCR - rew()");
	}
	void ff() {
		System.out.println("VCR - ff()");
	}
}
