abstract public class Human {
    private final String firstName;
    private final String secondName;
    private final int age;
    private boolean isSleeping=false;

    public Human(final String firstName, final String secondName, final int age){
        this.firstName=firstName;
        this.secondName=secondName;
        this.age=age;
    }

    protected void prepareAction(){
        if(isSleeping){
            throw new SleepException(this);
        }
    }

    public boolean isSleep(){
        return isSleeping;
    }

    public void sleep(){
        if(isSleeping){
            throw new SleepException(this);
        }
        isSleeping=true;
        System.out.println(toString()+" пошёл спать");
    }

    public void wakeUp(){
        if(!isSleeping){
            throw new SleepException(this);
        }
        isSleeping=false;
        System.out.println(toString()+" проснулся");
    }
    public void introduce(){
        System.out.println("Привет! Меня зовут " + toString() + " и мне "+age+" лет.");
    }

    @Override
    public String toString() {
        return firstName + ' ' + secondName;
    }
}
