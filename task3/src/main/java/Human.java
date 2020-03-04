abstract public class Human {
    private final String firstName;
    private final String secondName;
    private final int age;
    private boolean isSleep = false;

    public Human(final String firstName, final String secondName, final int age) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.age = age;
    }

    public boolean isSleep() {
        return isSleep;
    }

    public void sleep() {
        if (isSleep) {
            throw new SleepException(this);
        }
        isSleep = true;
        System.out.println(toString() + " пошёл спать");
    }

    public void wakeUp() {
        if (!isSleep) {
            throw new SleepException(this);
        }
        isSleep = false;
        System.out.println(toString() + " проснулся");
    }

    public void introduce() {
        System.out.println("Привет! Меня зовут " + toString() + " и мне " + age + " лет.");
    }

    @Override
    public String toString() {
        return firstName + ' ' + secondName;
    }
}
