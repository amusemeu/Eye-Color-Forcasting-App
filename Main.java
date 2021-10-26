import java.util.Scanner;

class Main {
    public static void main(String[] args) throws InterruptedException {

    Scanner sc = new Scanner(System.in);
        System.out.println("Enter parent's eye color" + " (eye colour can be Green, Brown or Blue):");

        Person person1 = new Person(sc.nextLine());
        Person person2 = new Person(sc.nextLine());

    Comparision cmp = new Comparision();
        cmp.compare(person1, person2);
    }
}