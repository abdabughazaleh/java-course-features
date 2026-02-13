

void main() {
    List<String> lines = null;
    try {
        lines = Files.readAllLines(Path.of("data.txt"));
    } catch (IOException e) {
        throw new RuntimeException(e);
    }
    Map<String, Long> freq = lines.stream()
            .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
}