package Strategies;

public class HelloEarthStrategy implements HelloUniverseStrategy {
    @Override
    public void sayHello() {
        System.out.println("Hello from Earth");
    }
}
