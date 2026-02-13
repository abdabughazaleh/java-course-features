package java23features;

/*import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;*/

import module java.base;

public class ModuleImportDeclarations {
    public static void main(String[] args) throws IOException {
        List<String> lines = Files.readAllLines(Path.of("data.txt"));
        Map<String, Long> freq = lines.stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
    }
}
