/**
 * Класс исключений спящего человека
 */
public class SleepException extends RuntimeException {
    /**
     * конструктор с сообщением
     *
     * @param human   экземпляр человека
     * @param message сообщение
     */
    public SleepException(Human human, String message) {
        super(human.toString() + ' ' + message);
    }

    /**
     * конструктор
     *
     * @param human экземпляр человека
     */
    public SleepException(Human human) {
        super(human.toString() + " спит и не может ничего делать");
    }
}
