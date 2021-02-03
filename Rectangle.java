import java.lang.Math.*;
public class Rectangle extends GeometricObject{

protected double length, width;
public Rectangle(){}
public Rectangle(double l, double w){length= l;width = w;}

public Rectangle(double l, double w, String colour, boolean filled){
	super(colour,filled);
	length= l;width = w;
	}
public void setLength(double l){length = l;}
public double getLength(){return length;}
public void setWidth(double w){width = w;}
public double getWidth(){return width;}
public double getArea(){return width*length;}
public double getPerimeter(){return (2*length)*(2*width);}
public String getShape(){return "Rectangle";}
public String toString(){return "len is "+length+" width is "+width;}

}