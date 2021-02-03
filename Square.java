import java.lang.Math.*;
public class Square extends GeometricObject{

protected double side;
public Square(){}
public Square(double s){side=s;}

public Square(double s,String colour, boolean filled){
	super(colour,filled);
	side=s;
	}
public void setSide(double s){side=s;}
public double getSide(){return side;}
public double getArea(){return side*side;}
public double getPerimeter(){return 4*side;}
public String getShape(){return "Square";}
public String toString(){return "side is "+side;}

}