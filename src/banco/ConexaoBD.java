package banco;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConexaoBD {

    private static String host = "remotemysql.com";
    private static String porta = "3306";
    private static String db = "1IpiYPHBEm";
    private static String usuario = "1IpiYPHBEm";
    private static String senha = "W1AIFDV6Wl";

    public static Connection obtemConexao() { // Faz a conexão com o banco de dados!
        try {

            Connection c = DriverManager.getConnection("jdbc:mysql://" + host + ":" + porta + "/" + db
                    + "?user=" + usuario + "&password=" + senha + "&useTimezone=true&serverTimezone=America/Sao_Paulo");
            return c;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
