import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {

	private static String DRIVER = "org.apache.derby.jdbc.EmbeddedDriver";
private static String JDBC_URL  = "jdbc:derby:ConnectingCreatingJavaDB;create=true;";

Connection conn;

public DBConnection() {
	try {
		this.conn = DriverManager.getConnection(JDBC_URL);
	if (this.conn != null) {
		System.out.print("You are connected");
	}
	}catch (SQLException e) {
	}
	}

public static String getDRIVER() {
	return DRIVER;
}

public static void setDRIVER(String dRIVER) {
	DRIVER = dRIVER;
}
}
