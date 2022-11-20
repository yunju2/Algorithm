import java.io.*;

import java.util.Scanner;


public class Main {
    public static void bubbleSort(int [] arr){
        int num = arr.length;
        for(int i =0; i<num-1; i++){
            for(int j = 0; j <num - i - 1; j++){
                if(arr[j] > arr[j+1]){
                    int tmp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = tmp;

                }
            }
        }
    }


    public static void main(String[] args) {

       Scanner  sc = new Scanner(System.in);
       int [] arr = new int[3];
       for(int i =0; i<3; i++){
           arr[i] = sc.nextInt();
       }

       bubbleSort(arr);

       for(int i : arr){
           System.out.print(i+ " ");
       }




    }
}


