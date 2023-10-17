 class Rectangle {
    int length;
    int breadth;

    
    Rectangle() {
        length = 6;
        breadth = 11;
    }

   
    Rectangle(int l, int b) {
        length = l;
        breadth = b;
    }

   
    Rectangle(Rectangle obj) {
        System.out.println("Copy constructor invoked");
        length = obj.length;
        breadth = obj.breadth;
    }

    int area() {
        return length * breadth;
    }
}

public class RectangleDemo {
    public static void main(String[] args) {
     
        Rectangle firstRect = new Rectangle(9, 11);

       
        Rectangle copyRect = new Rectangle(firstRect);

        
        int area = copyRect.area();
        System.out.println("Area of copied rectangle: " + area);
    }
}
