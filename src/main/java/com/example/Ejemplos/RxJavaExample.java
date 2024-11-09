package com.example.Ejemplos;

import io.reactivex.rxjava3.core.Observable;

public class RxJavaExample {

    public static void main(String[] args) {
        
        // Ejemplo de RxJava con operadores map, filter y flatMap
        Observable<Integer> observable = Observable.just(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        observable
            .filter(number -> number % 2 == 0)  // Filtra solo números pares
            .map(number -> number * 2)  // Multiplica cada número por 2
            .flatMap(number -> Observable.just("Número procesado: " + number)) // Convierte a cadena
            .subscribe(
                System.out::println,
                Throwable::printStackTrace,
                () -> System.out.println("Secuencia completada.")
            );
    }
}
