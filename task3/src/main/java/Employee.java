public class Employee extends Human implements Workable {

    public Employee(String firstName, String secondName, int age) {
        super(firstName, secondName, age);
    }

    public void work() {
        if (isSleep()) {
            throw new SleepException(this);
        }
        System.out.println(toString() + " работает");
    }
}
