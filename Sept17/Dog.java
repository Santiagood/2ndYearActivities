package sept17;
import java.util.Scanner;

public class Dog {
    
    static Scanner scan = new Scanner(System.in);
    
    //constant value variables/ final
    final int MAXPOWER = 25;
    final int MINPOWER = 6;
    
    //attributes of a Dog
    protected int Age;
    protected String Color;
    protected char BodySize;
    protected int BodyWeight;
    protected String Gender;
    protected boolean isRunning = false;
    
    //constructor of a Dog
    public Dog(int age, String color, char bodysize, int bodyweight, String gender, boolean isRunning) {
        this.Age = age;
        this.Color = color;
        this.BodySize = bodysize;
        this.BodyWeight = bodyweight;
        this.Gender = gender;
        this.isRunning = isRunning;
    }
    
    //methods
    public void showInfo() {
        int accelaration;
        System.out.println("**********************");
        System.out.println("Dog's age: " + this.Age);
        System.out.println("Dog's color: " + this.Color);
        System.out.println("Dog's body size: " + this.BodySize);
        System.out.println("Dog's body weight: " + this.BodyWeight);
        System.out.println("Dog's gender: " + this.Gender);
        if (this.isRunning == true) {
            System.out.println("Enter accelaration: ");
            accelaration = scan.nextInt();
            System.out.println("Dog's bite force: " + this.BiteForce(accelaration));
        }
        else {
            System.out.println("Dog's bite force: " + this.BiteForce(0));
        }
        System.out.println("**********************");
    }
    
    private int Bite() {
        switch(this.BodySize) {
            case 'L' -> {
                return this.BodyWeight * MAXPOWER;
            }
            case 'M' -> {
                return this.BodyWeight * (MAXPOWER - 12);
            }
            case 'S' -> {
                return this.BodyWeight * MINPOWER;
            }
            default -> {
                return 0;
            }
        }
    }
    
    public int BiteForce(int accelaration) {
        return accelaration * Bite();
    } 
}
