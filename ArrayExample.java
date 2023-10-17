public class ArrayExample {
    public static void main(String args[]) {
        int[] num = { 5, 5, 8, 6 };

        System.out.println("Elements in Array");
        for (int i = 0; i < num.length; i++)
            System.out.print(num[i] + " "); 

        int[] result = reverse(num);
        System.out.println("\nElements in new array");
        for (int i = 0; i < result.length; i++)
            System.out.print(result[i] + " "); 
    }

    static int[] reverse(int[] orgArray) {
        int[] temp = new int[orgArray.length];
        int j = 0;
        for (int i = orgArray.length - 1; i >= 0; i--, j++) {
            temp[j] = orgArray[i];
        }
        return temp;
    }
}