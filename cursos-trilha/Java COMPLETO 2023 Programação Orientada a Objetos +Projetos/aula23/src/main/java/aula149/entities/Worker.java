package aula149.entities;

import aula149.WorkerLevel;

import java.time.LocalDate;
import java.time.Year;
import java.util.ArrayList;
import java.util.List;

public class Worker {
    private String name;

    private WorkerLevel level;

    private Double baseSalary;

    private List<HourContract> hourContractList;

    private Department department;


    public Worker(String name, WorkerLevel level, Double baseSalary) {
        this.name = name;
        this.level = level;
        this.baseSalary = baseSalary;
        this.hourContractList = new ArrayList<>();
    }

    public Worker(String name, WorkerLevel level, Double baseSalary, List<HourContract> hourContractList, Department department) {
        this.name = name;
        this.level = level;
        this.baseSalary = baseSalary;
        this.hourContractList = hourContractList;
        this.department = department;
    }

    public void addContract(HourContract newContract){
        this.hourContractList.add(newContract);
    }

    public void removeContract(HourContract contractToRemove){
        this.hourContractList.remove(contractToRemove);
    }

    public Double income(Integer year, Integer month){
        LocalDate dataTrampo = null;
        double income = 0;

        for (HourContract trampo: this.hourContractList) {
            dataTrampo = trampo.getLocalDate();

            //debug
//            System.out.println("====================================================");
//            System.out.println("MES : " + month + "\nANO: " + year);
//            System.out.println("MES trampo : " + dataTrampo.getMonthValue() + "\nAno trampo: " + dataTrampo.getYear());
//            System.out.println("HORAS: " + trampo.getHours());
//            System.out.println("Valor hora: " + trampo.getValuePerHour());
//            System.out.println("Trampo: " + dataTrampo.toString());
//            System.out.println("=====================================================");

            if (dataTrampo.getYear() == year && dataTrampo.getMonthValue() == month){
                //System.out.println("calculo income: " + income);
                income += trampo.totalValue();
            }
        }

        return income + this.baseSalary;
    }

    // ++++++++++++++++++++++++++++---------------------------------
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public WorkerLevel getLevel() {
        return level;
    }

    public void setLevel(WorkerLevel level) {
        this.level = level;
    }

    public Double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(Double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public List<HourContract> getHourContractList() {
        return hourContractList;
    }

    //public void setHourContractList(List<HourContract> hourContractList) {
    //    this.hourContractList = hourContractList;
    //}

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }
}
