package sept17;

public class Pitbull extends Dog{
    
    private String jawSize;
    
    //pitbull constructor
    public Pitbull(String jawSize, int age, String color, char bodysize, int bodyweight, String gender, boolean isRunning) {
        super(age, color, bodysize, bodyweight, gender, isRunning);
        this.jawSize = jawSize;
    }
    
    //method
    @Override
    public void showInfo() {
        int accelaration;
        System.out.println("**********************");
        System.out.println("Pitbull's age: " + this.Age);
        System.out.println("Pitbull's color: " + this.Color);
        System.out.println("Pitbull's body size: " + this.BodySize);
        System.out.println("Pitbull's body weight: " + this.BodyWeight);
        System.out.println("Pitbull's gender: " + this.Gender);
        System.out.println("Pitbull's Jawsize: " + this.jawSize);
        if (this.isRunning == true) {
            System.out.println("Enter accelaration: ");
            accelaration = scan.nextInt();
            System.out.println("Pitbull's bite force: " + this.BiteForce(accelaration));
        }
        else {
            System.out.println("Pitbull's bite force: " + this.BiteForce(0));
        }
        System.out.println("**********************");
    }
    
}
