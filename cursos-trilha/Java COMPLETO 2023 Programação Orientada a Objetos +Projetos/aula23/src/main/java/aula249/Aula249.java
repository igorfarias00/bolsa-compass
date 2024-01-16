package aula249;

import aula239.entities.Product;
import aula239.services.CalculationService;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class Aula249 {
    public static void main(String[] args) {
        Map<String, Integer> canditates = new LinkedHashMap<>();
        Scanner sc = new Scanner(System.in);
        String path = "";

        canditates.put("Alex Blue", 0);
        canditates.put("Maria Green", 0);
        canditates.put("Bob Brown", 0);

        System.out.println("Enter file full path: ");
        path = sc.nextLine();

        try (BufferedReader br = new BufferedReader(new FileReader(path))){
            String line = br.readLine();
            while (line != null){
                String[] fields = line.split(",");
                if(canditates.containsKey(fields[0])){
                    canditates.put(fields[0], canditates.get(fields[0]) + Integer.parseInt(fields[1]));
                }

                line = br.readLine();
            }




        } catch (IOException e){
            System.out.println("Error: " + e.getMessage());
        }

        for(String canditate : canditates.keySet()){
            System.out.println(canditate + ": " + canditates.get(canditate));
        }
    }
}
