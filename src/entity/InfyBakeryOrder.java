package entity;

public class InfyBakeryOrder {
    // Define enum with name InfyBakeryItems, this enum contains all the item names
    enum InfyBakeryItems {
        PIZZA, BURGER, SANDWITCH, CAKE, ICECREAM
    }

    private static double calculatePrice(InfyBakeryItems selectedItem) {
        double price = switch (selectedItem) {
            case PIZZA:
                yield price = 5.5d;
            case BURGER:
                yield price = 4d;
            case CAKE:
                yield price = 5d;
            case ICECREAM:
                yield price = 3.5d;
            case SANDWITCH:
                yield price = 5.7d;
            default:
                yield price = 0d;
        };
        // use the switch expression to write remaining code
        return price;
    }

    public void placeOrder() {
        System.out.println("All Items:");
        for (InfyBakeryItems bakeryItem : InfyBakeryItems.values()) {
            System.out.println(bakeryItem);
        }

        InfyBakeryItems selectedItem = InfyBakeryItems.BURGER;

        double price = calculatePrice(selectedItem);
        System.out.println("Price of " + InfyBakeryItems.BURGER + " is: " + price);
    }

}
