package person;

public class Builder extends Person{
    public Builder(String name) {
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
