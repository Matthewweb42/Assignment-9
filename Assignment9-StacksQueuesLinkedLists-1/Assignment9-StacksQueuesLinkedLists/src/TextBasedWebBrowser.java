import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.net.URL;
import java.net.URLConnection;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class TextBasedWebBrowser {
    public static void main(String[] args) {
        boolean done = false;
        String currentUrl = "";
        Scanner scanner = new Scanner(System.in);
        // TODO: create you stacks and history here
        do {
            System.out.println();
            printHelp();
            String command = scanner.nextLine().trim();
            // TODO: handle input here
        } while(!done);
    }

    private static void printHelp() {
        System.out.println("Commands");
        System.out.println("========================");
        System.out.println("go <website>");
        System.out.println("back");
        System.out.println("forward");
        System.out.println("history");
        System.out.println("exit");
    }

    private static String getWebpage(String urlString) {
        try {
            URL url = URI.create(urlString).toURL();
            URLConnection connection = url.openConnection();
            InputStream stream = connection.getInputStream();
            return new String(stream.readAllBytes(), StandardCharsets.UTF_8);
        } catch (IOException | IllegalArgumentException e) {
            return String.format("An error occurred trying to access %s: %s", urlString, e.getMessage());
        }
    }
}
