public class MarsApplication {
  public static void main(String[] arguments) {
    MarsRobot spirit = new MarsRobot("exploring", 2, -60);
    spirit.showAttributes();
    System.out.println("Increasing speed to 3.");
    spirit.speed = 3;
    spirit.showAttributes();
    System.out.println("Chainging temperature to -90.");
    spirit.temperature = -90;
    spirit.showAttributes();
    System.out.println("Checking the temperature.");
    spirit.checkTemperature();
    spirit.showAttributes();
  } 
}
