import java.io.FileReader;

import javax.sql.rowset.FilteredRowSet;

public class App {
    public static void main(String[] args) throws Exception {
        // entrada
        float firstNumber = 25;
        float secondNumber = 98;

        // processamento
        float sum = firstNumber + secondNumber;
        float subtraction = firstNumber - secondNumber;
        float multiplication = firstNumber * secondNumber;
        float division = firstNumber / secondNumber;

        //saida
        System.out.printf("A soma dos números %.0f e %.0f é igual à %.0f",
                firstNumber, secondNumber, sum);

    }
}
