class Rectangle {
    int length;
    int breadth;

    void setData(int a, int b) 
	{
        length = a;
        breadth = b;
    }

    int area() {
        int rectArea;
        rectArea = length * breadth;
        return rectArea;
    }
}

public class RectangleArea {
    public static void main(String args[]) {
        Rectangle firstRect = new Rectangle();
		Rectangle firstRect = new Rectangle(6)
        firstRect.setData(5, 6);
        int result = firstRect.area();
        System.out.println("Area of rectangle => " + result);
    }
}
