import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;


public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(br.readLine());
        String expression = br.readLine();
        Stack<Double> stack = new Stack<>();

        double [] arr = new double [count];
        for(int i =0; i< count; i ++){
            arr[i] = Integer.parseInt(br.readLine());
        }

        for(int i = 0; i < expression.length(); i++){
            if(expression.charAt(i) >='A' && expression.charAt(i) <= 'Z'){
                    stack.push(arr[expression.charAt(i) - 'A']);
            } else{
                if(!stack.empty()) {
                    double rt = stack.pop();
                    double lt = stack.pop();
                    if (expression.charAt(i) == '+') stack.push(lt + rt);
                    else if (expression.charAt(i) == '-') stack.push(lt - rt);
                    else if (expression.charAt(i) == '/') stack.push(lt / rt);
                    else if (expression.charAt(i) == '*') stack.push(lt * rt);
                }
            }
        }


        System.out.printf("%.2f", stack.pop());


    }
}


