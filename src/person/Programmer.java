package person;

public class Programmer extends Person{
    public Programmer(String name) {
        super(name);
    }

    @Override
    public void working() {
        System.out.println(getName()+" is working");
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
