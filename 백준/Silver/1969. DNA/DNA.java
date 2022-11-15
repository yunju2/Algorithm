import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] sarr = br.readLine().split(" ");
        int cnt = Integer.parseInt(sarr[0]);
        int n = Integer.parseInt(sarr[1]);

        int hd = 0;

        String [] dna = new String[cnt];
        for(int i =0; i<cnt; i++){
            dna[i] = br.readLine();
        }

        StringBuffer buf = new StringBuffer();

        for(int i =0; i<n;i++){
            int [] gene = new int[4];
            for(int j =0;j<cnt;j++){
                switch (dna[j].charAt(i)){
                    case 'A' : gene[0]++; break;
                    case 'C' : gene[1]++; break;
                    case 'G' : gene[2]++; break;
                    case 'T' : gene[3]++; break;
                }
            }
          int idx = 0;
          int max = 0;
          for(int k = 0; k <4; k++){
              if(gene[k] > max || gene[k] == max && k<idx){
                  max = gene[k];
                  idx = k;
              }
          }

            switch (idx) {
                case 0:
                    buf.append('A');
                    break;
                case 1:
                    buf.append('C');
                    break;
                case 2:
                    buf.append('G');
                    break;
                case 3:
                    buf.append('T');
                    break;
            }
            hd += cnt - max;

        }

        bw.write(buf.toString() + "\n");
        bw.write(hd + "\n");
        bw.flush();

    }
}


