class Rectangle {
    double length;
    double width;

    
    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    
    public double area() {
        return length * width; 
    }

    
    public double perimeter() {
        return 2 * (length + width);
    }

    public void display() {
        System.out.println("Length: " + length + ", Width: " + width);
        System.out.println("The area is: " + area());
        System.out.println("The Perimeter is: " + perimeter());
        System.out.println("---------------------------");
    }
}

class Cw2 {
    public static void main(String[] args) {
        Rectangle rectangle1 = new Rectangle(45.2, 34.8);
        Rectangle rectangle2 = new Rectangle(58.9, 40.8);
        
        rectangle1.display();
        rectangle2.display();
    }
}