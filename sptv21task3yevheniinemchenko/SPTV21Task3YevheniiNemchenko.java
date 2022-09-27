package sptv21task3yevheniinemchenko;
import java.util.Scanner;

public class SPTV21Task3YevheniiNemchenko {
    public static int yearAns;
static enum mounth {ЯНВАРЯ,ФЕВРАЛЯ, МАРТА, АПРЕЛЯ, МАЯ, ИЮНЯ, ИЮЛЯ, АВГУСТА, СЕНТЯБРЯ, ОКТЯБРЯ, НОЯБРЯ, ДЕКАБРЯ}
    public static void main(String[] args) {
        System.out.println("Введите Имя, фамилию и исикукод(как только ввели что-то, нажимаете на ентер) ");
            Scanner scanner_name = new Scanner(System.in);
            String firstName = scanner_name.nextLine();
            Scanner scanner_lastname = new Scanner(System.in);
            String secondName = scanner_lastname.nextLine();
            Scanner scanner_isik = new Scanner(System.in);
            String Isik = scanner_isik.nextLine();
            String year = String.valueOf(Isik);
            year = year.substring(1, 3);
            
            int year1 = new Integer(year);
            if(year1>0 && year1<24){
            int yearAns = 20;
            } else {
            int yearAns = 19;
            }
            String mounth1 = String.valueOf(Isik);
            mounth1 = mounth1.substring(3,5);
            int mounth2 = new Integer(mounth1);
            String day = String.valueOf(Isik);
            day = day.substring(5,7);

            System.out.println(secondName+" "+firstName+" "+" родился "+day+" "+mounth.values()[mounth2-1]+" "+yearAns+year +" года ");
    }
}