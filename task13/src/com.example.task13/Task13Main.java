package com.example.task13;

public class Task13Main {
    public static void main(String[] args) {
        //здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:
        /*
        int[] arr = {9, 1100, 7, 8};
        removeMoreThen1000(arr);
        System.out.println(java.util.Arrays.toString(arr));
         */
    }

    static int[] removeMoreThen1000(int[] arr) {
        if (arr==null){
            return null;
        }
        else if(arr.length!=0){
            int c = 0;
            for (int item : arr){
                if(item<=1000) c++;
            }
            int[] newArr = new int[c];
            int i = 0;
            for(int item : arr){
                if(item<=1000){
                    newArr[i] = item;
                    i++;
                }
            }
            return newArr;
        }
        return new int[]{};
    }

}