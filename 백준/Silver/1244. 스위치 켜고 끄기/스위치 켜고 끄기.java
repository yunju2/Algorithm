import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int sw = Integer.parseInt(br.readLine());
        boolean[] switchArray = new boolean[sw + 1];
        String [] line = br.readLine().split(" ");

        for(int i = 1; i <= sw; i ++) {
            switchArray[i] = (line[i - 1].equals("1")) ? true : false;
        }

        int studentNum = Integer.parseInt(br.readLine());

        for(int j = 0; j<studentNum; j++) {
            String [] input = br.readLine().split(" ");
            int gender = Integer.parseInt(input[0]);
            int num = Integer.parseInt(input[1]);

            if(gender == 1) {
                int count = num;
                while(count <= sw) {
                    switchArray[count] = !switchArray[count];
                    count += num;
                }

            }else if (gender == 2) {
                switchArray[num] = !switchArray[num];
                for(int value = 1; num - value >= 1 && num + value <= sw; value++ ) {
                    if(switchArray[num - value] != switchArray[num + value]) {
                        break;
                    } else {
                        switchArray[num - value] = switchArray[num + value] = !switchArray[num - value];
                    }
                }

            }
        }


        for(int output = 1; output <= sw; output++){
            int answer = switchArray[output] ? 1 : 0;
            System.out.print(answer + " ");
            if(output % 20 == 0) {
                System.out.println();
            }
        }


    }
}
