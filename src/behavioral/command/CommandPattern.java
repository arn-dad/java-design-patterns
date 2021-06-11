package behavioral.command;

import behavioral.command.fx.Button;
import behavioral.command.fx.Command;

public class CommandPattern {
    public static void main(String[] args) {
        System.out.println("Command pattern");

        CustomerService customerService = new CustomerService();
        Command command = new AddCustomerCommand(customerService);
        Button button = new Button(command);

        button.click();

        // Composite Command
        CompositeCommand composite = new CompositeCommand();
        composite.add(new ResizeCommand());
        composite.add(new BlackAndWhiteCommand());

        composite.execute();
        composite.execute();
    }
}
