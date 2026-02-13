package java25features;


import java.util.function.Supplier;

class DatabaseConnection {
    private final String dbname;

    public DatabaseConnection(String dbName) {
        this.dbname = dbName;
    }

    public void connect(){
        System.out.println("database connected with : " + dbname);
    }
}

public class StableValuesAPI {
    static void main() {
        StableValue<DatabaseConnection> conn = StableValue.of();
        DatabaseConnection dbConn = conn.orElseSet(()-> new DatabaseConnection("abd_db"));
        dbConn.connect();

        Supplier<DatabaseConnection> dbConnw =
                StableValue.supplier(() -> new DatabaseConnection("jdbc:mysql://localhost:3306/mydb"));
        DatabaseConnection dd =  dbConnw.get();
        dd.connect();;

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
