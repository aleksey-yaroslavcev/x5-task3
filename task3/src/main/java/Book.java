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
     * геттер названия книги
     * @return название книги
     */
    public String getName() {
        return name;
    }

    /**
     * геттер автора книги
     * @return автор книги
     */
    public String getAuthor() {
        return author;
    }

    /**
     * геттер количества страниц
     * @return количество страниц
     */
    public int getPagesCount() {
        return pagesCount;
    }

    /**
     * метод сравнения книги с другим объектом
     * @param obj любой объект
     * @return истина если сравниваемый объект таже самая книга
     */
    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Book) {
            Book book = (Book) obj;
            return (author.equals(book.author)) &&
                    (name.equals(book.name)) &&
                    (pagesCount == book.pagesCount);
        }
        return false;
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
