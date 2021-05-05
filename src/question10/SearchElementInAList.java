/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Venkat Sai Jarugula
 */
public class SearchElementInAList {

    public static void main(String[] args) {

        System.out.println("Question:10 By Venkat Sai Jarugula");
        List<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(2, 7, 11, 33, 55, 67));
        System.out.print("Enter element to search : ");
        Scanner scan = new Scanner(System.in);
        Integer x = scan.nextInt();

        int index = recursionSearch(list, 0, list.size() - 1, x);
        if (index != -1) {
            System.out.println("Element " + x + " is present at index "
                    + index);
        } else {
            System.out.println("Element " + x + " is not present");
        }
    }

    public static int recursionSearch(List list, int startPosition, int endPosition, Integer x) {

        if (endPosition < startPosition) {
            return -1;
        }
        if (list.get(startPosition) == x) {
            return startPosition;
        }
        if (list.get(endPosition) == x) {
            return endPosition;
        }

        return recursionSearch(list, startPosition + 1, endPosition - 1, x);
    }

}
