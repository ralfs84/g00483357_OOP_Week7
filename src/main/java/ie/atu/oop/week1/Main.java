package ie.atu.oop.week1;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int counter = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Workshop Name: ");
        String WorkshopName = sc.nextLine();
        System.out.println("Capacity: ");
        int capacity = sc.nextInt();
        System.out.println("How many attempts: ");
        int attempts = sc.nextInt();
        Workshop workshop = new Workshop(WorkshopName,capacity);

        System.out.println(workshop.getWorkshopName());
        System.out.println(workshop.getCapacity());

        while (counter <= attempts)
        {

            System.out.println("enter student ID");
            workshop.addStudentID(sc.next());


            counter++;
        }

        System.out.println(workshop.getStudentID());


    }

}