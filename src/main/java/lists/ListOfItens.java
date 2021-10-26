package lists;

public class ListOfItens {
    public static void main(String[] args) {
        List item = new List();
        item.insert(12);
        item.insert(23);
        item.insert(42);
        item.insert(51);

        item.list();

        item.remove();

        item.list();
    }
}
