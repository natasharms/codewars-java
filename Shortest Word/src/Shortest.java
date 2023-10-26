import java.util.List;

public class Shortest {
    public static int findShort(String s) {
        List<String> words = List.of(s.split(" "));
        return words.stream()
                .mapToInt(String::length)
                .min().getAsInt();
    }
}
