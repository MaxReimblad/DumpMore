import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        Scanner userInput = new Scanner(System.in);
        DumpMore docks = new DumpMore();
        //ArrayList<Object> docked = new ArrayList<>();
        Spacing spacing = new Spacing();

        // Menu
        boolean ending = true;
        do {
            System.out.println("--- Welcome to DumpMore ---");
            System.out.print("""
                1. See parked trucks
                2. Register new truck
                3. Exit
                """);
            System.out.println("Choose from the list: ");
            String input = userInput.next();

            if (input.equals("1")) {
                /*for (Object registered:docked) {
                    System.out.println(registered);
                } */
                spacing.print();
                Thread.sleep(2000);

            } else if (input.equals("2")) {

                // Input command for truck
                Scanner userInputType = new Scanner(System.in);
                Scanner userInputWeight = new Scanner(System.in);
                spacing.print();
                System.out.print("""
                        Type of truck:
                        
                        1. Van
                        2. Small truck
                        3. Big truck
                        
                        Choose type of truck:
                        """);
                String typeOption = userInputType.nextLine();
                System.out.print("Input weight of truck (in kg): ");
                int inputWeight = userInputWeight.nextInt();

                Vehicle vehicle;
                String inputType;

                if (typeOption.equals("1")){
                    inputType = "Van";
                    vehicle = new Van(inputType, inputWeight);
                    //docked.add(inputType + " " + inputWeight + "kg");
                    docks.addVehicle(vehicle);

                } else {
                    if (typeOption.equals("2")){
                        inputType = "Small Truck";
                        vehicle = new SmallTruck(inputType, inputWeight);
                        //docked.add(inputType + " " + inputWeight + "kg");
                    } else if (typeOption.equals("3")){
                        inputType = "Big Truck";
                        vehicle = new BigTruck(inputType, inputWeight);
                        //docked.add(inputType + " " + inputWeight + "kg");
                    } else {
                        spacing.print();
                        System.out.println("That's not an option!\n");
                        continue;
                    }
                    docks.addVehicle(vehicle);
                }
                System.out.println("Truck registered at a bay!"); //add bayName for which bay
                spacing.print();

            } else if (input.equals("3")) {
                spacing.print();
                System.out.println("Goodbye!");
                Thread.sleep(1000);
                ending = false;

            } else {
                spacing.print();
                System.out.println("That's not an option!\n");
                Thread.sleep(2000);
            }
        }while (ending);
    }
}