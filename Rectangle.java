import java.lang.Math.*;
public class Rectangle extends GeometricObject{

protected double length, width;
public Rectangle(){}
public Rectangle(double l, double w){length= l;width = w;}
	
// colour of the lines
public Rectangle(double l, double w, String colour, boolean filled){
	super(colour,filled);
	length= l;width = w;
	}
	
public void setLength(double l){length = l;}// code for length and data type
public double getLength(){return length;}
public void setWidth(double w){width = w;}// code for width
public double getWidth(){return width;}
public double getArea(){return width*length;}// calculates area
public double getPerimeter(){return (2*length)*(2*width);}// calculates perimeter
public String getShape(){return "Rectangle";}// creates a shape output
public String toString(){return "len is "+length+" width is "+width;}

}
