import java.util.concurrent.ThreadLocalRandom;

// min inclusive, max exclusive
public class Rng {

    public static int getInt(int min, int max) {
        return ThreadLocalRandom.current().nextInt(min, max);
    }

    public static double getDouble(double min, double max) {
        return ThreadLocalRandom.current().nextDouble(min, max);
    }

    public static boolean getBoolean() {
        return ThreadLocalRandom.current().nextBoolean();
    }
}