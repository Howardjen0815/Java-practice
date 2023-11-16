import java.text.NumberFormat;
import java.util.Scanner;
public class Mortagecalculator{
    public static void main(String[]args){
        Scanner principle=new Scanner(System.in);//先創建Scanner物件
        System.out.print("Principle: ");//印出principle
        int totalprinciple= principle.nextInt();//將使用者輸入的principle存入totalprinciple中
        System.out.print("Annual Interest Rate: ");//印出 Annual interest rate
        double annualInterestRate= principle.nextDouble();//將使用者輸入的Annual interest rate存入totalprinciple中
        double monthlyInterestRate = annualInterestRate/12/100;//將年利率轉換成月利率
        System.out.print("Period(Years)");//印出 Periods
        int year= principle.nextInt();//將使用者輸入的Periods yearr存入year中
        int month = year*12;//將年轉換成月
        double mortageprice = totalprinciple*monthlyInterestRate*Math.pow(1+monthlyInterestRate, month)/(Math.pow(1+monthlyInterestRate, month)-1);
        //房貸利率計算公式
        String finalMortageprice= NumberFormat.getCurrencyInstance().format(mortageprice);//將mortageprice的值存入正式的輸出值,讓價格有＄的符號
        System.out.println("Montage: "+ finalMortageprice +"\n");//印出
    }
}