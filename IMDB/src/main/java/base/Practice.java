package base;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class Practice {
	public Statement stmt;
	public Connection conn;
	public ResultSet rs;
	public String strSQLite = "org.sqlite.JDBC";
	public String strDBPath = "jdbc:sqlite:D:\\javaWorkspace\\IMDB\\IMDB.sqlite";
	//public String strDBPath = (System.getProperty(("user.dir"))+"/IMDBtop250.db");
	public String strQuery;
	public String strFilePath = "D:\\javaWorkspace\\IMDB\\IMDB_Top_250_Movie_List.csv";
}
