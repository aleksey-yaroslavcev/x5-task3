/**
 * Класс интерна
 */
public class Intern extends Student implements Workable {
    /**
     * конструктор
     *
     * @param firstName  имя
     * @param secondName фамилия
     * @param age        возраст
     */
    public Intern(String firstName, String secondName, int age) {
        super(firstName, secondName, age);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void work() {
        if (isSleep()) {
            throw new SleepException(this);
        }
        System.out.println(toString() + " ничего не любит делать");
    }
}
