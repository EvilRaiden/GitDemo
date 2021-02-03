//An interface is a completely "abstract class" that is used to group related methods with empty bodies
public interface ShapeCollection 
{
  
    // Method adds a new instance of the shape object to a parent instance variable of a ArrayList type 
    public abstract void addShape(GeometricObject shape);
    
    // Method iterates over the parent instance variable of a ArrayList type ,prints the name, and the type of objjec. eg: V3 Circle
    public abstract void printShapeList();
    
    // Method return boolean   
    public abstract boolean runMenu();
}
