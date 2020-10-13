package application;

import entities.Departament;
import entities.HourContract;
import entities.Worker;
import entities_enum.WorkerLevel;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author 8pg
 */
public class Program {

    public static void main(String[] args) throws ParseException {
        Locale.setDefault(Locale.US);
        Scanner read = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.print("Enter departament's name: ");
        String dep = read.nextLine();
        System.out.println("Enter worker Data: ");
        System.out.print("Name: ");
        String name = read.nextLine();
        System.out.print("Level: ");
        String level = read.nextLine();
        System.out.print("Base salary: ");
        double baseSalary = read.nextDouble();

        Worker worker = new Worker(name, WorkerLevel.valueOf(level), baseSalary, new Departament(dep));

        System.out.print("\nHow many contracts to this worker? ");
        int qContract = read.nextInt();

        for (int i = 0; i < qContract; i++) {
            System.out.print("Enter contract #" + (i + 1) + " data:");
            System.out.print("Date (DD/MM/YYYY): ");
            Date date = sdf.parse(read.next());
            System.out.print("Value per hour: ");
            double valuePerHour = read.nextDouble();
            System.out.print("Duration (hours): ");
            int hours = read.nextInt();
            HourContract contract = new HourContract(date, valuePerHour, hours);
            worker.addContract(contract);
        }

        String sMonth = null, sYear = null;
        int oYear, oMonth;
        System.out.print("\nEnter month and year to calculate income (MM/YYYY): ");
        String dateIncome = read.next();
        sMonth = dateIncome.substring(0, 2);
        sYear = dateIncome.substring(3);
        oMonth = Integer.parseInt(sMonth);
        oYear = Integer.parseInt(sYear);
        System.out.println("Name: " + worker.getName());
        System.out.println("Departament: " + worker.getDepartament().getName());
        System.out.println("Income for " + sMonth + "/" + sYear + ": " + String.format("%.2f", worker.income(oYear, oMonth)));
        read.close();
    }

}
