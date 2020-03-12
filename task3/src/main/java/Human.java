/**
 * Абстрактный класс человека
 */
abstract public class Human {
    private final String firstName;
    private final String secondName;
    private final int age;
    private boolean isSleep = false;

    /**
     * Конструктор
     * @param firstName  имя
     * @param secondName фамилия
     * @param age        возраст
     */
    public Human(String firstName, String secondName, int age) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.age = age;
    }

    /**
     * Конструктор копий
     * @param human экземпляр человека
     */
    public Human(Human human){
        firstName = human.firstName;
        secondName = human.secondName;
        age = human.age;
        isSleep = human.isSleep;
    }

    /**
     * получить имя
     * @return имя
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * получить фамилию
     * @return фамилия
     */
    public String getSecondName() {
        return secondName;
    }

    /**
     * получить возраст
     * @return возраст
     */
    public int getAge() {
        return age;
    }

    /**
     * Получить состояние сна
     *
     * @return истина, если человек спит
     */
    public boolean isSleep() {
        return isSleep;
    }

    /**
     * метод погружения человека в сон
     */
    public void sleep() {
        if (isSleep) {
            throw new SleepException(this);
        }
        isSleep = true;
        System.out.println(toString() + " пошёл спать");
    }

    /**
     * метод просыпания человека
     */
    public void wakeUp() {
        if (!isSleep) {
            throw new SleepException(this, "не может проснуться, так как не спит");
        }
        isSleep = false;
        System.out.println(toString() + " проснулся");
    }

    /**
     * метод представления человека
     */
    public void introduce() {
        System.out.println("Привет! Меня зовут " + toString() + " и мне " + age + " лет.");
    }

    /**
     * метод преобразования человека в строку
     * @return имя и фамилия человека
     */
    @Override
    public String toString() {
        return firstName + ' ' + secondName;
    }
}
