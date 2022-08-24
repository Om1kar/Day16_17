package Algorithm;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {

        BinarySearch binaryObj = new BinarySearch();

        Scanner scanner = new Scanner(System.in);
        String[] wordList = {"cricket", "golf", "khokho",
                "kabaddi", "bgmi", "pubg"};

        Arrays.sort(wordList);
        System.out.println("List of Words :");

        System.out.println(Arrays.toString(wordList));
        System.out.println("Enter the word do you want to Search");

        String searchName = scanner.nextLine();
        scanner.close();

        int result = binaryObj.binarySearch(wordList, searchName);

        if (result == -1)
            System.out.println("Word is not present in the List");
        else
            System.out.println("Word is present in the List");
    }

    private int binarySearch(String[] wordList, String searchName) {
        int start = 0, length = wordList.length - 1;
        while (start <= length) {
            int middle = start + (length - start) / 2;
            int result = searchName.compareTo(wordList[middle]);
            if (result == 0)
                return middle;
            if (result > 0)
                start = middle + 1;
            else
                length = middle - 1;
        }
        return -1;
    }
    }

