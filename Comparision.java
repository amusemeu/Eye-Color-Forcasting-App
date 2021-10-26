import java.util.Random;
import java.util.concurrent.TimeUnit;

public class Comparision {
    Random rnd = new Random();
    public static String e;
    public static String[] colors = {"Green", "Blue", "Brown"};

    public void compare(Person person1, Person person2) throws InterruptedException {

        if (person1.getEyeColor().equalsIgnoreCase(colors[0]) && person2.getEyeColor().equalsIgnoreCase(colors[0])) { // Зеленые - Зеленые (GREEN - GREEN)
            double x = rnd.nextInt(100);
            if (x <= 1) {
                e = colors[2];
            } else if (x > 1 && x < 25) {
                e = colors[1];
            } else if (x > 25 && x <= 100) {
                e = colors[0];
            }
        }
        if (person1.getEyeColor().equalsIgnoreCase(colors[2]) && person2.getEyeColor().equalsIgnoreCase(colors[2])) { //Карие - Карие (Brown - Brown)
            double x = rnd.nextInt(100);
            if (x <= 6.25) {
                e = colors[1];
            } else if (x > 6.25 && x <= 18.75) {
                e = colors[0];
            } else if (x > 18.75 && x <= 100) {
                e = colors[2];
            }
        }
        if ((person1.getEyeColor().equalsIgnoreCase(colors[0]) && person2.getEyeColor().equalsIgnoreCase(colors[2])) ||
                (person2.getEyeColor().equalsIgnoreCase(colors[0]) && person1.getEyeColor().equalsIgnoreCase(colors[2]))) { // Зеленые - Карие (Green - Brown)
            double x = rnd.nextInt(100);
            if (x <= 12.5) {
                e = colors[1];
            } else if (x > 12.5 && x <= 37.5) {
                e = colors[0];
            } else if (x > 37.5 && x <= 100) {
                e = colors[2];
            }
        }
        if ((person1.getEyeColor().equalsIgnoreCase(colors[1]) && person2.getEyeColor().equalsIgnoreCase(colors[2])) ||
                (person2.getEyeColor().equalsIgnoreCase(colors[1]) && person1.getEyeColor().equalsIgnoreCase(colors[2]))) { // голубые - карие (Blue - Brown)
            double x = rnd.nextInt(100);
            if (x < 50) {
                e = colors[1];
            } else if (x > 50) {
                e = colors[2];
            }
        }
        if ((person1.getEyeColor().equalsIgnoreCase(colors[0]) && person2.getEyeColor().equalsIgnoreCase(colors[1])) ||
                (person2.getEyeColor().equalsIgnoreCase(colors[0]) && person1.getEyeColor().equalsIgnoreCase(colors[1]))) { // Зеленые - Голубые (Green - Blue)
            double x = rnd.nextInt(100);
            if (x < 50) {
                e = colors[0];
            } else if (x > 50) {
                e = colors[1];
            }
        }
        if (person1.getEyeColor().equalsIgnoreCase(colors[1]) && person2.getEyeColor().equalsIgnoreCase(colors[1])) { // голубые - голубые (Blue - Blue)
            double x = rnd.nextInt(100);
            if (x <= 1) {
                e = colors[0];
            } else if (x > 1) {
                e = colors[1];
            }
        }
        if (e == null) {
            System.err.println("Enter admissible values");
        } else {

            System.out.println("Eye color of a kid is:");
            TimeUnit.SECONDS.sleep(1);
            System.out.println(e);
        }
    }
}

