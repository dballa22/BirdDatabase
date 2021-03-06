/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Drew
 */
public class Bird {
    
    private String name;
    private String latinName;
    private int count;
    
    public Bird(String name, String latinName) {
        this.name = name;
        this.latinName = latinName;
        this.count = 0;
    }

    public String getName() {
        return name;
    }

    public String getLatinName() {
        return latinName;
    }

    public int getCount() {
        return count;
    }
    
    public void observation() {
        this.count++;
    }
    
    @Override
    public String toString() {
        if (this.count == 1) {
            return this.name + " (" + this.latinName + "): " + this.count + " observation";
        }
        return this.name + " (" + this.latinName + "): " + this.count + " observations";
    }
    
}
