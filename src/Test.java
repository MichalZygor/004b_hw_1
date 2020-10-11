import java.sql.Time;

public class Test {
    public static void main(String[] args) {
        Person person = new Person("John", "Kowalski", 20, "Wrocław");
        TimeMachine timeMachine = new TimeMachine();
        System.out.println("Wiek osoby: " + person.age);
        timeMachine.backInTime(person);
        timeMachine.backInTime(person);
        timeMachine.backInTime(person);
        System.out.println("Wiek osoby: " + person.age);
        timeMachine.timeTravel(person, 3);
        System.out.println("Wiek osoby: " + person.age);
    }
}
