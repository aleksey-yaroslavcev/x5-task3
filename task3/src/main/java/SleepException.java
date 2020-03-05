/**
 * Класс исключений спящего человека
 */
public class SleepException extends RuntimeException {
    /**
     * конструктор
     * @param human экземпляр человека
     */
    public SleepException(Human human) {
        super(human.toString() + " спит и не может ничего делть в это момент");
    }
}
