package main.clients;

public class Bird implements Goable, Flyable {
    @Override
    public void fly() {
        System.out.println("Птица летает!");
    }

    @Override
    public void go() {
        System.out.println("Птица ходит!");
    }
}
