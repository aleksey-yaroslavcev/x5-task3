public class SleepException extends RuntimeException {
    public SleepException(Human human) {
        super(human.toString() + " спит и не может ничего делть в это момент");
    }
}
