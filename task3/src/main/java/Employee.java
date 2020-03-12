/**
 * Класс служащего
 */
public class Employee extends Human implements Workable {

    /**
     * Конструктор
     *
     * @param firstName  имя
     * @param secondName фамилия
     * @param age        возраст
     */
    public Employee(String firstName, String secondName, int age) {
        super(firstName, secondName, age);
    }

    /**
     * Конструктор из базового объекта
     * @param human экземпляр человека
     */
    public Employee(Human human){
        super(human.getFirstName(),human.getSecondName(),human.getAge());
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void work() {
        if (isSleep()) {
            throw new SleepException(this);
        }
        System.out.println(toString() + " работает");
    }
}
