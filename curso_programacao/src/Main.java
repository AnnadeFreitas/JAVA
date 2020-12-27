import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		// Declaração de variáveis e interpolação

		/*
		 * String product1 = "Computer"; String product2 = "Office Desk";
		 * 
		 * int age = 30; int code = 5290; char gender = 'F';
		 * 
		 * double price1 = 2100.0; double price2 = 650.50; double measure = 53.234567;
		 * 
		 * // %s = String %d = inteiro %f = float %n = Quebra de Linha
		 * 
		 * /*System.out.printf("Products = %n %s, which price is $ %.2f %n", product1,
		 * price1); System.out.printf("%s, which price is $ %.2f%n%n", product2,
		 * price2);
		 * System.out.printf("Record: %s years old, code %d and gender: %s%n%n", age,
		 * code, gender); System.out.printf("Measue with eight decimal places: %.8f%n",
		 * measure); System.out.printf("Rouded (three decimal places): %.3f%n",
		 * measure); Locale.setDefault(Locale.US);
		 * System.out.printf("US decimal point: %.3f%n", measure);
		 * 
		 * 
		 * int x;
		 * 
		 * x = sc.nextInt();
		 * 
		 * System.out.println("o valor de x é " + x);
		 * 
		 * 
		 * 
		 * /* Primeira lista de exercícios
		 * 
		 * /* Exercício 0 = Fazer um programa para ler as medidas de largura e
		 * comprimento de um terreno retangular com uma casa decimal, bem como o valor
		 * do metro quarado do terreno com duas casas decimais. Em seguida, o programa
		 * deve mostrar o valor da área do terreno , bem como o valor do preço do
		 * terreno, ambos com duas casas decimais.
		 * 
		 * 
		 * Locale.setDefault(Locale.US);
		 * 
		 * 
		 * double largura = sc.nextDouble(), comprimento = sc.nextDouble(),
		 * metroQuadrado = sc.nextDouble(),area = largura*comprimento, preco =
		 * area*metroQuadrado;
		 * 
		 * System.out.printf("Area = %.2f%nPreço = %.2f", area, preco);
		 * 
		 * /*Exercicio 1 = Faça um programa para le dois valores inteiros e , depois,
		 * mostrar na tela a soma desses números com a mensagem explicativa
		 * 
		 * int inteiroUm = sc.nextInt(), inteiroDois = sc.nextInt();
		 * 
		 * 
		 * System.out.println("SOMA = " + (inteiroUm+inteiroDois));
		 * 
		 * 
		 * /*Exercício 2 = Faça um programa para ler o valor do raio de um círculo, e
		 * depois mostrar o valor da area deste círculo com quatro casas decimais
		 * 
		 * 
		 * Locale.setDefault(Locale.US);
		 * 
		 * double pi = 3.14159, raio = sc.nextDouble(), areaCirculo = pi*(Math.pow(raio,
		 * 2));
		 * 
		 * System.out.printf("A = %.4f", areaCirculo);
		 * 
		 * 
		 * /* Exercicio 3 = Fazer um programa para ler quatro valores inteiros A, B, C,
		 * D. A segyur , calcule e mostre a diferneça do produto de A e B pelo produto
		 * de C e D segundo a fórmula = DIFERENÇA = (A*B) - (C*D).
		 * 
		 * 
		 * int A = sc.nextInt(), B = sc.nextInt(), C = sc.nextInt(), D = sc.nextInt(),
		 * diferenca = (A*B)-(C*D);
		 * 
		 * System.out.println("DIFERENÇA = " + diferenca);
		 * 
		 * 
		 * 
		 * /*Exercício 4 = Fazer um programa que leia o número de um funcionã́rio , seu
		 * número de horas trabalhadas, o valor que recebe por horas e calcula o salário
		 * desse funcionário. A seguir , mostre o número e o salário do funcionário com
		 * duas casas decimais
		 * 
		 * Locale.setDefault(Locale.US);
		 * 
		 * int number = sc.nextInt(), horasTrabalhadas = sc.nextInt(); double valorHora
		 * = sc.nextDouble(), salario = ((double)horasTrabalhadas)*valorHora;
		 * 
		 * System.out.printf("Number = %d%nSalary = U$ %.2f", number, salario);
		 * 
		 * 
		 * 
		 * /*Exercício 5 = Fazer um programa para ler o código de uma peça 1, o número
		 * de peças 1, o valor unitário de cada peça 1, o código de uma peça 2, o número
		 * de peças 2 e o valor unitário de caa peça 2. Calcule e mostre o valor a ser
		 * pago.
		 * 
		 * 
		 * Locale.setDefault(Locale.US); int codPeca1= sc.nextInt(), codPeca2 =
		 * sc.nextInt(), qtdP1= sc.nextInt(), qtdP2 = sc.nextInt(); double valorP1 =
		 * sc.nextDouble(), valorP2 = sc.nextDouble(), valorAPagar = (double)
		 * (valorP1*qtdP1) + (valorP2*qtdP2);
		 * 
		 * System.out.printf("VALOR A PAGAR = %.2f", valorAPagar);
		 * 
		 * /*Exercício 6 = Fazer um programa que leia três valores com ponto flutuante
		 * de dupla precisão: A,B e C. 
		 * 
		 * Em seguida, calcule e mostre: 
		 * 
		 * a) a área do triângulo retângulo que tem A por base e C por altura. 
		 * b) a área do círculo de raio C. (pi = 3.14159) 
		 * c) a área do trapézio que tem A e B por bases e C por altura.
		 * d) a área do quadrado que tem lado B.
		 * e) a área do retângulo que tem lados A e B.
		 */
		
		Locale.setDefault(Locale.US);
		
		double a = sc.nextDouble(), b = sc.nextDouble(), c = sc.nextDouble(), pi = 3.14159;
		
		System.out.printf("TRIANGULO = %.3f%n", (a*c)/2);
		System.out.printf("CIRCULO = %.3f%n", pi*(Math.pow(c, 2)));
		System.out.printf("TRAPEZIO = %.3f%n", ((a+b)*c)/2);
		System.out.printf("QUADRADO = %.3f%n", Math.pow(b, 2));
		System.out.printf("RETÂNGULO = %.3f", a*b);
		

		sc.close();

	}

}
