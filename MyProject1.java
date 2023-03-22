package int103.myproject1;

public class MyProject1 {

    public static void main(String[] args) {
        pyramid(50);
    }

    public static void pyramid(int rows) {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < rows - i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
