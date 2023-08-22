package koschei.models;

import org.springframework.stereotype.Component;

@Component
public class Rabbit4 {
    private final Duck5 duck;

    public Rabbit4(Duck5 duck5) {
        this.duck = duck5;
    }

    @Override
    public String toString() {
        return ", в зайце утка " + duck.toString();
    }
}
