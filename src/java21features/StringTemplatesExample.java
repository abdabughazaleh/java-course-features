package java21features;

public class StringTemplatesExample {
    public static void main(String[] args) {
        String email = "abdabughazaleh@gmail.com";
        String customerName = "Abd AbuGhazaleh";
        String subject = "New support ticket!";
        String body = STR."""
                    Subject : \{subject}
                    New support ticket from \{customerName},
                    And the sender email is \{email},

                    Thanks & Regards.
                """;

        System.out.println(body);
    }
}
