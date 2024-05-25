package sem2;

public class Main {
    public static void main(String[] args){
        Pair<Integer, String> person1 = new Pair<>(1, "Иванов Иван");
        Pair<Integer, String> person2 = new Pair<>(2, "Петров Петр");
        Pair<Integer, String> person3 = new Pair<>(3, "Викторов Виктор");
        System.out.println("\nСПИСОК СТУДЕНТОВ:");
        System.out.println(person1 + "\n" + person2 + "\n" + person3);
    }
}