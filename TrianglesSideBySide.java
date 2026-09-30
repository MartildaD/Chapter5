public class TrianglesSideBySide {
    public static void main(String[] args) {

        int size = 10;

        for (int row = 1; row <= size; row++) {
    for (int column = 1; column <= row; column++) {
                System.out.print("*");
            }

            for (int space = row; space <= size; space++) {
                System.out.print(" ");
            }

       
            for (int column = row; column <= size; column++) {
                System.out.print("*");
            }

            for (int space = row; space <= size; space++) {
                System.out.print(" ");
            }

         
            for (int column = 1; column <= size - row + 1; column++) {
                System.out.print("*");
            }

     
            for (int space = 1; space <= row; space++) {
                System.out.print(" ");
            }

            for (int column = 1; column <= row; column++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
