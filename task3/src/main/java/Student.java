public class Student extends Human implements BookReader, BookOwner {
    private Book book = null;
    private int readedBooks=0;
    private int readedPages=0;

    public Student(String firstName, String secondName, int age) {
        super(firstName, secondName, age);
    }

    public void addBook(Book book) {
        prepareAction();
        if(this.book!=null){
            throw new TakeBookException("у "+toString()+
                    " уже есть книга \""+
                    this.book.toString()+
                    "\" и он не может взять книгу \""+
                    book.toString()+
                    "\"");
        }
        this.book=book;
    }

    public Book giveBook(String bookName) {
        prepareAction();
        Book result=null;

        if(book==null){
            throw new TakeBookException("у "+toString()+" нет книг");
        }

        if(book.getName().equals(bookName)){
            result=book;
            book=null;
            return result;
        } else {
            throw new TakeBookException("у "+toString()+" нет книги с названием \""+
                    bookName+"\"");
        }
    }

    public void readBook(Book book) {
        prepareAction();
        readedBooks++;
        readedPages+=book.getPagesCount();
    }

    public int getReadedBooks() {
        prepareAction();
        return readedBooks;
    }

    public int getReadedPages() {
        prepareAction();
        return readedPages;
    }

    public void dropBook(){
        prepareAction();
        if(book==null){
            throw new TakeBookException(toString()+" не может выбросить книгу, так как у него их нет");
        }
        System.out.println(toString()+" выбросил книгу \""+book.toString()+"\"");
        book=null;
    }
}
