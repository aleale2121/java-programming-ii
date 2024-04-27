
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class LiteracyComparison {

    public static void main(String[] args) {
        try {
            Files.lines(Paths.get("literacy.csv"))
                    .map(row -> row.split(","))
                    .sorted((p1, p2) -> {
                        Double lr1 = Double.valueOf(p1[5].trim());
                        Double lr2 = Double.valueOf(p2[5].trim());
                        if (lr1 < lr2) {
                            return -1;
                        } else if (lr1 > lr2) {
                            return 1;
                        }

                        return 0;
                    }).
                    forEach(p -> System.out.println(p[3] + " (" + p[4] + "), "
                    + p[2].trim().split(" ")[0] + ", " + p[5]));
        } catch (IOException ex) {
            Logger.getLogger(LiteracyComparison.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
