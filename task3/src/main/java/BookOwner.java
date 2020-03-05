/**
 * Интерфейс владельца книги
 */
public interface BookOwner {
    /**
     * метод добавления книги владельцу
     * @param book книга
     */
    void addBook(Book book);

    /**
     * метод передачи книги
     * @param bookName название книги
     * @return экземпляр книги
     */
    Book giveBook(String bookName);
}
