package entities;

import entities_enum.WorkerLevel;
import java.util.List;

/**
 *
 * @author 8pg
 */
public class Worker {

    private String name;
    private WorkerLevel level;
    private Double baseSalary;
    private Departament departament; //Associação
    private List<HourContract> contracts; //Composição

    public Worker() {
    }

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

    public void addContract(HourContract contract) {

    }

    public void removeContract(HourContract contract) {

    }

    public Double income(Integer year, Integer month) {
        return 0.00;
    }
}
