/**
 * главный класс программы
 */
public class Main {
    /**
     * точка входа в программу
     * @param args аргументы командной строки
     */
    public static void main(String[] args) {

        Human human = new Student("Ivan", "Ivanov", 20);
        human.sleep();
        human.wakeUp();

        BookOwner library = new Library();
        library.addBook(new Book("Красная шапочка", "Пушкин", 10));
        library.addBook(new Book("Красная шапочка2", "Пушкин", 12));
        library.addBook(new Book("Красная шапочка3", "Пушкин", 14));

        Student student = (Student) human;
        Book book = library.giveBook("Красная шапочка");
        student.addBook(book);
        student.readBook(book);
        library.addBook(student.giveBook(book.getName()));

        book = library.giveBook("Красная шапочка2");
        student.addBook(book);
        student.readBook(book);
        student.dropBook();

        System.out.println("В библиотеке осталось " + ((Library) library).getSize() + " книг");

        Workable worker = new Tester("Petr", "Petrov", 30);
        worker.work();
        student = new Intern("Nikolay", "Nikolaev", 34);
        worker = (Workable) student;
        worker.work();
    }
}
