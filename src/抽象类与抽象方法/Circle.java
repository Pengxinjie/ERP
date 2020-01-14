package 抽象类与抽象方法;

public class Circle extends Shape {

    final private double PI=3.1415926;
 	double r;
	@Override
	public double area() {
		// TODO Auto-generated method stub
		return PI*r*r;
	}

	@Override
	public double girth() {
		// TODO Auto-generated method stub
		return 2*r*PI;
	}

}
