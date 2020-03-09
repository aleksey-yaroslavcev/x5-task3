/**
 * Класс книги
 */
public class Book {
    private final String name;
    private final String author;
    private final int pagesCount;

    /**
     * Конструктор
     * @param name       название книги
     * @param author     автор книги
     * @param pagesCount количество страниц
     */
    public Book(String name, String author, int pagesCount) {
        this.name = name;
        this.author = author;
        this.pagesCount = pagesCount;
    }

    /**
     * получить название книги
     *
     * @return название книги
     */
    public String getName() {
        return name;
    }

    /**
     * получить автора книги
     * @return автор книги
     */
    public String getAuthor() {
        return author;
    }

    /**
     * получить количество страниц
     *
     * @return количество страниц
     */
    public int getPagesCount() {
        return pagesCount;
    }

    /**
     * получить хэшкод
     *
     * @return хэшкод
     */
    @Override
    public int hashCode() {
        return toString().hashCode();
    }

    /**
     * метод сравнения книги с другим объектом
     *
     * @param obj любой объект
     * @return истина если сравниваемый объект таже самая книга
     */
    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != this.getClass()) {
            return false;
        }
        Book book = (Book) obj;
        return (author.equals(book.author)) &&
                (name.equals(book.name)) &&
                (pagesCount == book.pagesCount);
    }

    /**
     * метод преобразования объекта в строку
     * @return описание книги
     */
    @Override
    public String toString() {
        return "Книга '" + name + '\'' +
                ", автор '" + author + '\'' +
                ", страниц " + pagesCount;
    }
}
