public class Manager extends Employee {
    public Manager(String firstName, String secondName, int age) {
        super(firstName, secondName, age);
    }

    @Override
    public void work() {
        if (isSleep()) {
            throw new SleepException(this);
        }
        System.out.println(toString() + " составляет отчёт");
    }
}
