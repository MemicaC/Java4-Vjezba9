import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Kalkulator kalkulator=new Kalkulator();
    System.out.println("Unesite prvi broj: ");
        kalkulator.operand1 = scanner.nextInt();
        System.out.println("Unesite računsku operaciju");
        String operator = scanner.next();
        System.out.println("Unesite drugi broj");
        kalkulator.operand2 = scanner.nextInt();

        if (operator.equals("*")) {
            System.out.println("Rezultat množenja " + kalkulator.operand1 + " i " + kalkulator.operand2 + " je " + kalkulator.mul());
        } else if (operator.equals("/")) {

            while (kalkulator.operand2 == 0) {
                System.out.println("Dijeljenje sa nulom. Unesite broj različit od nule");
                kalkulator.operand2 = scanner.nextInt();
            }

            System.out.println("Rezultat dijeljenja " + kalkulator.operand1 + " i " + kalkulator.operand2 + " je " + kalkulator.div());

        } else if (operator.equals("+")) {
            System.out.println("Rezultat sabiranja " + kalkulator.operand1 + " i " + kalkulator.operand2 + " je " + kalkulator.add());
        } else if (operator.equals("-")) {
            System.out.println("Rezultat oduzimanja " + kalkulator.operand1 + " i " + kalkulator.operand2 + " je " + kalkulator.sub());
        } else {
            System.out.println("nepoznata računska operacija");
        }


    }
    }
