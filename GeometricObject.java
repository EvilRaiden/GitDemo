abstract class GeometricObject{

protected boolean filled;
protected String colour;

GeometricObject(){}
GeometricObject(String colour, boolean filled){}
String getColour(){return colour;}
void setColour(String colour){this.colour = colour;}
boolean isFilled(){return filled;}
void setFilled(boolean filled){ this.filled = filled;}


public abstract double getArea();
public abstract double getPerimeter();
public abstract String getShape();

}