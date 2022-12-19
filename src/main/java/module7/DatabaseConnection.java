package module7;

public class DatabaseConnection {
    private static DatabaseConnection db;

    public static DatabaseConnection getInstance() {
        if(db != null) {
            return db;
        } else {
            db = new DatabaseConnection("");
            return db;
        }
    }
    private DatabaseConnection(String db) {
        db = db;
    }
}
