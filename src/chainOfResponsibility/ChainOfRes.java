package chainOfResponsibility;

public class ChainOfRes {
    public static void main(String[] args) {
        System.out.println("CoR pattern");
        // auth -> logger -> compressor
        Compressor compressor = new Compressor(null);
        Logger logger = new Logger(compressor);
        Authenticator authenticator = new Authenticator(logger);

        WebServer server = new WebServer(authenticator);
        server.handle(new HttpRequest("admin", "1234"));
    }
}
