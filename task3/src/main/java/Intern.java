public class Intern extends Student implements Workable {
    public Intern(String firstName, String secondName, int age) {
        super(firstName, secondName, age);
    }

    public void work() {
        try {
            prepareAction();
            System.out.println(toString()+" ничего не любит делать");
        } catch (RuntimeException e){
            System.out.println(e.getMessage());
        }
    }
}
