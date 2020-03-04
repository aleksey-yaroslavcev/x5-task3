public class Developer extends Employee {
    public Developer(String firstName, String secondName, int age) {
        super(firstName, secondName, age);
    }

    @Override
    public void work() {
        if (isSleep()) {
            throw new SleepException(this);
        }
        System.out.println(toString() + " пишет код");
    }
}
