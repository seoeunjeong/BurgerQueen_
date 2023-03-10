package app;

import app.product.Product;
import app.product.subproduct.Drink;
import app.product.subproduct.Hamburger;
import app.product.subproduct.Side;

public class Menu{
    private Product[] products;

    public Menu(Product[] products) {
        this.products = products;
    }

    public void printMenu() {
        System.out.println("[๐ป] ๋ฉ๋ด");
        System.out.println("-".repeat(60));

        System.out.println("๐ ํ๋ฒ๊ฑฐ");
        printHamburgers(true);
        System.out.println();

        System.out.println("๐ ์ฌ์ด๋");
        printSides(true);
        System.out.println();

        System.out.println("๐ฅค ์๋ฃ");
        printDrinks(true);
        System.out.println();

        System.out.println();
        System.out.println("๐งบ (0) ์ฅ๋ฐ๊ตฌ๋");
        System.out.println("๐ฆ (+) ์ฃผ๋ฌธํ๊ธฐ");
        System.out.println("-".repeat(60));
        System.out.print("[๐ฃ] ๋ฉ๋ด๋ฅผ ์ ํํด์ฃผ์ธ์ : ");
    }


    protected void printDrinks(boolean printPrice) {
        for (Product product : products) {
            if (product instanceof Drink) {
                PrintEachMenu(product,printPrice);
            }
        }
    }

    protected void printSides(boolean printPrice) {
        for (Product product : products) {
            if (product instanceof Side) {
                PrintEachMenu(product,printPrice);
            }
        }
    }

    private void printHamburgers(boolean printPrice) {
        for (Product product : products) {
            if (product instanceof Hamburger) {
                PrintEachMenu(product,printPrice);
            }
        }
    }

    private static void PrintEachMenu(Product product, boolean printPrice) {
        if (printPrice) System.out.printf(
                "   (%d) %s %5dKcal %5d์\n",
                product.getId(), product.getName(), product.getKcal(), product.getPrice()
        );
        else System.err.printf(
                "   (%d) %s %5dKcal\n",
                product.getId(), product.getName(), product.getKcal());
    }

}

