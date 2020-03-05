/**
 * Класс тестера
 */
public class Tester extends Employee {

    /**
     * конструктор
     * @param firstName  имя
     * @param secondName фамилия
     * @param age        возраст
     */
    public Tester(String firstName, String secondName, int age) {
        super(firstName, secondName, age);
    }

    /**
     * метод выполнения работы
     */
    @Override
    public void work() {
        if (isSleep()) {
            throw new SleepException(this);
        }
        System.out.println(toString() + " тестирует программу");
    }
}
