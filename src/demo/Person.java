package demo;

public class Person implements Action {

    @Override
    public void doSomeThing() {
        System.out.println("I'm a friend that you have not met");
    }

    public void doNoThing() {
        System.out.println("I dont' even notive you");
    }
}
