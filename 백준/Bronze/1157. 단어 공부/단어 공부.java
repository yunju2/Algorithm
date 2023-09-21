import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        str = str.toUpperCase();
        String [] arr = str.split("");
        HashMap<String,Integer> hp = new HashMap<String, Integer>();

        for(int i =0; i<arr.length; i++){
            if(hp.containsKey(arr[i])) {
                hp.put(arr[i],hp.get(arr[i])+1);
            } else {
                hp.put(arr[i],1);
            }
        }
        ArrayList<String> a = new ArrayList<String>();
        int i =0;
        int maxValue = Collections.max(hp.values());
        for(Map.Entry<String, Integer> m: hp.entrySet()) {
            if(m.getValue() == maxValue) {
                a.add(m.getKey());
            }
        }
        if(a.size()>1){
            System.out.println("?");
        } else {
            System.out.println(a.get(0));
        }





    }
}