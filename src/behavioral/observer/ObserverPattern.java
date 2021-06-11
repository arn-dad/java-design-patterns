package behavioral.observer;
// Observer Pattern has PULL and PUSH communication styles
public class ObserverPattern {
    public static void main(String[] args) {
        System.out.println("Observer Pattern");

        DataSource dataSource = new DataSource();
        SpreadSheet sheetOne = new SpreadSheet();
        SpreadSheet sheetTwo = new SpreadSheet();
        Chart chart = new Chart();

        dataSource.addObserver(sheetOne);
        dataSource.addObserver(sheetTwo);
        dataSource.addObserver(chart);

        dataSource.setValue(5);
        dataSource.setValue(55);
    }
}
