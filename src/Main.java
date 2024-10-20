import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Kalkulator kalkulator = new Kalkulator();
        System.out.println("Unesite prvi broj: ");

        kalkulator.setOperand1(scanner.nextInt());
        System.out.println("Unesite drugi broj");
        kalkulator.setOperand2(scanner.nextInt());

        System.out.println("Rezultat množenja " + kalkulator.getOperand1() + " i " + kalkulator.getOperand2() + " je " + kalkulator.mul(kalkulator.getOperand1(), kalkulator.getOperand2()));
        System.out.println("Rezultat dijeljenja " + kalkulator.getOperand1() + " i " + kalkulator.getOperand2() + " je " + kalkulator.div(kalkulator.getOperand1(), kalkulator.getOperand2()));
        System.out.println("Rezultat sabiranja " + kalkulator.getOperand1() + " i " + kalkulator.getOperand2() + " je " + kalkulator.add(kalkulator.getOperand1(), kalkulator.getOperand2()));
        System.out.println("Rezultat oduzimanja " + kalkulator.getOperand1() + " i " + kalkulator.getOperand2() + " je " + kalkulator.sub(kalkulator.getOperand1(), kalkulator.getOperand2()));


    }
}