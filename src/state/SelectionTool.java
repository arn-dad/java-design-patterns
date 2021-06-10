package state;
// ConcreteStateB
public class SelectionTool implements Tool{
    @Override
    public void mouseDown() { System.out.println("Selection icon"); } // handle()

    @Override
    public void mouseUp() {
        System.out.println("Draw");
    } // handle()
}
