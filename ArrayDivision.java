public class ArrayDivision {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40};
        int index = 5;
        int divisor = 2;

        System.out.println("Array: [10, 20, 30, 40]");
        System.out.println("Enter index: " + index);
        System.out.println("Enter divisor: " + divisor);

        try {
            int result = arr[index] / divisor;
            System.out.println("Result: " + result);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception: Array index out of bounds");
        } catch (ArithmeticException e) {
            System.out.println("Exception: Division by zero not allowed");
        }
    }
}