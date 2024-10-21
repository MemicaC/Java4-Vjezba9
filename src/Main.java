import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Kalkulator kalkulator = new Kalkulator();
        double op1;
        double op2;
        System.out.print("Unesite prvi broj: ");
        kalkulator.setOperand1(scanner.nextInt());
        op1= kalkulator.getOperand1();
        System.out.print("Unesite drugi broj: ");
        kalkulator.setOperand2(scanner.nextInt());
        op2= kalkulator.getOperand2();

        System.out.println("Rezultat množenja " + op1 + " i " + op2+ " je " + kalkulator.mul(op1,op2));
        System.out.println("Rezultat dijeljenja " + op1 + " i " + op2 + " je " + kalkulator.div(op1,op2));
        System.out.println("Rezultat sabiranja " + op1 + " i " +op2 + " je " + kalkulator.add(op1, op2));
        System.out.println("Rezultat oduzimanja " + op1 + " i " + op2 + " je " + kalkulator.sub(op1, op2));


    }
}