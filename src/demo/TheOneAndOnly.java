package demo;

//Singleton implementering
public class TheOneAndOnly implements Action{

    private String name;
    private static TheOneAndOnly only = null;

    private TheOneAndOnly() {
    }

    public static TheOneAndOnly getInstance() {
        if (only == null) {
            only = new TheOneAndOnly();
        }
        return only;

        /*if (only != null) {
            return only;
        }
        else {
            only = new TheOneAndOnly();
            return only;
        }*/

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void doSomeThing() {
        System.out.println("I love you");
    }
}
