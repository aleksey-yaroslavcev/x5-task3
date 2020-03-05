/**
 * Класс исключения передачи книги
 */
public class TakeBookException extends RuntimeException {
    /**
     * конструктор
     * @param msg сообщение
     */
    public TakeBookException(String msg) {
        super(msg);
    }
}
