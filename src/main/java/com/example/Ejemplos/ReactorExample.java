package com.example.Ejemplos;

import reactor.core.publisher.Flux;

public class ReactorExample {

    public static void main(String[] args) {
        
        // Ejemplo de Reactor con operadores map, filter y flatMap
        Flux<Integer> flux = Flux.just(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        flux
            .filter(number -> number % 2 != 0)  // Filtra solo números impares
            .map(number -> number * 3)  // Multiplica cada número por 3
            .flatMap(number -> Flux.just("Número transformado: " + number)) // Convierte a cadena
            .subscribe(
                System.out::println,
                Throwable::printStackTrace,
                () -> System.out.println("Flux completado.")
            );
    }
}

