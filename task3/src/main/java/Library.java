import java.util.ArrayList;

/**
 * Класс библиотеки
 */
public class Library implements BookOwner {
    private ArrayList<Book> books = new ArrayList<Book>();

    /**
     * метод добавления книги в библиотеку
     * @param book книга
     */
    public void addBook(Book book) {
        if (books.contains(book)) {
            System.out.println("В библиотеке уже есть книга - " + book.toString());
        } else {
            if (books.size() == 5) {
                throw new TakeBookException("В библиотеке не может быть больше 5 книг");
            } else {
                books.add(book);
            }
        }
    }

    /**
     * метод получения книги из библиотеки
     * @param bookName название книги
     * @return экземпляр книги
     */
    public Book giveBook(String bookName) {
        for (Book book : books) {
            if (book.getName().equals(bookName)) {
                books.remove(book);
                return book;
            }
        }
        throw new TakeBookException("В библиотеке нет книги - " + bookName);
    }

    /**
     * геттер колечества книг в библиотеке
     * @return количество книг
     */
    public int getSize() {
        return books.size();
    }
}
