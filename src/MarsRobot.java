import com.java21days.InstanceCounter;
public class MarsRobot extends InstanceCounter {
  String status;
  int speed;
  float temperature;

  MarsRobot(String status, int speed, float temperature) {
    super();
    this.status = status;
    this.speed = speed;
    this.temperature = temperature; 
  }
  
  void checkTemperature() {
    if (temperature < -80) {
      status = "returning home";
      speed = 5;
    }
  }

  void showAttributes() {
    System.out.println("Status: " + status);
    System.out.println("Speed: " + speed);
    System.out.println("Temperature: " + temperature);
  }
}
