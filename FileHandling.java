package javaapplication1;

import java.io.*;
import java.util.*;
import java.lang.reflect.Array;

public class FileHandling {

    public static void main(String[] args) throws IOException {

        try {

            DataInputStream input = new DataInputStream(new FileInputStream("Sample.txt"));

            String output = "";
            int file;
            while (true) {
                file = input.read();
                if (file == -1) {
                    break;
                }

                output += (char) file;

            }
            String[] nums = output.split(" ");
            int[] array = new int[nums.length];
            for (int i = 0; i < nums.length; i++) {
                array[i] = Integer.parseInt(nums[i]);
            }

            Arrays.sort(array);
            System.out.println("Ascending Order :" + Arrays.toString(array));

            Integer[] ar = new Integer[array.length];
            for (int j = 0; j < array.length; j++) {
                ar[j] = Integer.parseInt(nums[j]);
            }
            Arrays.sort(ar, Collections.reverseOrder());
            System.out.println("Descending Order:" + Arrays.toString(ar));

            input.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not Found");
        } catch (IOException e) {
            System.out.println("Input/Output Error");
        }
    }
}
