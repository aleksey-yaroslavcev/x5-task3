import java.util.ArrayList;

/**
 * Класс библиотеки
 */
public class Library implements BookOwner {
    private ArrayList<Book> books = new ArrayList<>();

    /**
     * {@inheritDoc}
     */
    @Override
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
     * {@inheritDoc}
     */
    @Override
    public Book giveBook(String bookName) {
        Book foundBook = null;
        for (Book book : books) {
            if (book.getName().equals(bookName)) {
                foundBook = book;
            }
        }
        if (foundBook != null) {
            books.remove(foundBook);
            return foundBook;
        } else {
            throw new TakeBookException("В библиотеке нет книги - " + bookName);
        }
    }

    /**
     * геттер колечества книг в библиотеке
     * @return количество книг
     */
    public int getSize() {
        return books.size();
    }
}
