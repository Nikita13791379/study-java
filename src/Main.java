public class Main {
    public static void main(String[] args) {
        Basket vasyaBasket = new Basket();
        vasyaBasket.add("Хлеб", 80, 1, 300);
        vasyaBasket.add("Молоко", 78, 1, 900);

        Basket petyaBasket = new Basket(50000);
        petyaBasket.add("Земля", 249 , 1, 500);
        petyaBasket.add("Лопата", 3090, 1, 2940);

        Basket mashaBasket = new Basket(":  Стол", 5000);

        vasyaBasket.printik("Корзина Васи:");
        System.out.println("Масса товаров: " + vasyaBasket.getTotalWeight() + " грамм" + "\n");

        petyaBasket.printik("Корзина Пети:");
        System.out.println("Масса товаров: " + petyaBasket.getTotalWeight() + " грамм" + "\n");

        mashaBasket.printik("Корзина Маша:");
        System.out.println("Масса товаров: " + mashaBasket.getTotalWeight() + " грамм" + "\n");

    }
}
