package ru.example;

import ru.example.math.MathUtils;
import lombok.Data;

@Data
public class App {
    public static void main(String[] args) {
        System.out.println("2 + 3 = " + MathUtils.add(2, 3));
        System.out.println("Is 7 prime? " + MathUtils.isPrime(7));
    }
}
