import java.io.*;

import java.util.*;

// 시작점과 끝점이 첫번째 원소의 인덱스를 가리키도록 한다.
// 현재 부분 합이 M과 같다면 카운트한다.
// 현재 부분 합이 M보다 작다면 end를 1 증가시킨다.
// 현재 부분 합이 M보다 크거나 같다면 start를 1 증가시킨다.
// 모든 경우를 확인할 때까지 2-4번 과정을 반복한다


public class Main {
    public static int twoPointer(int [] arr, int m){
        int answer = 0;
        int sum = 0;
        int count = arr.length;
        int start =0, end =0;

       while(start<count){
            if(sum == m){
                answer ++;
            }
         if(sum > m || end == count){
             sum-=arr[start];
             start++;
         }else{
             sum += arr[end];
             end++;
         }

       }
       return answer;
    }

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); //데이터 갯수
        int m = sc.nextInt(); // 부분합 수
        int[] arr = new int[n];
        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println(twoPointer(arr,m));


    }
}


