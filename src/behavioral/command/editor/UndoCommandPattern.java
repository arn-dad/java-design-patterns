package behavioral.command.editor;

public class UndoCommandPattern {
    public static void main(String[] args) {
        History history = new History();
        HtmlDocument document = new HtmlDocument();
        document.setContent("Hello World");

        BoldCommand command = new BoldCommand(document, history);
        command.execute();
        System.out.println(document.getContent());

//        behavioral.command.unexecute();
//        System.out.println(document.getContent());

        UndoCommand undoableCommand = new UndoCommand(history);
        undoableCommand.execute();
        System.out.println(document.getContent());
    }
}
