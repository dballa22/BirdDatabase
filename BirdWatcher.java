
import java.util.ArrayList;
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
public class BirdWatcher {  
    
    private ArrayList<Bird> birdDatabase;
    private Scanner scanner;
    
    public BirdWatcher() {
        this.birdDatabase = new ArrayList<>();
        this.scanner = new Scanner(System.in);
    }
    
    public void addWithOnlyLatin(String latin) {
        System.out.println("What is the english name?");
        String english = scanner.nextLine();
        Bird bird = new Bird(english, latin);
        this.birdDatabase.add(bird);
    }
    
    public void addWithOnlyEnglish(String name) {
        System.out.println("What is the latin name?");
        String latin = scanner.nextLine();
        Bird bird = new Bird(name, latin);
        this.birdDatabase.add(bird);
    }
    
    public void add(String name, String latinName) {
        Bird bird = new Bird(name, latinName);
        this.birdDatabase.add(bird);
    }
    
    public void addOberservation(String name) {
        for (Bird bird : birdDatabase) {
            if (bird.getName().equals(name)) {
                bird.observation();
                return;
            }
        }
        System.out.println("Not a bird!");
    }
    
    public void printAll() {
        for (Bird bird : birdDatabase) {
            System.out.println(bird.toString());
        }
    }
    
    public void printOneBird(String name) {
        for (Bird bird : birdDatabase) {
            if (bird.getName().equals(name)) {
                System.out.println(bird.toString());
                return;
            }
        }
        System.out.println("Not a bird!");
    }
}
