package application;

import entities.Funcionario;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Locale;
import java.util.Objects;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);


        Funcionario funcionario = new Funcionario();
        Funcionario funcionario1 = new Funcionario();

        System.out.println("Digite o nome: ");
        funcionario.setNome(sc.next());
        System.out.println("Digite o cpf: ");
        funcionario.setCpf(sc.next());
        System.out.println("Digite o salario base: ");
        funcionario.setSalarioBase(sc.nextDouble());
        System.out.println("Digite a quantidade de dias que o funcionario trabalhou: ");
        funcionario.setQtdDias(sc.nextInt());

        System.out.println("Digite o nome: ");
        funcionario1.setNome(sc.next());
        System.out.println("Digite o cpf: ");
        funcionario1.setCpf(sc.next());
        System.out.println("Digite o salario base: ");
        funcionario1.setSalarioBase(sc.nextDouble());
        System.out.println("Digite a quantidade de dias que o funcionario trabalhou: ");
        funcionario1.setQtdDias(sc.nextInt());

        System.out.println(funcionario.hashCode() + " | " + funcionario1.hashCode());

        System.out.println(funcionario.getCpf().equals(funcionario1.getCpf()));
        System.out.println(Objects.equals(funcionario.hashCode(), funcionario1.hashCode()));
        System.out.println(Objects.equals(funcionario.getCpf(), funcionario1.getCpf()));

        System.out.println(funcionario.toString());
        BigDecimal salarioFinal = new BigDecimal(funcionario.salarioPorporcional(funcionario.getQtdDias()));

        System.out.println("Salario proporcional eh: " + salarioFinal);
        System.out.println("Salario proporcional eh: " + salarioFinal.setScale(2, RoundingMode.CEILING));

        System.out.println(funcionario1.toString());
        BigDecimal salarioFinal1 = new BigDecimal(funcionario1.salarioPorporcional(funcionario1.getQtdDias()));
        System.out.println("Salario proporcional eh: " + salarioFinal1);
        System.out.println("Salario proporcional eh: " + salarioFinal1.setScale(2, RoundingMode.CEILING));
    }
}
