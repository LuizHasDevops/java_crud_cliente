package factories;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionFactory {
	
	public static Connection getConnetion() throws Exception {
		
		// configurar o driver (conector) necessario para a conexão com o PostgreSQL.
				Class.forName("org.postgresql.Driver");

				// configurar o endereço do bd usuario e senha de acesso.
				return DriverManager.getConnection
						("jdbc:postgresql://localhost:5432/bd_aula04", "postgres","coti");

	}

}
