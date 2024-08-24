class A<T> {
    void print(T x) {
        System.out.println(x);  // This will print the value of x directly
    }
}

public class Test<T> {

    T[] arr = (T[]) new Object[3];  // Suppress unchecked warnings

    public static void main(String[] args) {
        // Example usage of A with Integer
        A<Integer> obj1 = new A<>();
        obj1.print(12);  // This works fine for an Integer

        // Array of Objects with different types
        Object[] arr = new Object[3];
        arr[0] = 23;       // Integer
        arr[1] = 43;       // Integer
        arr[2] = "hello";  // String

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] instanceof Integer) {  // Check if the element is an Integer
                int number = (Integer) arr[i];
                System.out.println(number);
            } else {
                System.out.println("Not an Integer: " + arr[i]);
            }
        }
    }
}
