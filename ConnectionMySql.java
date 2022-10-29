package connection;
import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionMySql {
	public static Connection createConnectionMySQL() throws Exception{

		Class.forName("com.mysql.cj.jbdc.Driver");
		
		Connection connection = DriverManager.getConnection ("jdbc:mysql://localhost:3306/agencia?user=root&password=rose@1988")
           return connection;
	
	public static void main (String [] args) throw Exception{
		
			
		//recupera a conexão com o banco
		Connection con = createConnectionMySQL();
		
		// teste de conexão
		if (con != null) {
		System.out.println(con + "\n**** Conexão bem Sucedida****\n");
		con.close();

	}
}