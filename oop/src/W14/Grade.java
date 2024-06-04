package W14;

import java.util.*;
public class Grade {
    public static void main(String[] args) {
        ArrayList<String> a = new ArrayList<String>();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter grades >>");
        for(int i=0; i<6; i++) {
            String s = scanner.next();
            a.add(s);
        }
        HashMap<String, Double> map = new HashMap<String, Double>();
        map.put("A", 4.0);
        map.put("B", 3.0);
        map.put("C", 2.0);
        map.put("D", 1.0);
        map.put("F", 0.0);

        Double sum = 0.0;
        for (int i = 0; i < a.size(); i++){
            sum += map.get(a.get(i));
        }
        System.out.println(sum / 6);
    }
}