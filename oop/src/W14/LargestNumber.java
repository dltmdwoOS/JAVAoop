package W14;

import java.util.Vector;
import java.util.Scanner;

public class LargestNumber {
    
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        Vector<Integer> v = new Vector<Integer>();

        while(true){
            int in = scanner.nextInt();
            if (in == -1){
                break;
            }
            v.add(in);
        }
        int index = -1;
        int max = 0;
        for (int i = 0; i < v.size(); i++){
            if (max < v.get(i)){
                index = i;
                max = v.get(i);
            }
        }
        System.out.println(max);
    }
}
