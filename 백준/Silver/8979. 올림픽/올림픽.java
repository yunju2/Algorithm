import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Nation implements Comparable<Nation>{
    int NationNum;
    int Gold;
    int Silver;
    int Bronze;
    int rank;

    public Nation(int nationNum, int gold, int silver, int bronze, int rank) {
        this.NationNum = nationNum;
        this.Gold = gold;
        this.Silver = silver;
        this.Bronze = bronze;
        this.rank = rank;
    }

    @Override
    public int compareTo(Nation o) {
        if(this.Gold == o.Gold) {
            if(this.Silver == o.Silver){
                return o.Bronze - this.Bronze;
            }
            else return o.Silver - this.Silver;
        }
        else return o.Gold - this.Gold;
    }
}



public class Main {
   // private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();

        ArrayList<Nation> nations = new ArrayList<>();

        for(int i = 0; i<N; i++){
            int n = sc.nextInt();
            int g = sc.nextInt();
            int s = sc.nextInt();
            int b = sc.nextInt();
            int rank = 0;
            nations.add(new Nation(n, g, s, b, rank));
        }

        Collections.sort(nations);

        nations.get(0).rank = 1;

        for(int i=1; i<nations.size(); i++) {
            Nation origin = nations.get(i-1);
            Nation next = nations.get(i);

            if(origin.Gold == next.Gold && origin.Silver == next.Silver && origin.Bronze == next.Bronze){
                next.rank = origin.rank;
            } else{
                next.rank = i+1;
            }

        }


        for(int i = 0; i < nations.size();i++){

            if(nations.get(i).NationNum == K){
                System.out.println(nations.get(i).rank);
                break;
            }
        }

    }




}


