package aula149;

import aula149.entities.Department;
import aula149.entities.HourContract;
import aula149.entities.Worker;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DateFormat;
import java.text.ParseException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class Aula149 {
    public static void main(String[] args) throws IOException, ParseException {
        Locale.setDefault(Locale.US);
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        Scanner sc = new Scanner(System.in);
        DateTimeFormatter fmtData = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter fmtMesAno = DateTimeFormatter.ofPattern("MM/yyyy");



        System.out.print("Enter department's name: ");
        Department newDepartemnt = new Department(sc.nextLine());

        System.out.println("Enter worker data: ");
        System.out.print("Name: ");
        String name = bf.readLine();

        System.out.print("Level: ");
        WorkerLevel level = WorkerLevel.valueOf(bf.readLine());

        System.out.print("Base salary: ");
        Double salario = Double.valueOf(bf.readLine());

        System.out.print("How many contracts to this worker? ");
        int numberOfContracts = Integer.valueOf(bf.readLine());

        Worker worker = new Worker(name, level, salario);
        worker.setDepartment(newDepartemnt);

        for(int i = 0; i < numberOfContracts; i++){
            System.out.printf("Enter contract #%d data: %n", i+1);
            System.out.print("Date (DD/MM/YYYY): ");
            String novaData = bf.readLine();

            System.out.print("Value per hour: ");
            Double valorPorHora = Double.valueOf(bf.readLine());

            System.out.print("Duration (hours): ");
            int duracao = Integer.valueOf(bf.readLine());

            LocalDate dataContrato = LocalDate.parse(novaData, fmtData);

            worker.addContract(new HourContract(dataContrato, valorPorHora, duracao));

        }


        System.out.print("Enter month and year to calculate income (MM/YYYY): ");
        String income = bf.readLine();
        income = "01/" + income;
        LocalDate dataIncome = LocalDate.parse(income, fmtData);





        Double receitaMes = worker.income(dataIncome.getYear(), dataIncome.getMonthValue());

        System.out.println("Name: " + worker.getName());
        System.out.println("Department: " + worker.getDepartment().getName());
        System.out.println("Income for " + income + ": " + receitaMes );




    }
}
