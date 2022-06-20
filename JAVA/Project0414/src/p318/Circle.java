package p318;

public class Circle extends Shape {
	Point center;
	int r;
	
	Circle() {
		this(new Point(0,0), 100);
	}
	Circle(Point center, int r) {
		this.center = center;
		this.r = r;
	}
	void draw() {
		System.out.printf("[center=(%d, %d), r=%d, color=%s]", center.x, center.y, r, color);
	}
}
