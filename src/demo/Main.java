package demo;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        //TheOneAndOnly only = new TheOneAndOnly("Kresten");
        //TheOneAndOnly only2 = new TheOneAndOnly("Hans Henrik");
        TheOneAndOnly myPerson = TheOneAndOnly.getInstance();
        myPerson.setName("Kresten");
        //System.out.println(myPerson.getName());
        myPerson = TheOneAndOnly.getInstance();
        myPerson.setName("Hans Henrik");
        //System.out.println(myPerson.getName());
        myPerson.doSomeThing();
        Person stranger = new Person();
        stranger.doSomeThing();
        if (stranger instanceof Person) {
            ((Person) stranger).doNoThing();
        }

        ArrayList<Action> elements = new ArrayList<>();
        elements.add(myPerson);
        elements.add(stranger);

        for (Action action : elements) {
            action.doSomeThing(); //polymorfi
        }
    }
}
