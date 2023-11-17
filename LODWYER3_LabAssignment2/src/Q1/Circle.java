package Q1;

public class Circle { // class declaration
    public double radius; // declaration of radius variable

    public void setRadius(double radius) {
        this.radius = radius; // uses 'this' keyword to set the object radius variable equal to the reference radius variable
    }
    public double getRadius()
    {
        return radius;
    } // getter method returns radius value
    public double getArea() {
        return Math.PI*Math.pow(radius,2);
    }  // getter method returns area of circle with given radius
    public double getDiameter()
    {
        return 2*radius;
    } // getter method returns diameter of circle with given radius
    public double getCircumference()
    {
        return Math.PI*2*radius;
    } // getter method returns circumference of circle with given radius
}
