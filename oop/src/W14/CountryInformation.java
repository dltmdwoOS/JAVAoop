package W14;

import java.util.*;

public class CountryInformation {
    public static void main(String args[]){
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter country name and population");
        while(true){
            System.out.print("Name, population >> ");
            String nation = scanner.next();
            if (nation.equals("stop")){
                break;
            }
            int population = scanner.nextInt();
            map.put(nation, population);
        }

        while(true){
            System.out.print("Search >> ");
            String nation = scanner.next();
            if (nation.equals("stop")){
                break;
            }
            int population = map.get(nation);
            System.out.println(population);
        }
    }
    
}
