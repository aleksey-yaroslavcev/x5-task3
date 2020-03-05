/**
 * Класс разработчика
 */
public class Developer extends Employee {

    /**
     * Конструктор
     * @param firstName имя
     * @param secondName фамилия
     * @param age возраст
     */
    public Developer(String firstName, String secondName, int age) {
        super(firstName, secondName, age);
    }

    /**
     * метод выолнения работы
     */
    @Override
    public void work() {
        if (isSleep()) {
            throw new SleepException(this);
        }
        System.out.println(toString() + " пишет код");
    }
}
