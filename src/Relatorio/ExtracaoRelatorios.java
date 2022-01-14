
package Relatorio;

import banco.ConexaoBD;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import users.Paciente;


public class ExtracaoRelatorios {
    
    // Métodos para a contagem de vacinas aplicadas em ambas as doses;
    
    // Método que faz a contagem de pacientes vacinados na faixa etária de maiores de 90 anos!
    public static int contaVacinados90Anos(String d1, String d2) throws Exception{
        String sql = "SELECT COUNT(*) FROM tb_paciente WHERE dataVacinacao BETWEEN ('" + d1 + "') AND ('" + d2 + "') AND idade >= 90;";
        int r2;
        // Pega a contagem para a primeira dose.
        try (Connection conexao = ConexaoBD.obtemConexao();  PreparedStatement ps = conexao.prepareStatement(sql)) {
            ResultSet rs = ps.executeQuery();
            rs.next();
            int r1 = Integer.parseInt(rs.getString(1));
            
        // Pega a contagem para a segunda dose.    
            String sql2 = "SELECT COUNT(*) FROM tb_paciente WHERE dataVacinacao2Dose BETWEEN ('" + d1 + "') AND ('" + d2 + "') AND idade >= 90;";
            try (Connection conexao2 = ConexaoBD.obtemConexao();  PreparedStatement ps2 = conexao.prepareStatement(sql2)) {
            ResultSet rs2 = ps2.executeQuery();
            rs2.next();
            r2 = Integer.parseInt(rs2.getString(1));
        }
        // Soma os resultados!    
            return r1 + r2;
        }
        
    }
    
    
    
    // Método que faz a contagem de pacientes vacinados na faixa etária entre 70 e 89 anos!
    public static int contaVacinados70Anos89(String d1, String d2) throws Exception{
            String sql = "SELECT COUNT(*) FROM tb_paciente WHERE dataVacinacao BETWEEN ('" + d1 + "') AND ('" + d2 + "') AND idade BETWEEN 70 AND 89;";
            int r2;
            try (Connection conexao = ConexaoBD.obtemConexao();  PreparedStatement ps = conexao.prepareStatement(sql)) {
            ResultSet rs = ps.executeQuery();
            rs.next();
            int r1 = Integer.parseInt(rs.getString(1));
            
            String sql2 = "SELECT COUNT(*) FROM tb_paciente WHERE dataVacinacao2Dose BETWEEN ('" + d1 + "') AND ('" + d2 + "') AND idade BETWEEN 70 AND 89;";
            try (Connection conexao2 = ConexaoBD.obtemConexao();  PreparedStatement ps2 = conexao.prepareStatement(sql2)) {
            ResultSet rs2 = ps2.executeQuery();
            rs2.next();
            r2 = Integer.parseInt(rs2.getString(1));
        }
            return r1 + r2;
        }
        
    }
    
    // Método que faz a contagem de pacientes vacinados na faixa etária entre 50 e 69 anos!
    public static int contaVacinados50Anos69(String d1, String d2) throws Exception{
          String sql = "SELECT COUNT(*) FROM tb_paciente WHERE dataVacinacao BETWEEN ('" + d1 + "') AND ('" + d2 + "') AND idade BETWEEN 50 AND 69;";
            int r2;
            try (Connection conexao = ConexaoBD.obtemConexao();  PreparedStatement ps = conexao.prepareStatement(sql)) {
            ResultSet rs = ps.executeQuery();
            rs.next();
            int r1 = Integer.parseInt(rs.getString(1));
            
            String sql2 = "SELECT COUNT(*) FROM tb_paciente WHERE dataVacinacao2Dose BETWEEN ('" + d1 + "') AND ('" + d2 + "') AND idade BETWEEN 50 AND 69;";
            try (Connection conexao2 = ConexaoBD.obtemConexao();  PreparedStatement ps2 = conexao.prepareStatement(sql2)) {
            ResultSet rs2 = ps2.executeQuery();
            rs2.next();
            r2 = Integer.parseInt(rs2.getString(1));
        }
            return r1 + r2;
        }
    }
    
    // Método que faz a contagem de pacientes vacinados na faixa etária para menores de 50 anos!
    public static int contaVacinadosMenor50(String d1, String d2) throws Exception{
        String sql = "SELECT COUNT(*) FROM tb_paciente WHERE dataVacinacao BETWEEN ('" + d1 + "') AND ('" + d2 + "') AND idade <= 49;";
            int r2;
            try (Connection conexao = ConexaoBD.obtemConexao();  PreparedStatement ps = conexao.prepareStatement(sql)) {
            ResultSet rs = ps.executeQuery();
            rs.next();
            int r1 = Integer.parseInt(rs.getString(1));
            
            String sql2 = "SELECT COUNT(*) FROM tb_paciente WHERE dataVacinacao2Dose BETWEEN ('" + d1 + "') AND ('" + d2 + "') AND idade <= 49;";
            try (Connection conexao2 = ConexaoBD.obtemConexao();  PreparedStatement ps2 = conexao.prepareStatement(sql2)) {
            ResultSet rs2 = ps2.executeQuery();
            rs2.next();
            r2 = Integer.parseInt(rs2.getString(1));
        }
            return r1 + r2;
        }
    }
    
    
    // Métodos para a contagem de pacientes vacinados com a 1º Dose;
    public static int contaVacinados1Dose90Anos(String d1, String d2) throws Exception{
        String sql = "SELECT COUNT(*) FROM tb_paciente WHERE dataVacinacao BETWEEN ('" + d1 + "') AND ('" + d2 + "') AND idade >= 90;";
            
            try (Connection conexao = ConexaoBD.obtemConexao();  PreparedStatement ps = conexao.prepareStatement(sql)) {
            ResultSet rs = ps.executeQuery();
            rs.next();
            int r1 = Integer.parseInt(rs.getString(1));
            return r1;
            }
    }
    
    public static int contaVacinados1Dose70Anos89(String d1, String d2) throws Exception{
        String sql = "SELECT COUNT(*) FROM tb_paciente WHERE dataVacinacao BETWEEN ('" + d1 + "') AND ('" + d2 + "') AND idade BETWEEN 70 AND 89;";          
            try (Connection conexao = ConexaoBD.obtemConexao();  PreparedStatement ps = conexao.prepareStatement(sql)) {
            ResultSet rs = ps.executeQuery();
            rs.next();
            int r1 = Integer.parseInt(rs.getString(1));
            return r1;
            }
    }
    
    public static int contaVacinados1Dose50Anos69(String d1, String d2) throws Exception{
        String sql = "SELECT COUNT(*) FROM tb_paciente WHERE dataVacinacao BETWEEN ('" + d1 + "') AND ('" + d2 + "') AND idade BETWEEN 50 AND 69;";          
            try (Connection conexao = ConexaoBD.obtemConexao();  PreparedStatement ps = conexao.prepareStatement(sql)) {
            ResultSet rs = ps.executeQuery();
            rs.next();
            int r1 = Integer.parseInt(rs.getString(1));
            return r1;
            }
    }
    
    public static int contaVacinados1Dose50Anos(String d1, String d2) throws Exception{
        String sql = "SELECT COUNT(*) FROM tb_paciente WHERE dataVacinacao BETWEEN ('" + d1 + "') AND ('" + d2 + "') AND idade <= 49;";          
            try (Connection conexao = ConexaoBD.obtemConexao();  PreparedStatement ps = conexao.prepareStatement(sql)) {
            ResultSet rs = ps.executeQuery();
            rs.next();
            int r1 = Integer.parseInt(rs.getString(1));
            return r1;
            }
    }
    
    
    // Métodos para a contagem de Pacientes vacinados com a 2º Dose;
    public static int contaVacinados2Dose90Anos(String d1, String d2) throws Exception{
        String sql = "SELECT COUNT(*) FROM tb_paciente WHERE dataVacinacao2Dose BETWEEN ('" + d1 + "') AND ('" + d2 + "') AND idade >= 90;";
            
            try (Connection conexao = ConexaoBD.obtemConexao();  PreparedStatement ps = conexao.prepareStatement(sql)) {
            ResultSet rs = ps.executeQuery();
            rs.next();
            int r1 = Integer.parseInt(rs.getString(1));
            return r1;
            }
    }
    
    public static int contaVacinados2Dose70Anos89(String d1, String d2) throws Exception{
        String sql = "SELECT COUNT(*) FROM tb_paciente WHERE dataVacinacao2Dose BETWEEN ('" + d1 + "') AND ('" + d2 + "') AND idade BETWEEN 70 AND 89;";          
            try (Connection conexao = ConexaoBD.obtemConexao();  PreparedStatement ps = conexao.prepareStatement(sql)) {
            ResultSet rs = ps.executeQuery();
            rs.next();
            int r1 = Integer.parseInt(rs.getString(1));
            return r1;
            }
    }
    
    public static int contaVacinados2Dose50Anos69(String d1, String d2) throws Exception{
        String sql = "SELECT COUNT(*) FROM tb_paciente WHERE dataVacinacao2Dose BETWEEN ('" + d1 + "') AND ('" + d2 + "') AND idade BETWEEN 50 AND 69;";          
            try (Connection conexao = ConexaoBD.obtemConexao();  PreparedStatement ps = conexao.prepareStatement(sql)) {
            ResultSet rs = ps.executeQuery();
            rs.next();
            int r1 = Integer.parseInt(rs.getString(1));
            return r1;
            }
    }
    
    public static int contaVacinados2Dose50Anos(String d1, String d2) throws Exception{
        String sql = "SELECT COUNT(*) FROM tb_paciente WHERE dataVacinacao2Dose BETWEEN ('" + d1 + "') AND ('" + d2 + "') AND idade <= 49;";          
            try (Connection conexao = ConexaoBD.obtemConexao();  PreparedStatement ps = conexao.prepareStatement(sql)) {
            ResultSet rs = ps.executeQuery();
            rs.next();
            int r1 = Integer.parseInt(rs.getString(1));
            return r1;
            }
    }
    
}
