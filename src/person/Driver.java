package person;

public class Driver extends Person{


    public Driver(String name) {
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
