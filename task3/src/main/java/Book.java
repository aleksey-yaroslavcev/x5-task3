public class Book {
    private final String name;
    private final String author;
    private final int pagesCount;

    public Book(String name, String author, int pagesCount) {
        this.name = name;
        this.author = author;
        this.pagesCount = pagesCount;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public int getPagesCount() {
        return pagesCount;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Book){
            Book book=(Book)obj;
            return (author.equals(book.author))&&
                    (name.equals(book.name))&&
                    (pagesCount==book.pagesCount);
        }
        return false;
    }

    @Override
    public String toString() {
        return "Книга '" + name + '\'' +
                ", автор '" + author + '\'' +
                ", страниц " + pagesCount;
    }
}
