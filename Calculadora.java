package geometria;

import java.util.Scanner;

public class Calculadora {

    private double lado;
    private double base;
    private double altura;
    private double raio;
    private int opcao;

    Scanner sc = new Scanner(System.in);

    // MENU
    public void menu() {
        System.out.println("\n=== CALCULADORA DE ÁREAS ===");
        System.out.println("1 - Área do Quadrado");
        System.out.println("2 - Área do Retângulo");
        System.out.println("3 - Área do Círculo");
        System.out.print("Escolha uma opção: ");
    }

    // EXECUTAR
    public void executar() {

        opcao = sc.nextInt();

        switch (opcao) {

            case 1:
                System.out.print("Digite o lado do quadrado: ");
                lado = sc.nextDouble();

                double areaQuadrado = lado * lado;

                System.out.printf("Área do Quadrado: %.2f\n", areaQuadrado);
                break;

            case 2:
                System.out.print("Digite a base do retângulo: ");
                base = sc.nextDouble();

                System.out.print("Digite a altura do retângulo: ");
                altura = sc.nextDouble();

                double areaRetangulo = base * altura;

                System.out.printf("Área do Retângulo: %.2f\n", areaRetangulo);
                break;

            case 3:
                System.out.print("Digite o raio do círculo: ");
                raio = sc.nextDouble();

                double areaCirculo = 3.14 * (raio * raio);

                System.out.printf("Área do Círculo: %.2f\n", areaCirculo);
                break;


            default:
                System.out.println("Opção inválida!");
        }
    }
}