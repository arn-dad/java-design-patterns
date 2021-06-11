package behavioral.memento;

public class MementoPattern {
    public static void main(String[] args) {
        System.out.println("Memento pattern");

        Editor editor = new Editor();
        History history = new History();

        editor.setContent("One");
        history.push(editor.createState());

        editor.setContent("Two");
        history.push(editor.createState());

        editor.setContent("Three");
        history.push(editor.createState());

        editor.restore(history.pop());
        editor.restore(history.pop());
        editor.restore(history.pop());

        System.out.println(editor.getContent());
    }
}
