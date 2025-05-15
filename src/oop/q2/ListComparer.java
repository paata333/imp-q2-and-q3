package oop.q2;

import java.util.*;

/**
 * ListComparer - A class that processes two lists using 2n-1 logic.
 *
 * This class processes a list of integers (list1) and a list of strings (list2).
 * It implements the 2n-1 logic: elements from list2 at positions following the 2n-1 formula
 * are selected for the result list (where n=1,2,3,...).
 *
 * @author Paata Shvelidze
 * @version 1.0
 * @since 2025-05-15
 */
public class ListComparer {

    /**
     * Processes two lists to create a result list containing elements from list2 at positions 2n-1.
     *
     * @param list1 a list of integers (used for context in this assignment)
     * @param list2 a list of strings that will be checked based on the 2n-1 position formula
     * @return a list of strings containing elements from list2 at positions 2n-1
     */
    public static List<String> processLists(List<Integer> list1, List<String> list2) {
        List<String> result = new ArrayList<>();

        // Calculate how many elements we can include using the 2n-1 formula
        int maxN = (list2.size() + 1) / 2; // n can go from 1 to this value

        // Add elements that are at positions 2n-1 (where n starts from 1)
        for (int n = 1; n <= maxN; n++) {
            int position = 2 * n - 1; // Calculate the position using 2n-1 formula

            // Check if the position is valid (less than the size of list2)
            if (position < list2.size()) {
                result.add(list2.get(position));
            }
        }

        return result;
    }

    /**
     * Main method to demonstrate the list comparison functionality.
     * Creates list1 and list2 with predefined values and processes them.
     *
     * @param args command line arguments (not used)
     */
    public static void main(String[] args) {
        // Creating list1 and list2 with predefined values as shown in the problem
        List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12);
        List<String> list2 = Arrays.asList(
                "apple", "banana", "cherry", "date", "fig", "grape",
                "apple", "banana", "cherry", "date", "fig", "grape",
                "kiwi", "lemon", "mango", "nectarine", "orange"
        );

        List<String> resultList = processLists(list1, list2);
        System.out.println("Result list: " + resultList);

        // For demonstration purposes, let's show the positions and corresponding elements
        System.out.println("\nElements at 2n-1 positions:");
        int maxN = (list2.size() + 1) / 2;
        for (int n = 1; n <= maxN; n++) {
            int position = 2 * n - 1;
            if (position < list2.size()) {
                System.out.println("Position " + position + " (n=" + n + "): " + list2.get(position));
            }
        }
    }
}