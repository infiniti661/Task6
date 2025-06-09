//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Book book = new Book ("Богатый папа, бедный папа", 1997, "Роберт Кийосаки", 392);

        System.out.println(book.isBig());
        System.out.println(book.mathes("папа"));
        System.out.println(book.estimatePrice());

    }
}