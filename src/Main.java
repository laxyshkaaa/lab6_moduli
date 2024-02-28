import java.sql.SQLOutput;

class Reader{
    public String FIO;
    public int TicketNum;
    public String Facultet;
    public String DateOfBirth;
    public String PhoneNumber;
    Reader(String FIO, int TicketNum, String Facultet, String DateOfBirth, String PhoneNumber){
        this.FIO = FIO;
        this.TicketNum = TicketNum;
        this.Facultet = Facultet;
        this.DateOfBirth = DateOfBirth;
        this.PhoneNumber = PhoneNumber;
    }
    public void TakeBook(int num){
        System.out.printf("%s взял(a) %d книги",FIO, num);
    }
    public void TakeBook(String... BookNames){
        System.out.print(FIO + " взял(a) книги: ");
        for (String B : BookNames){
            System.out.print(B + " ");
        }
    }
    public void ReturnBook(String... BookNames){
        System.out.print(FIO + " вернул(a) книги: ");
        for (String B : BookNames){
            System.out.print(B + " ");
        }
    }
    public void ReturnBook(int num){
        System.out.printf("%s вернул(a) %d книг", FIO, num);
    }
}
public class Main {
    public static void main(String[] args) {
     Reader r1 = new Reader("Иванов Иван Иванович", 12345, "Информационные технологии", "01.01.1990", "555-1234");
     Reader r2 = new Reader("Петрова Анна Сергеевна", 23456, "Биология", "03.04.1995", "555-2345");
     Reader r3 = new Reader("Смирнов Алексей Павлович", 34567, "История", "05.06.1988", "555-3456");
     Reader r4 = new Reader("Козлова Ольга Игоревна", 45678, "Математика", "07.08.1992", "555-4567");
     Reader r5 = new Reader("Васильев Иван Федорович", 56789, "Физика", "09.10.1985", "555-5678");
     Reader[] Readers = {r1, r2, r3, r4,r5};
     Readers[0].TakeBook(4);
        System.out.println();
     Readers [1].TakeBook("Герой нашего времени,", "Золотая Рыбка,", "Заводной Апельсин," );
        System.out.println();
        Readers[2].ReturnBook("1984,", "Химия 6 класс");
        System.out.println();
        Readers[3].ReturnBook(5);
    }



}
