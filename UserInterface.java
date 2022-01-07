
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Drew
 */
public class UserInterface {

    private Scanner scanner;
    private BirdWatcher birdWatcher;

    public UserInterface(Scanner scanner, BirdWatcher birdWatcher) {
        this.scanner = scanner;
        this.birdWatcher = birdWatcher;
    }

    public void start() {

        while (true) {
            System.out.println("Add: Adds bird to the database.");
            System.out.println("Observation: Add an observation to a bird.");
            System.out.println("Print all: Prints every bird in the database.");
            System.out.println("Print one: Prints a specific bird.");
            System.out.println("Quit: Quits the program.");
            String command = scanner.nextLine();
            if (command.equalsIgnoreCase("quit")) {
                break;
            }
            processCommand(command, scanner);
        }
    }
    

    public void processCommand(String command, Scanner scanner) {
        if (command.equalsIgnoreCase("Add")) {
            addBird(scanner);
        } else if (command.equalsIgnoreCase("Observation")) {
            addObservation(scanner);
        } else if (command.equalsIgnoreCase("Print all")) {
            printAllBirds();
        } else if (command.equalsIgnoreCase("Print one")) {
            printOneBird(scanner);
        } else {
            System.out.println("Not a valid command.");
        }
    }



public void addBird(Scanner scanner) {
        System.out.println("Name of bird?");
        String name = scanner.nextLine();
        System.out.println("Name in latin?");
        String latin = scanner.nextLine();
        this.birdWatcher.add(name, latin);
    }
    
    public void addObservation(Scanner scanner) {
        System.out.println("Name of bird observed?");
        String name = scanner.nextLine();
        this.birdWatcher.addOberservation(name);
    }
    
    public void printAllBirds() {
        this.birdWatcher.printAll();
    }
    
    public void printOneBird(Scanner scanner) {
        System.out.println("Print which bird?");
        String birdName = scanner.nextLine();
        this.birdWatcher.printOneBird(birdName);
    }
    
}
