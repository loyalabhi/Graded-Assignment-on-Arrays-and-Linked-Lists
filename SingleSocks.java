import java.util.*;

public class SingleSocks {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = in.nextInt();
        int[] arrNum = new int[size];

        System.out.println("Enter " + size + " sock IDs:");
        for (int i = 0; i < size; i++) {
            arrNum[i] = in.nextInt();
        }

        System.out.println("Sample input: arrNum = " + arrayToString(arrNum));
        System.out.println("Count of singular socks = " + countSocks(arrNum));

        in.close(); 

    public static int countSocks(int[] arr) {
        Map<Integer, Integer> sockCountMap = new HashMap<>();

        for (int sockId : arr) {
            sockCountMap.put(sockId, sockCountMap.getOrDefault(sockId, 0) + 1);
        }

        int singularCount = 0;
        for (int count : sockCountMap.values()) {
            if (count % 2 != 0) {
                singularCount++;
            }
        }

        return singularCount;
    }

    public static String arrayToString(int[] arr) {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < arr.length; i++) {
            sb.append(arr[i]);
            if (i < arr.length - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}

