public class Intern extends Student implements Workable {
    public Intern(String firstName, String secondName, int age) {
        super(firstName, secondName, age);
    }

    public void work() {
        if (isSleep()) {
            throw new SleepException(this);
        }
        System.out.println(toString() + " ничего не любит делать");
    }
}
