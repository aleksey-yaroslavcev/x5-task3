import org.junit.Test;
import static org.assertj.core.api.Assertions.*;

import static org.junit.Assert.*;

public class EmployeeTest {

    private Employee employee1;
    private Employee employee2;
    private Employee employee3;
    private Library library;
    private Student student;
    private Book book1;
    private Book book2;
    private Book book3;
    private Book book4;
    private Book book5;
    private Book book6;

    public EmployeeTest(){
        employee1 = new Tester("Ivan","Ivanov",12);
        employee2 = new Developer("Petr","Petrov",234);
        employee3 = new Manager("Vasiliy","Vasilyev",234);

        book1=new Book("Колобок", "Достоевский", 100);
        book2=new Book("Красная шапочка", "Достоевский", 100);
        book3=new Book("Золотой ключик", "Достоевский", 100);
        book4=new Book("Чебурашка", "Достоевский", 100);
        book5=new Book("Теремок", "Достоевский", 100);
        book6=new Book("Java для чайников", "Достоевский", 100);

        library=new Library();
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        library.addBook(book4);
        library.addBook(book5);

        student=new Student("Sergey","Sergeev",43);
    }

    @Test
    public void employeeTest(){
        assertEquals("Ivan Ivanov",employee1.toString());
        assertEquals("Petr Petrov", employee2.toString());
        assertEquals("Vasiliy Vasilyev", employee3.toString());
    }

    @Test(expected = SleepException.class)
    public void sleepExceptionTest1(){
        employee1.sleep();
        employee1.work();
    }
    @Test(expected = SleepException.class)
    public void sleepExceptionTest2(){
        employee1.sleep();
        employee1.wakeUp();
        employee1.wakeUp();
    }

    @Test(expected = TakeBookException.class)
    public void takeBookExceptionTest1(){
        library.addBook(book6);
    }

    @Test(expected = TakeBookException.class)
    public void takeBookExceptionTest2(){
        student.addBook(book1);
        student.addBook(book2);
    }

    @Test(expected = TakeBookException.class)
    public void takeBookExceptionTest3(){
        library.giveBook("Архитектура ЭВМ");
    }

    @Test
    public void libraryBookCountTest(){
        assertEquals(5,library.getSize());
    }

    @Test
    public void readBookAndPagesTest(){
        int readBooksBefore=student.getReadBooks();
        int readPagesBefore=student.getReadPages();

        student.readBook(book3);
        assertEquals(readPagesBefore+book3.getPagesCount(), student.getReadPages());
        assertEquals(readBooksBefore+1, student.getReadBooks());
    }

    @Test
    public void assertJTest1(){
        assertThat(student).isNotEqualTo(employee1);
    }

    @Test
    public void assertJTest2(){
        Throwable thrown = catchThrowable( () -> {
            student.dropBook();
            student.dropBook();
        });

        assertThat(thrown).isInstanceOf(TakeBookException.class);
    }
}