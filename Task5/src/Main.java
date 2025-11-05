//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Book book1 = new Book("Робинзон Крузо",1719,new Author("Даниель","Дефо",3),256);

        book1.isBag(256);

        book1.matches("Даниель");

        book1.estimatePrice(256);

    }
}
