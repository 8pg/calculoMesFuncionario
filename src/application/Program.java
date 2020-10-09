package application;

import entities.Departament;
import entities.HourContract;
import entities.Worker;
import entities_enum.WorkerLevel;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author 8pg
 */
public class Program {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner read = new Scanner(System.in);
        Worker worker = new Worker();
        HourContract hContract = new HourContract();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        Departament dep = new Departament();

        System.out.print("Enter departament's name: ");
        dep.setName(read.nextLine());
        System.out.println("Enter worker Data: ");
        System.out.print("Name: ");
        worker.setName(read.nextLine());
        System.out.print("Level: ");
        String level = read.nextLine();
        if (level.equalsIgnoreCase("JUNIOR")) {
            worker.setLevel(WorkerLevel.JUNIOR);
        } else if (level.equalsIgnoreCase("Pleno") || level.equalsIgnoreCase("Mid Level") || level.equalsIgnoreCase("MID_LEVEL")) {
            worker.setLevel(WorkerLevel.MID_LEVEL);
        } else if (level.equalsIgnoreCase("SENIOR")) {
            worker.setLevel(WorkerLevel.SENIOR);
        } else {

        }
        System.out.print("Base salary: ");
        worker.setBaseSalary(read.nextDouble());
        System.out.print("\nHow many contracts to this worker? ");
        int qContract = read.nextInt();

        for (int i = 0; i < qContract; i++) {
            System.out.print("Enter contract #" + i + 1 + " data:");
            System.out.print("Date (DD/MM/YYYY): ");
            String date = read.next();
            try {
                hContract.setDate(sdf.parse(date));
            } catch (ParseException ex) {
                System.out.println("Formato de Data aceito: DD/MM/YYYY");
            }
            System.out.print("Value per hour: ");
            hContract.setValuePerHour(read.nextDouble());
            System.out.print("Duration (hours): ");
            hContract.setHours(read.nextInt());
        }

        System.out.println("Enter month and year to calculate income (MM/YYYY): ");

        System.out.println("Name: " + worker.getName());
        System.out.println("Departament: " + dep.getName());
        System.out.println("Income for ");

        read.close();
    }

}
