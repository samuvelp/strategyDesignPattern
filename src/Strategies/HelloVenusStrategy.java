package Strategies;

public class HelloVenusStrategy implements HelloUniverseStrategy {
    @Override
    public void sayHello() {
        System.out.println("Hello from Venus");
    }
}
