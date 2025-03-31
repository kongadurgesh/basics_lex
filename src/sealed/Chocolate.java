package sealed;

sealed class Chocolate permits WhiteChocolate, DarkChocolate, MilkChocolate {
    public void display() {
        System.out.println("inside Sealed Chocolate class");
    }
}