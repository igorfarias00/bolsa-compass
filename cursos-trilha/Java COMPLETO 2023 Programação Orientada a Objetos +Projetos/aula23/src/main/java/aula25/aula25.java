package aula25;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.util.Scanner;

public class aula25 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        BufferedReader buffSc = new BufferedReader(new InputStreamReader(System.in));

        String testeScanner1, testeScanner2, testeScanner3;
        String buffScan1, buffScan2, buffScan3;
        String x;
        int a, b, c, y;
        double z;

        testeScanner1 = sc.next();
        System.out.println(testeScanner1);

        x = sc.next();
        y = sc.nextInt();
        z = sc.nextDouble();

        System.out.println("Dados digitados: ");
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);



    }
}
