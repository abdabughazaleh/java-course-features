package java19features;

import java.time.Duration;
import java.time.Instant;
import java.util.List;
/*import java.util.concurrent.StructuredTaskScope;*/


public class Main3 {
    record User(String name, List<String> accounts, List<String> orders) {
    }

    public static String getUserName() throws InterruptedException {
        Thread.sleep(1000);
        return "Abd AbuGhazaleh";
    }

    public static List<String> getUserAccounts() throws InterruptedException {
        Thread.sleep(1000);
        return List.of("5511-9923-9447-0017", "8896-9988-9447-0018");
    }

    public static List<String> getUserOrders() throws InterruptedException {
        Thread.sleep(1000);
        return List.of("iPhone", "Airpods", "Mobile Cover");
    }

   /* public static User getUserProfile() throws Exception {

        try(var scope = new StructuredTaskScope.ShutdownOnFailure()) {

            StructuredTaskScope.Subtask<String> userName = scope.fork(Main3::getUserName);
            StructuredTaskScope.Subtask<List<String>>  userAccounts = scope.fork(Main3::getUserAccounts);
            StructuredTaskScope.Subtask<List<String>>  userOrders = scope.fork(Main3::getUserOrders);

            scope.join();
            scope.throwIfFailed();
            return new User(userName.get() , userAccounts.get() , userOrders.get());
        }
    }*/

    public static void main(String[] args) throws Exception {
        Instant start = Instant.now();
       // var user = getUserProfile();
        Instant end = Instant.now();
        Duration duration = Duration.between(start , end);
      //  System.out.println(user);
        System.out.println("==> Time : " + duration.toSeconds() + " seconds" );
    }
}