package level1;

public class HalfTrianglePattern {
    public static void main(String[] args) {
        int height = 5; // Adjust the height as needed
        
        for (int i = 1; i <= height; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("#");
            }
            System.out.println();
        }
    }
}
