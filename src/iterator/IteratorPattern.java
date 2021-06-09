package iterator;

public class IteratorPattern {
    public static void main(String[] args) {
        System.out.println("Iterator pattern");
        BrowserHistory history = new BrowserHistory();

        history.push("http://google.com");
        history.push("http://facebook.com");
        history.push("http://vk.ru");

        Iterator iterator = history.createIterator();

        while (iterator.hasNext()) {
            String current = iterator.current();
            System.out.println("Current item: " + current);
            iterator.next();
        }
    }
}
