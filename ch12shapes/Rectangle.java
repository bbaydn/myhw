package ch12shapes;

public class Rectangle extends Shape{
	private int longSide
	private int shortSide;
	public Rectangle(int shortSide,int longSide) {
		super("Rectangle");
		this.shortSide=shortSide;
		this.longSide=longSide;
	}
	public int getShortSide() {
		return shortSide;
	}
	public void setShortSide(int shortSide) {
		this.ShortSide = shortSide;
	}
	public int getLongSide() {
		return longSide;
	}
	public void setLongSide(int longSide) {
		this.longSide = longSide;
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
	public double calculateArea() {
		double area=shortSide*longSide;
		System.out.println("Rectangle area is: " +area);
		return area;
	}
	@Override
	public double calculateCircumference() {
		double circumference=2*(shortSide+longSide);
		System.out.println("Rectangle circumference is: " +circumference);
		return circumference;
	}
	@Override
	public int hashCode() {
		System.out.println("Hashcode: " +getName().hashCode());
		return getName().hashCode();
	}
	@Override
	public boolean equals(Object obj) {
		Rectangle c1=(Rectangle) obj;
		boolean a=false;
		if(getName()==c1.getName() && getShortSide()==c1.getShortSide()) {
			a=true;
		}
		System.out.println(a);
		return a;
	}
	@Override
	public String toString() {
		String s=new String();
		s="Name: "+getName()+" & x-y:"+getShortSide()+getLongSide();
		System.out.println(s);
		return s;
	}
}
