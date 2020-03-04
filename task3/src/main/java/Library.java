import java.util.ArrayList;

public class Library implements BookOwner {
    private ArrayList<Book> books = new ArrayList<Book>();

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

    public Book giveBook(String bookName) {
        for (Book book : books) {
            if (book.getName().equals(bookName)) {
                books.remove(book);
                return book;
            }
        }
        throw new TakeBookException("В библиотеке нет книги - " + bookName);
    }

    public int getSize() {
        return books.size();
    }
}
