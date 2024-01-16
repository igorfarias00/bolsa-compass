package aula248;

import java.util.Map;
import java.util.TreeMap;

public class Aula248 {

    public static void main(String[] args) {
        Map<String, String> cookie = new TreeMap<>();

        cookie.put("username", "Maria");
        cookie.put("email", "maria@gmail.com");
        cookie.put("phone", "99711122");

        cookie.remove("email");
        cookie.put("phone", "99771133");

        System.out.println("Contains 'phone' key: " + cookie.containsKey("phone"));
        System.out.println("Phone number: " + cookie.get("phone"));

        System.out.println("Email: " + cookie.get("email"));

        System.out.println("Size: " + cookie.size());

        System.out.println("ALL COOKIES:");
        for(String key : cookie.keySet()){
            System.out.println(key + ": " + cookie.get(key));
        }

    }

}
