
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    static int arr [][];
    static int white = 0;
    static int blue = 0;

    public static void solution(int num, int x, int y) {
        if(colorCheck(num,x,y)){
            if(arr[x][y] == 0){
                white++;
            }else{
                blue++;
            }
            return;
        }

        int size = num / 2;

        solution(size,x,y);
        solution(size, x,y+size);
        solution(size,x+size, y);
        solution(size,x+size,y+size);

    }
    public static boolean colorCheck(int num, int x, int y){
        int color = arr[x][y];

        for(int i = x; i <x+num; i++){
            for(int j = y; j < y+num; j++){
                if(arr[i][j] != color){
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        arr = new int [num][num];


        for(int i = 0; i<num;i++){
            for(int j = 0; j <num; j++){
                arr[i][j] = sc.nextInt();
            }
        }


        solution(num,0,0);
        System.out.println(white);
        System.out.println(blue);



    }

}




