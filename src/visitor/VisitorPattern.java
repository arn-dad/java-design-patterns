package visitor;

public class VisitorPattern {
    public static void main(String[] args) {
        System.out.println("Visitor Pattern");
        HtmlDocument document = new HtmlDocument();
        document.add(new AnchorNode());
        document.add(new HeadingNode());
        document.execute(new HighlightOperation());
    }
}
