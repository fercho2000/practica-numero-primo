import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class LecturaDatosDelArchivo {
    public LecturaDatosDelArchivo(int limitePaginas) {
        lecturaArchivo(limitePaginas);
    }

    void lecturaArchivo(int limitePaginas) {

        try (Stream<String> logStream = Files.lines(Paths.get(Paths.get("").toAbsolutePath() + "\\src\\ciudades-colombia"))) {

            logStream.sorted()
                    .limit(limitePaginas)
                    .forEach(System.out::println);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
