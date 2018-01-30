/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package missingnumsproblem;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author Pc
 */
public class MissingNumsProblem {

    public static void main(String[] args) {
        // first sort array
        int N[] = {5, 3, 8, 7, 9};
        Arrays.sort(N);
        findMissingNumbers(N);
    }

    public static void findMissingNumbers(int[] nums) {
        // init new list
        List<Integer> themissingNums = new ArrayList<>();

        // check the num if gt ZERO
        if (nums[0] != 0) {
            for (int x = 0; x < nums[0]; x++) {
                // add the smallest number
                themissingNums.add(x);
            }
        }

        for (int i = 0; i < nums.length - 1; i++) {
            int j = i + 1;
            // calc the diffrence betweeb the INDEX and index nect
            int difference = nums[j] - nums[i];
            if (difference != 1) {
                for (int x = 1; x < difference; x++) {
                    themissingNums.add(nums[i] + x);
                }
            }
        }

        for (int z = 0; z < themissingNums.size(); z++) {
            System.out.println(themissingNums.get(z));
        }

    }

}
