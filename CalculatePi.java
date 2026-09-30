public class CalculatePi {

    public static void main(String[] args) {

        double pi = 0.0;
        int first = 0;

        System.out.println("Terms\t\tPi");

        for (int i = 0; i < 200000; i++) {

            if (i % 2 == 0) {
                pi += 4.0 / (2 * i + 1);
            } else {
                pi -= 4.0 / (2 * i + 1);
            }

            if (first == 0 && pi >= 3.14159) {
                first = i + 1;
            }
        }

        System.out.println("200000\t\t" + pi);
        System.out.println("First terms giving 3.14159: " + first);
    }
}
