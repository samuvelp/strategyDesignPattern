package Client;

import Context.HelloContext;
import Strategies.HelloEarthStrategy;
import Strategies.HelloVenusStrategy;

import java.util.Scanner;

public class HelloClient {

    public static void main(String[] args) {
        String code = "";
        Scanner scanner = new Scanner(System.in);
        code = scanner.next();
        switch (code) {
            case "earth":
                HelloContext earthStrategy = new HelloContext(new HelloEarthStrategy());
                earthStrategy.sayHello();
                break;
            case "venus":
                HelloContext venusStrategy = new HelloContext(new HelloVenusStrategy());
                venusStrategy.sayHello();
                break;
            default:
                System.out.println("I'm alien");

        }
    }


}
