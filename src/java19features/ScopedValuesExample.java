package java19features;

import java.util.UUID;

public class ScopedValuesExample {
    private final static ScopedValue<String> CURRENT_SESSION_ID = ScopedValue.newInstance();

    public static void handleRequest(String sessionId) {
        ScopedValue.where(CURRENT_SESSION_ID, sessionId)
                .run(() -> {
                    System.out.println("start getting profile from ScopedValue !");
                    getUserProfileFromURL();
                });
        getUserProfileFromURL();
    }

    private static void getUserProfileFromURL() {
        String id = CURRENT_SESSION_ID.orElse("No session value yet! ");
        System.out.println("user profile with session-id =  " + id + " getted - scopedvalue");
    }

    public static void main(String[] args) {
        handleRequest(UUID.randomUUID().toString() );
    }
}
