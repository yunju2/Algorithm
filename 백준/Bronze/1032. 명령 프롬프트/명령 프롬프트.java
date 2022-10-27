
import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] arr = new String[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.next();
        }

        StringBuilder sb = new StringBuilder();
        boolean isSame = true;

        for(int i =0; i<arr[0].length(); i++){
            char c = arr[0].charAt(i);
            isSame = true;
            for(int j =1; j<n; j++){
                if(c!= arr[j].charAt(i)){
                    isSame =false;
                    break;
                }
            }
            if(isSame == true){
                sb.append(c);
            }else{
                sb.append('?');
            }
        }


		System.out.println(sb.toString());
}
}