package com.nopcommerce.users;

import java.util.Arrays;

public class test {

    public static void main(String[] args) {
//        int[][] matrix = {
//                {1, 2, 3},
//                {4, 5, 6},
//                {7, 8, 9}
//        };
//
//        Arrays.stream(matrix).forEach(row -> {
//            Arrays.stream(row).forEach(cell -> System.out.print(cell + " "));
//            System.out.println();
//        });
//
//        Arrays.stream(matrix)
//                .flatMapToInt(Arrays::stream)
//                .forEach(element -> System.out.print(element + " "));
//
//        System.out.println(Arrays.deepToString(matrix));

        try {
            checkAge(15);  // Gây ra ngoại lệ
        } catch (IllegalArgumentException e) {
            System.out.println("Lỗi: " + e.getMessage());
        }
    }

    public static void checkAge(int age) {
        if (age < 18) {
            throw new IllegalArgumentException("Tuổi phải lớn hơn hoặc bằng 18");
        }
        System.out.println("Tuổi hợp lệ");
    }

}
