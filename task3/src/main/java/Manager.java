/**
 * Класс менеджера
 */
public class Manager extends Employee {
    /**
     * Конструктор
     * @param firstName  имя
     * @param secondName фамилия
     * @param age        возраст
     */
    public Manager(String firstName, String secondName, int age) {
        super(firstName, secondName, age);
    }

    /**
     * конструктор из базового класса
     * @param human экземпляр человека
     */
    public Manager(Human human){
        super(human);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void work() {
        if (isSleep()) {
            throw new SleepException(this);
        }
        System.out.println(toString() + " составляет отчёт");
    }
}
