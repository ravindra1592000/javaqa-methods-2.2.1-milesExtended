# Отчёт о тестировании приложения "Miles (extended)"

## Краткое описание

24/01/2021 произведено тестирование модернизированного приложения **Мили** для решения Задачи №1 - Мили (модернизация)

## Описание тестов

Произведено позитивное тестирование следующей программы:
```java
public class Main {
public static void main(String[] args) {
    
    int price = 10_000;     // цена билета в рублях
    
    BonusMilesService service = new BonusMilesService();
    int miles = service.calculate(price);
        
    System.out.print("Начислено миль: ");
    System.out.println(miles);
    }
}

class BonusMilesService {
    /* константа milePrice может быть использована во всех методах класса */
    final int milePrice = 20;   // цена одной мили в рублях

    public int calculate (int cost) { // вычисляет кол-во начисленных миль
        return cost / milePrice ;
    }
}
```
## Результаты

1. 100% успешных тестов
2. Пример запуска и вывода программы из командной строки терминала:

```
$ java Main

Начислено миль: 500
```


