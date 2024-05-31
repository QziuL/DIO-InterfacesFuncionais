package desafios;

import java.util.*;

public class Desafios {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        // Desafio 19 - Encontre a soma dos números divisíveis por 3 e 5
        List<Integer> divisiveisPorTresOuCinco = numeros.stream().filter(numero -> (numero % 3 == 0) || (numero % 5 == 0)).toList();
        int soma = divisiveisPorTresOuCinco.stream().reduce(0, Integer::sum);
        System.out.println(divisiveisPorTresOuCinco+"\n"+soma);

        // Desafio 18 - Verifique se todos os números da lista são iguais
        /*Set<Integer> numerosUnicos = new HashSet<>();
        List<Integer> repetidos = numeros.stream().filter(num -> !numerosUnicos.add(num)).toList();
        System.out.println((Objects.equals(numerosUnicos.size(), numeros.size()))
                ? "Todos os numeros da lista são iguais."
                : "Lista original: "+numeros+"\nNumeros iguais: "+repetidos+"\nNumeros unicos: "+numerosUnicos
        );*/

        // Desafio 17 - Filtrar os números primos da lista
        /*List<Integer> primos = numeros.stream().filter(numero -> {
            if(numero > 1){
                int count = 0, aux = numero;
                while(aux != 0){
                    if(numero % aux == 0){
                        count++;
                    }
                    aux--;
                }
                return count == 2;
            }
            return false;
        }).toList();
        System.out.println(primos);*/

        // Desafio 16 - Agrupe os números em pares e ímpares:
        /*List<Integer> numerosPares = numeros.stream().filter(numero -> numero % 2 == 0).toList();
        List<Integer> numerosImpares = numeros.stream().filter(numero -> !numerosPares.contains(numero)).toList();
        System.out.println("Números pares: "+numerosPares+"\nNúmeros impares: "+numerosImpares);*/

        // Desafio 15 - Verifique se a lista contém pelo menos um número negativo:
        /*List<Integer> negativos = numeros.stream().filter(numero -> numero < 0).toList();
        System.out.println((negativos.size() > 1) ? "Numeros negativos: "+negativos : "Não há nenhum número negativo.");
        */

        // Desafio 14 - Encontre o maior número primo da lista
        /*Integer maiorPrimo = numeros.stream().filter(numero -> {
            if(numero > 1){
                int count = 0, aux = numero;
                while(aux != 0){
                    if(numero % aux == 0){
                        count++;
                    }
                    aux--;
                }
                return count == 2;
            }
            return false;
        }).max(Comparator.naturalOrder()).get();
        System.out.println(maiorPrimo);*/

        // Desafio 13 - Filtrar os números que estão dentro de um intervalo:
        /*int comeco = 5;
        int fim = 10;
        List<Integer> numerosFiltrados = numeros.stream().filter(numero -> numero >= comeco && numero <= fim).toList();
        System.out.println(numerosFiltrados);*/

        // Desafio 12 - Encontre o produto de todos os números da lista:
        /*Integer produto = numeros.stream().reduce(1, (n1, n2) -> n1 * n2);
        System.out.println(produto);*/

        // Desafio 11 - Encontre a soma dos quadrados de todos os números da lista:
        /*Integer somaDosQuadrados = numeros.stream().map(numero -> numero * numero).reduce(0, Integer::sum);
        System.out.println("Soma dos quadrados da lista: "+somaDosQuadrados);*/

        // Desafio 10 - Agrupe os valores ímpares múltiplos de 3 ou de 5:
        /*List<Integer> numerosImparesMultiplosDeTresOuCinco = numeros.stream().filter(numero -> {
            return numero % 2 != 0 && ((numero % 3 == 0) || (numero % 5 == 0));
        }).toList();
        System.out.println(numerosImparesMultiplosDeTresOuCinco);*/

        // Desafio 9 - Verificar se todos os números da lista são distintos (não se repetem):
        /*List<Integer> semNumerosRepetidos = numeros.stream().distinct().toList();
        System.out.println((Objects.equals(numeros.size(), semNumerosRepetidos.size()))
                            ? "Não há numeros repetidos.\nLista: "+numeros
                            : "Contém numeros repetidos.\nLista original: "+numeros+
                            "\nLista filtrada: "+semNumerosRepetidos
        );*/

        // Desafio 8 - Somar os dígitos de todos os números da lista:
        /*Integer soma = numeros.stream().reduce(0, Integer::sum);
        System.out.println("Soma dos numeros da lista: "+soma);*/

        // Desafio 7 - Encontrar o segundo número maior da lista:
        /*Integer segundoMaior =  numeros.stream()
                                .filter(numero -> numero != numeros.stream().max(Integer::compare).get())
                                .max(Integer::compare)
                                .get();
        System.out.println("Segundo maior valor na lista: "+segundoMaior);*/

        // Desafio 6 - Verificar se a lista contém algum número maior que 10:
       /* List<Integer> numerosMaiorDez = numeros.stream().filter(numero -> numero > 10).toList();
        System.out.println((!numerosMaiorDez.isEmpty())
                ? "Numeros maiores que 10: "+numerosMaiorDez
                : "Não há numeros maiores que 10."
        );*/

        // Desafio 5 - Calcule a média dos números maiores que 5:
        /*List<Integer> numerosMaioresQueCinco = numeros.stream().filter(numero -> numero > 5).toList();
        int soma = numerosMaioresQueCinco.stream().reduce(0, Integer::sum);
        System.out.println("Média: "+((double) soma / numerosMaioresQueCinco.size()));*/

        // Desafio 4 - Remova todos os valores ímpares:
        //List<Integer> numerosImpares = numeros.stream().filter(numero -> numero % 2 != 0).toList();
        //System.out.println(numerosImpares);

        // Desafio 3 - Verifique se todos os números da lista são positivos:
        //int qtdNumerosPositivos = numeros.stream().filter(numero -> numero > 0).toList().size();
        //System.out.println("Qtd numeros na lista: "+numeros.size()+"\nNumeros positivos na lista: "+qtdNumerosPositivos);

        // Desafio 2 - Imprima a soma dos números pares da lista:
        //List<Integer> numerosPares = numeros.stream().filter(numero -> numero % 2 == 0).toList();
        //System.out.println(numerosPares.stream().reduce(0, Integer::sum));

        // Desafio 1 - Mostre a lista na ordem numérica:
        //numeros.stream().sorted().forEach(System.out::println);
    }
}
