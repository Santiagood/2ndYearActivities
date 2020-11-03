package sept17;
import java.util.Scanner;

public class Sept17 {

    static Scanner scan = new Scanner(System.in);
    
    public static void main(String[] args) {
        
        Dog browny = new Pitbull("Large", 2, "brown", 'L', 100, "Male", true);
        Dog blacky = new Shihtzu("Long Hair", 5, "white", 'S', 25, "Female", false);
        Dog dog = new Dog(2, "brown", 'L', 100, "Male", true);
        
        browny.showInfo();
        blacky.showInfo();
        dog.showInfo();
    }
}
