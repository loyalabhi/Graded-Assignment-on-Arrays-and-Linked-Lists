import java.util.*;

public class Missingnumbers{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = in.nextInt();
        int[] arrNum = new int[size];

        System.out.println("Enter " + size + " integers:");
        for (int i = 0; i < size; i++) {
            arrNum[i] = in.nextInt();
        }

        System.out.println("Sample input: arrNum = " + Arrays.toString(arrNum));
        System.out.println("Output: " + findMissingNumbers(arrNum));

        in.close(); // Close the scanner when it's no longer needed
    }

    public static List<Integer> findMissingNumbers(int[] arr) {
        List<Integer> missingnumbers = new ArrayList<>();
        int Expected = arr[0] + 1;

        for (int i = 1; i < arr.length; i++) {
            while (Expected < arr[i]) {
                missingnumbers.add(Expected);
                Expected++;
            }
            Expected = arr[i] + 1;
        }

        return missingnumbers;
    }
}
