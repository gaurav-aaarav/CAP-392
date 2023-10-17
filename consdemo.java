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

    void setDimensions(int l, int b) {
        length = l;
        breadth = b;
    }

    int area() {
        return length * breadth;
    }
}

public class consdemo {
    public static void main(String[] args) {
        Rectangle firstRect = new Rectangle();

        Rectangle copyRect = new Rectangle();
        copyRect.setDimensions(9, 11);

        int area = copyRect.area();
        System.out.println("Area of copied rectangle: " + area);
    }
}
