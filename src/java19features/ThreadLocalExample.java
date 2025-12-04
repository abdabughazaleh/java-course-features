package java19features;

import java.util.UUID;

public class ThreadLocalExample {
    private final static ThreadLocal<String> SESSION_ID = new ThreadLocal<>();

    public static void handleRequest(String sessionId) {
        SESSION_ID.set(sessionId);
        try {
            getUserProfileFromURL();
        } catch (Exception e) {
            SESSION_ID.remove();
        }
    }

    private static void getUserProfileFromURL() {
        String id = SESSION_ID.get();
        System.out.println("user profile with session-id =  " + id + " getted");
    }

    public static void main(String[] args) {
        handleRequest(UUID.randomUUID().toString());
    }
}
