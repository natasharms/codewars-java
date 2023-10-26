import java.util.ArrayList;

public class Metro {
    public static int countPassengers(ArrayList<int[]> stops) {
        int total = 0;
        for (int[] stop : stops) {
            total += stop[0] - stop[1];
        }
        return total;
    }
}
