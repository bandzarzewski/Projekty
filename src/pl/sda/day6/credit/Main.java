package pl.sda.day6.credit;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by RENT on 2017-07-04.
 */
public class Main {

    public static void main(String[] args) {
        Credit creditBankX = new CreditBankX();


//        System.out.println(creditBankX.calculate(10000, 10));
//        System.out.println(creditBankX.calculate(5000, 13));
//        System.out.println(creditBankX.calculate(20000, 48));

        Credit creditBankY = new CreditBankY();
//        System.out.println("Kredyt w banku Y");
//        System.out.println(creditBankY.calculate(20000, 48));

        List<Credit> list = new ArrayList<>();
        list.add(creditBankX);
        list.add(creditBankY);

        for (Credit credit : list) {
            System.out.println(credit.getClass().getSimpleName() + ":"); // drukuje nazwe klasy

            System.out.println(credit.calculate(5000, 13));
            System.out.println(credit.calculate(10000, 10));
            System.out.println(credit.calculate(20000, 15));
            System.out.println(credit.calculate(200000, 48));
        }

    }
}
