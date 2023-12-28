package aula172;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Aula172 {
    public static void main(String[] args) {
        File flie = new File("C:\\temp\\in.txt");
        Scanner sc = null;

        try {
            sc = new Scanner(flie);

            while (sc.hasNextLine()){
                System.out.println(sc.nextLine());
            }
        } catch (FileNotFoundException fileNotFound){
            System.out.println("Erro ao abrir o arquivo: " + fileNotFound.getMessage());
        } finally {
            if (sc != null){
                sc.close();
            }
            System.out.println("Fim do programa");
        }

    }
}
