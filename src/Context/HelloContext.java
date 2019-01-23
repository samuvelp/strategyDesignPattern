package Context;

import Strategies.HelloUniverseStrategy;

public class HelloContext {
    HelloUniverseStrategy helloUniverseStrategy;

    public HelloContext(HelloUniverseStrategy helloUniverseStrategy) {
        this.helloUniverseStrategy = helloUniverseStrategy;
    }

    public void sayHello() {
        helloUniverseStrategy.sayHello();
    }
}
