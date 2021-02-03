abstract class GeometricObject{

protected boolean filled;
protected String colour;

GeometricObject(){}
GeometricObject(String colour, boolean filled){}
String getColour(){return colour;}
void setColour(String colour){this.colour = colour;}
boolean isFilled(){return filled;}
void setFilled(boolean filled){ this.filled = filled;}

//calculate the area
public abstract double getArea();
  //calculates the perimeter
public abstract double getPerimeter();
  //makes the shape
public abstract String getShape();

}
