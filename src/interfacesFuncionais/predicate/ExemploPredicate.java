/*
*  Predicate<T>
*  Representa uma função que aceita um argumento do tipo T e retorna um valor booleano (verdadeiro ou falso).
*  É comumente usada para filtrar os elementos do Stream com base em alguma condição.
* */

package interfacesFuncionais.predicate;

import java.util.Arrays;
import java.util.List;

public class ExemploPredicate {
    public static void main(String[] args) {
        // Criar uma lista de números inteiros
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // Usar o Predicate com expressão lambda para filtrar números pares
        // Predicate<Integer> isPar = numero -> numero % 2 == 0;

        // Usar o predicado para filtrar números pares no Stream e armazená-los em outra lista
        // List<Integer> numerosPares = numeros.stream().filter(isPar).toList();

        // Imprimir a lista de números pares
        //numerosPares.forEach(System.out::println);

        numeros.stream().filter(numero -> numero % 2 == 0).forEach(System.out::println);
    }
}












