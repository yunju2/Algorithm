public class Main {

    public static void main(String[] args) {



 // 3. 생성자 아닌 수 출력
        boolean [] check  = new boolean[10001];
       

        for(int i =1; i < 10001; i++){
          int num = d(i);
          if( num<10001) {
              check[num] = true;
          }
      }
         StringBuilder sb = new StringBuilder();
        for(int i = 1; i<10001; i++){
            if(!check[i]){
                sb.append(i).append('\n');
            }
        }
        System.out.println(sb);


    }
    // 1. 각 자리 수의 합을 구한다.
    // 2. 그 전 수를 합을 구한다.
    public static int d (int n){
        int result = n;

       while(n!=0){
           result+=n%10;
           n /= 10;

       }
      return result;
    }
}
