public class Main {
    public static void main(String[] args) {

        BonusMilesService service = new BonusMilesService();

        int price = 10_000;     // цена билета в рублях
        int miles = service.calculate(price);

        System.out.print("Начислено миль: ");
        System.out.println(miles);
    }
}

class BonusMilesService {
    final int milePrice = 20;   // цена одной мили в рублях
    /* эта константа может быть использована во всех методах класса */

    public int calculate (int cost) { // вычисляет кол-во начисленных миль
        return cost / milePrice ;
    }
}

