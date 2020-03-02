public class Employee extends Human implements Workable {

    protected String action=" работает";
    public Employee(String firstName, String secondName, int age) {
        super(firstName, secondName, age);
    }

    public void work() {
        try {
            prepareAction();
            System.out.println(toString()+ action);
        } catch (RuntimeException e){
            System.out.println(e.getMessage());
        }
    }
}
