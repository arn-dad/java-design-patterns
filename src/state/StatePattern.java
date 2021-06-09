package state;
// Open close
public class StatePattern {
    public static void main(String[] args) {
        System.out.println("State pattern");
        Canvas canvas = new Canvas();
        canvas.setCurrentToolType(new SelectionTool());
        canvas.mouseDown();
        canvas.mouseUp();

        canvas.setCurrentToolType(new BrushTool());
        canvas.mouseDown();
        canvas.mouseUp();
    }
}
