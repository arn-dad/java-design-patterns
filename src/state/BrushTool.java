package state;
// ConcreteStateA
public class BrushTool implements Tool{
    @Override
    public void mouseDown() {
        System.out.println("Brush icon");
    } // handle()

    @Override
    public void mouseUp() {
        System.out.println("Draw a line ");
    } // handle()
}
