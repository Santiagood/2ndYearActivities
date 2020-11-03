package sept17;

public class Shihtzu extends Dog{
    private String Fur;
    
    //shihtzu constructor
    public Shihtzu(String Fur, int age, String color, char bodysize, int bodyweight, String gender, boolean isRunning) {
        super(age, color, bodysize, bodyweight, gender, isRunning);
        this.Fur = Fur;
    }
    
        @Override
    public void showInfo() {
        System.out.println("**********************");
        System.out.println("Shihtzu's age: " + this.Age);
        System.out.println("Shihtzu's color: " + this.Color);
        System.out.println("Shihtzu's body size: " + this.BodySize);
        System.out.println("Shihtzu's body weight: " + this.BodyWeight);
        System.out.println("Shihtzu's gender: " + this.Gender);
        System.out.println("Shihtzu's Fur: " + this.Fur);
        System.out.println("**********************");
    }
}
