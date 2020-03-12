/**
 * Класс студента
 */
public class Student extends Human implements BookReader, BookOwner {
    private Book book = null;
    private int readBooks = 0;
    private int readPages = 0;

    /**
     * Конструктор
     *
     * @param firstName  имя
     * @param secondName фамилия
     * @param age        возраст
     */
    public Student(String firstName, String secondName, int age) {
        super(firstName, secondName, age);
    }

    /**
     * конструктор из базового класса
     * @param human экземпляр человека
     */
    public Student(Human human){
        super(human);
    }
    /**
     * {@inheritDoc}
     */
    @Override
    public void addBook(Book book) {
        if (isSleep()) {
            throw new SleepException(this);
        }

        if (this.book != null) {
            throw new TakeBookException("у " + toString() +
                    " уже есть книга \"" +
                    this.book.toString() +
                    "\" и он не может взять книгу \"" +
                    book.toString() +
                    "\"");
        }
        this.book = book;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Book giveBook(String bookName) {
        if (isSleep()) {
            throw new SleepException(this);
        }

        Book result = null;

        if (book == null) {
            throw new TakeBookException("у " + toString() + " нет книг");
        }

        if (book.getName().equals(bookName)) {
            result = book;
            book = null;
            return result;
        } else {
            throw new TakeBookException("у " + toString() + " нет книги с названием \"" +
                    bookName + "\"");
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void readBook(Book book) {
        if (isSleep()) {
            throw new SleepException(this);
        }

        readBooks++;
        readPages += book.getPagesCount();
    }

    /**
     * получить количество прочтённых книг
     * @return количество прочтённых книг
     */
    public int getReadBooks() {
        if (isSleep()) {
            throw new SleepException(this);
        }

        return readBooks;
    }

    /**
     * получить количество прочтённых страниц
     * @return количество прочтённых страниц
     */
    public int getReadPages() {
        if (isSleep()) {
            throw new SleepException(this);
        }

        return readPages;
    }

    /**
     * метод выбрасывания книги
     */
    public void dropBook() {
        if (isSleep()) {
            throw new SleepException(this);
        }

        if (book == null) {
            throw new TakeBookException(toString() + " не может выбросить книгу, так как у него их нет");
        }
        System.out.println(toString() + " выбросил книгу \"" + book.toString() + "\"");
        book = null;
    }
}
