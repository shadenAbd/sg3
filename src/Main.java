import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Rectangle rect = new Rectangle(8, 6);


        char ch = '8' ;


        rect.drawFilled('j');
        rect.drawEmpty(ch);

       // rect.readRectFromConsole();
       /* int x = 3;
        int p = 2;
        int result = 1;
        for (int i = 0; i < p; i++) {
            result = result * x;
        }
        System.out.println(result);
       rect.drawFilled();
        System.out.println(" ");
        rect.drawEmpty();*/

        Calculator cal= new Calculator();
        /*System.out.println(cal.countDigits(23458));
        System.out.println(cal.evenOdd(23458));
        System.out.println(cal.getLastDigit(23458));
        System.out.println(cal.getLastDigit(74731));
        System.out.println(cal.getLastDigit(8));
        System.out.println(cal.countDigits(8));
        System.out.println(cal.gitDigit(3462,1));
        System.out.println(cal.setDigit(234544,3,7));

        System.out.println(cal.countMinDigit(3595114));
        System.out.println(cal.gitDigit2(7832));
        System.out.println(cal.isSymmetric(15251));
        System.out.println(cal.search(188289,8));*/

        Progression p=new Progression();

        Progression p1=new Progression(2,9);
        System.out.println(p.getElement(2));
        p.showProg(4);
        System.out.println(p.sum(4));
        p.showProgUpTo(-6);
        p.showProgUpTo(4);
        p.showProgUpTo(12);



    }
}