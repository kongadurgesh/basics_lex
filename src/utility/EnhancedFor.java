package utility;

public class EnhancedFor {
    private int array[] = new int[5];
    private int arrayIndex = 0;

    public void storeMarks(int marks) {
        array[arrayIndex++] = marks;
    }

    public void displayMarks() {
        for (int mark : array) {
            System.out.println(mark);
        }
    }
}
