package ie.atu.oop.week1;

import java.util.HashSet;
import java.util.Set;
import java.util.Scanner;

public class Workshop {
    private String WorkshopName;
    private int Capacity;
    private Set<String> studentID = new HashSet<>();
    private  int capCounter = 0;
    public Workshop(String WorkshopName, int Capacity)
    {
        this.WorkshopName = WorkshopName;
        this.Capacity = Capacity;
        this.studentID = new HashSet<>();
        this.capCounter = capCounter;
        this.attemptCounter = attemptCounter;

    }
    public  String getWorkshopName()
    {return WorkshopName;}

    public  int getCapacity()
    {return Capacity;}

    public  Set<String> getStudentID()
    {return studentID;}

    public void addStudentID(String input)
    {
        if (capCounter > Capacity)
        {
            System.out.println("Capacity exceeded");
        }
        if (input == null || input.isEmpty())
        {
            System.out.println("cannot be blank");
        }
        if(studentID.contains(input))
        {
            System.out.println("student ID already registered");
        }

        else {
            studentID.add(input);
            System.out.println("Registered");
            capCounter++;
        }


    }

    public void registerStudentID(String input , int attempts)
    {
        int counter = 0;
        System.out.println(getWorkshopName());
        System.out.println(getCapacity());
        Scanner sc = new Scanner(System.in);
        while (counter <= attempts)
        {

            System.out.println("enter student ID");
            addStudentID(sc.next());


            counter++;
        }

        System.out.println(getStudentID());


    }
    }
}
