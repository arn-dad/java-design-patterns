package behavioral.template;

public class TemplatePattern {
    public static void main(String[] args) {
        System.out.println("Template pattern");

        TransferMoneyTask transferMoneyTask = new TransferMoneyTask();

        transferMoneyTask.execute();
    }
}
