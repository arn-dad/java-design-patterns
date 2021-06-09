package state;
// class | Context
// method | request
public class Canvas {
    private Tool currentTool;

    public void mouseDown() {
        currentTool.mouseDown();
    }

    public void mouseUp() {
        currentTool.mouseUp();
    }

    public Tool getCurrentToolType() {
        return currentTool;
    }

    public void setCurrentToolType(Tool currentTool) {
        this.currentTool = currentTool;
    }
}
