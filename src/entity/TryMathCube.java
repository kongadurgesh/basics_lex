package entity;

import java.util.Scanner;

public class TryMathCube {
    public int cube(int n) {
        return n * n * n;
    }

    public void test() {
        Scanner inp = new Scanner(System.in);
        try {
            int num = Integer.parseInt(inp.nextLine());
            System.out.println(cube(num));
        } catch (Exception e) {
            System.out.println("Input is not a number");
        }

        inp.close();
    }
}
