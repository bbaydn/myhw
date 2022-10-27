package ch12shapes;

public class Circle extends Shape {
	private double radius;

	public Circle(double radius) {
		super("Circle");
		this.radius=Math.abs(radius);
	}
	
	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}


	@Override
	public void draw() {
		super.draw();
	}

	@Override
	public void erase() {
		super.erase();
	}

	@Override
	public
    double calculateArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
	public
    double calculateCircumference() {
        return 2 * Math.PI * radius;
	}

	@Override
	public int hashCode() {
		System.out.println("Hashcode: " +getName().hashCode());
		return getName().hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		Circle c1=(Circle) obj;
		boolean a=false;
		if(getName()==c1.getName() && getRadius()==c1.getRadius()) {
			a=true;
		}
		System.out.println(a);
		return a;
	}

	@Override
	public String toString() {
		String c=new String();
		c="Name: "+getName()+" & Radius:"+getRadius();
		System.out.println(c);
		return c;
	}



}
