package banco;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Vector;
import users.Usuario;
import users.Paciente;
import java.util.Date;
import javax.swing.JOptionPane;

public class DAO {

    public static boolean existeUsuarioAdmin(Usuario user) throws Exception { // Verifica se o usuário existe na tabela de adm.
        //definir string de consulta
        String sql = "SELECT * FROM tb_administrador WHERE email =? AND senha =?"; //? = placeholder

        try ( Connection con = ConexaoBD.obtemConexao();  PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setString(1, user.getEmail());
            ps.setString(2, user.getSenha());
            
            try ( ResultSet rs = ps.executeQuery()) {
                return rs.next();
            }
        }

    }
    
    public static String pegaNomeAdmin(Usuario user) throws Exception{
        String sql = "SELECT * FROM tb_administrador WHERE email =? AND senha =?"; //? = placeholder

        Usuario adm = new Usuario();
        try ( Connection conexao = ConexaoBD.obtemConexao();  PreparedStatement ps = conexao.prepareStatement(sql)) {
            ps.setString(1, user.getEmail());
            ps.setString(2, user.getSenha());
            
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                adm.setNome(rs.getString("nome"));
            }
            return adm.getNome();
        }
    }
    
    public static String pegaNomeAtd(Usuario user) throws Exception{
        String sql = "SELECT * FROM tb_atendente WHERE email =? AND senha =?"; //? = placeholder

        Usuario atd = new Usuario();
        try ( Connection conexao = ConexaoBD.obtemConexao();  PreparedStatement ps = conexao.prepareStatement(sql)) {
            ps.setString(1, user.getEmail());
            ps.setString(2, user.getSenha());
            
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                atd.setNome(rs.getString("nome"));
            }
            return atd.getNome();
        }
    }

    public static boolean existeUsuarioAtendente(Usuario user) throws Exception { // Verifica se o usuário existe na tabela de atd.
        //definir string de consulta
        String sql = "SELECT * FROM tb_atendente WHERE email =? AND senha =?"; //? = placeholder

        try ( Connection con = ConexaoBD.obtemConexao();  PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setString(1, user.getEmail());
            ps.setString(2, user.getSenha());

            try ( ResultSet rs = ps.executeQuery()) {
                return rs.next();
            }
        }

    }

    public void inserirAdmin(Usuario adm) throws Exception { // Cadastra administrador!
        String sql = "INSERT INTO tb_administrador (nome, email, senha) VALUES (?, ?, ?);";
        try ( Connection conexao = ConexaoBD.obtemConexao();  PreparedStatement ps = conexao.prepareStatement(sql)) {
            ps.setString(1, adm.getNome());
            ps.setString(2, adm.getEmail());
            ps.setString(3, adm.getSenha());
            ps.execute();
        }

    }

    public ArrayList<Usuario> mostraUsuarioAdm() throws Exception { // Apresenta na tabela os adm cadastrados!
        String sql = "SELECT * FROM tb_administrador;";
        ArrayList<Usuario> admin = new ArrayList<>();
        try ( Connection conexao = ConexaoBD.obtemConexao();  PreparedStatement ps = conexao.prepareStatement(sql)) {
            ResultSet rs = null;
            rs = ps.executeQuery();

            while (rs.next()) {
                Usuario adm = new Usuario();
                adm.setId(rs.getInt("codigo"));
                adm.setNome(rs.getString("nome"));
                adm.setEmail(rs.getString("email"));
                admin.add(adm);
            }

        }
        return admin;
    }

    public void inserirAtendente(Usuario atd) throws Exception { // Cadastra atendente!
        String sql = "INSERT INTO tb_atendente (nome, email, senha) VALUES (?, ?, ?);"; // Código sql do banco;
        try ( Connection conexao = ConexaoBD.obtemConexao();  PreparedStatement ps = conexao.prepareStatement(sql)) { // Faz conexão com o banco;
            ps.setString(1, atd.getNome()); // Seta uma nova informação, no índici i;
            ps.setString(2, atd.getEmail());
            ps.setString(3, atd.getSenha());
            ps.execute();
        }
    }

    public ArrayList<Usuario> mostraUsuarioAtd() throws Exception { // Mostra atendentes cadastrados na tabela!
        String sql = "SELECT * FROM tb_atendente;"; // Código sql do banco;
        ArrayList<Usuario> atendente = new ArrayList<>();
        try ( Connection conexao = ConexaoBD.obtemConexao();  PreparedStatement ps = conexao.prepareStatement(sql)) { // PS é a inserção no banco;
            ResultSet rs = null; // Guarda dados vindos de um banco de dados;
            rs = ps.executeQuery();

            while (rs.next()) { // Seta as informações de que precisamos;
                Usuario atd = new Usuario();
                atd.setId(rs.getInt("codigo"));
                atd.setNome(rs.getString("nome"));
                atd.setEmail(rs.getString("email"));
                atendente.add(atd);
            }
        }
        return atendente;
    }
    
    public void inserirPaciente(Paciente paciente) throws Exception { // Cadastra Paciente!
        String sql = "INSERT INTO tb_paciente (nome, cpf, dataNascimento, telefone, profissao, email, rua, numeroCasa, complemento, bairro, cep,"
                + "cidade, estado, dose, idade, prioridade) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);"; // Código sql do banco;
        try ( Connection conexao = ConexaoBD.obtemConexao();  PreparedStatement ps = conexao.prepareStatement(sql)) { // Faz conexão com o banco;
            ps.setString(1, paciente.getNome()); // Seta uma nova informação, no índice i;
            ps.setString(2, paciente.getCpf());
            ps.setString(3, paciente.getNasctoo());
            ps.setString(4, paciente.getTelefone());
            ps.setBoolean(5, paciente.isAreaSaude());
            ps.setString(6, paciente.getEmail());
            ps.setString(7, paciente.getRua());
            ps.setInt(8, paciente.getNumero());
            ps.setString(9, paciente.getComplemento());
            ps.setString(10, paciente.getBairro());
            ps.setString(11, paciente.getCep());
            ps.setString(12, paciente.getCidade());
            ps.setString(13, paciente.getEstado());
            ps.setInt(14, paciente.getDose());
            ps.setInt(15, paciente.getIdade());
            ps.setInt(16, paciente.getPrioridade());
            ps.execute();
        }
    }

    public ArrayList<Paciente> mostraPaciente() throws Exception { // Mostra todos os pacientes cadastrados na tabela!
        String sql = "select * from tb_paciente;"; // Código sql do banco;
        ArrayList<Paciente> paciente = new ArrayList<>();
        try ( Connection conexao = ConexaoBD.obtemConexao();  PreparedStatement ps = conexao.prepareStatement(sql)) { // PS é a inserção no banco;
            ResultSet rs = null; // Guarda dados vindos de um banco de dados;
            rs = ps.executeQuery();

            while (rs.next()) { // Seta as informações de que precisamos;
                Paciente pct = new Paciente();
                pct.setCodigo(rs.getInt("codigo"));
                pct.setNome(rs.getString("nome"));
                pct.setEmail(rs.getString("email"));
                pct.setCpf(rs.getString("cpf"));
                pct.setTelefone(rs.getString("telefone"));
                pct.setNasctoo(rs.getString("dataNascimento"));
                pct.setAreaSaude(rs.getBoolean("profissao"));
                pct.setIdade(rs.getInt("idade"));
                pct.setTelefone(rs.getString("telefone"));
                pct.setRua(rs.getString("rua"));
                pct.setNumero(rs.getInt("numeroCasa"));
                pct.setComplemento(rs.getString("complemento"));
                pct.setBairro(rs.getString("bairro"));
                pct.setCep(rs.getString("cep"));
                pct.setCidade(rs.getString("cidade"));
                pct.setEstado(rs.getString("estado"));
                pct.setVacinacao(rs.getString("dataVacinacao"));
                pct.setDose(rs.getInt("dose"));
                pct.setIdade(rs.getInt("idade"));
                pct.setPrioridade(rs.getInt("prioridade"));
                pct.setVacinacao2(rs.getString("dataVacinacao2Dose"));

                paciente.add(pct);
            }
        }
        return paciente;
    }

    public ArrayList<Paciente> mostraPacienteDose1() throws Exception { // Mostra apenas pacientes da 1º Dose;
        String sql = "select * from tb_paciente WHERE dose = 1 ORDER BY prioridade ASC, idade DESC"; // Código sql do banco;
        ArrayList<Paciente> paciente = new ArrayList<>();
        try ( Connection conexao = ConexaoBD.obtemConexao();  PreparedStatement ps = conexao.prepareStatement(sql)) { // PS é a inserção no banco;
            ResultSet rs = null; // Guarda dados vindos de um banco de dados;
            rs = ps.executeQuery();

            while (rs.next()) { // Seta as informações de que precisamos;
                Paciente pct = new Paciente();
                pct.setCodigo(rs.getInt("codigo"));
                pct.setNome(rs.getString("nome"));
                pct.setEmail(rs.getString("email"));
                pct.setCpf(rs.getString("cpf"));
                pct.setTelefone(rs.getString("telefone"));
                pct.setNasctoo(rs.getString("dataNascimento"));
                pct.setAreaSaude(rs.getBoolean("profissao"));
                pct.setIdade(rs.getInt("idade"));

                paciente.add(pct);
            }
        }
        return paciente;
    }

    public ArrayList<Paciente> mostraPacienteDose2() throws Exception { // Mostra apenas pacientes para a 2º Dose;
        String sql = "select * from tb_paciente WHERE dose = 2 ORDER BY prioridade ASC, idade DESC"; // Código sql do banco;
        ArrayList<Paciente> paciente = new ArrayList<>();
        try ( Connection conexao = ConexaoBD.obtemConexao();  PreparedStatement ps = conexao.prepareStatement(sql)) { // PS é a inserção no banco;
            ResultSet rs = null; // Guarda dados vindos de um banco de dados;
            rs = ps.executeQuery();

            while (rs.next()) { // Seta as informações de que precisamos;
                Paciente pct = new Paciente();
                pct.setCodigo(rs.getInt("codigo"));
                pct.setNome(rs.getString("nome"));
                pct.setEmail(rs.getString("email"));
                pct.setCpf(rs.getString("cpf"));
                pct.setTelefone(rs.getString("telefone"));
                pct.setNasctoo(rs.getString("dataNascimento"));
                pct.setAreaSaude(rs.getBoolean("profissao"));
                pct.setIdade(rs.getInt("idade"));

                paciente.add(pct);
            }
        }
        return paciente;
    }

    public void vacinaPacienteDose1(Paciente p) throws Exception { // Confirma vacinação da 1º Dose;
        String sql = "UPDATE tb_paciente SET dataVacinacao = ?, dose = ? WHERE codigo = ?";
        try ( Connection conexao = ConexaoBD.obtemConexao();  PreparedStatement ps = conexao.prepareStatement(sql)) {
            ps.setString(1, p.getVacinacao());
            ps.setInt(2, p.getDose());
            ps.setInt(3, p.getCodigo());
            ps.execute();
        }
    }

    public void vacinaPacienteDose2(Paciente p) throws Exception { // Confirma vacinação da 2º Dose;
        String sql = "UPDATE tb_paciente SET dataVacinacao2Dose = ?, dose = ? WHERE codigo = ?";
        try ( Connection conexao = ConexaoBD.obtemConexao();  PreparedStatement ps = conexao.prepareStatement(sql)) {
            ps.setString(1, p.getVacinacao());
            ps.setInt(2, p.getDose());
            ps.setInt(3, p.getCodigo());
            ps.execute();
        }
    }

    public void removerAdm(Usuario adm) throws Exception { // Remove adm;
        String sql = "DELETE FROM tb_administrador WHERE codigo = ?";
        try ( Connection conexao = ConexaoBD.obtemConexao();  PreparedStatement ps = conexao.prepareStatement(sql);) {
            ps.setInt(1, adm.getId());
            ps.execute();
        }
    }

    public void removerAtd(Usuario atd) throws Exception { // Remove atd;
        String sql = "DELETE FROM tb_atendente WHERE codigo = ?";
        try ( Connection conexao = ConexaoBD.obtemConexao();  PreparedStatement ps = conexao.prepareStatement(sql);) {
            ps.setInt(1, atd.getId());
            ps.execute();
        }
    }

    public void removerPaciente(Paciente p) throws Exception { // Remove paciente;
        String sql = "DELETE FROM tb_paciente WHERE codigo = ?";
        try ( Connection conexao = ConexaoBD.obtemConexao();  PreparedStatement ps = conexao.prepareStatement(sql);) {
            ps.setInt(1, p.getCodigo());
            ps.execute();
        }
    }

    public void atualizarAdm(Usuario adm) throws Exception { // Atualiza adm;
        String sql = "UPDATE tb_administrador SET nome = ?, email = ? WHERE codigo = ?";
        try ( Connection conexao = ConexaoBD.obtemConexao();  PreparedStatement ps = conexao.prepareStatement(sql)) {
            ps.setString(1, adm.getNome());
            ps.setString(2, adm.getEmail());
            ps.setInt(3, adm.getId());
            ps.execute();
        }
    }

    public void atualizarSenhaAdm(Usuario adm) throws Exception { // Atualiza senha do adm;
        String sql = "UPDATE tb_administrador SET senha = ? WHERE codigo = ?";
        try ( Connection conexao = ConexaoBD.obtemConexao();  PreparedStatement ps = conexao.prepareStatement(sql)) {
            ps.setString(1, adm.getSenha());
            ps.setInt(2, adm.getId());
            ps.execute();
        }
    }

    //Método pesquisar por nome Atendente
    public ArrayList<Usuario> buscarAtdPorNome(String nome) throws Exception {

        try ( Connection conexao = ConexaoBD.obtemConexao()) {
            ArrayList<Usuario> atendente = new ArrayList<>();

            String sql = "SELECT * FROM tb_atendente WHERE nome LIKE ?";
            PreparedStatement ps = conexao.prepareStatement(sql);
            ps.setString(1, nome);

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Usuario atd = new Usuario();
                atd.setId(rs.getInt("codigo"));
                atd.setNome(rs.getString("nome"));
                atd.setEmail(rs.getString("email"));
                atendente.add(atd);
            }
            return atendente;
        }

    }

    //Método pesquisar por nome Administrador
    public ArrayList<Usuario> buscarAdmPorNome(String nome) throws Exception {

        try ( Connection conexao = ConexaoBD.obtemConexao()) {
            ArrayList<Usuario> admin = new ArrayList<>();

            String sql = "SELECT * FROM tb_administrador WHERE nome LIKE ?";
            PreparedStatement ps = conexao.prepareStatement(sql);
            ps.setString(1, nome);

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Usuario atd = new Usuario();
                atd.setId(rs.getInt("codigo"));
                atd.setNome(rs.getString("nome"));
                atd.setEmail(rs.getString("email"));
                admin.add(atd);
            }
            return admin;
        }

    }

    // Busca paciente por nome na tabela geral de pacientes cadastrados;
    public ArrayList<Paciente> buscarPacienteCadastrado(String nome) throws Exception { // Busca paciente na tabela por nome;

        try ( Connection conexao = ConexaoBD.obtemConexao()) {

            ArrayList<Paciente> paciente = new ArrayList<>();

            String sql = "SELECT * FROM tb_paciente WHERE nome LIKE ?";
            PreparedStatement ps = conexao.prepareStatement(sql);
            ps.setString(1, nome);

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Paciente pct = new Paciente();
                pct.setCodigo(rs.getInt("codigo"));
                pct.setNome(rs.getString("nome"));
                pct.setEmail(rs.getString("email"));
                pct.setCpf(rs.getString("cpf"));
                pct.setTelefone(rs.getString("telefone"));
                pct.setNasctoo(rs.getString("dataNascimento"));
                pct.setAreaSaude(rs.getBoolean("profissao"));
                pct.setIdade(rs.getInt("idade"));
                pct.setTelefone(rs.getString("telefone"));
                pct.setRua(rs.getString("rua"));
                pct.setNumero(rs.getInt("numeroCasa"));
                pct.setComplemento(rs.getString("complemento"));
                pct.setBairro(rs.getString("bairro"));
                pct.setCep(rs.getString("cep"));
                pct.setCidade(rs.getString("cidade"));
                pct.setEstado(rs.getString("estado"));
                pct.setVacinacao(rs.getString("dataVacinacao"));
                pct.setDose(rs.getInt("dose"));
                pct.setIdade(rs.getInt("idade"));
                pct.setPrioridade(rs.getInt("prioridade"));
                pct.setVacinacao2(rs.getString("dataVacinacao2Dose"));
                paciente.add(pct);
            }
            return paciente;
        }

    }
    
    // Busca de Pacientes na fila da primeira dose;
    public ArrayList<Paciente> buscarPacienteNome(String nome) throws Exception { // Busca paciente na tabela por nome;

        try ( Connection conexao = ConexaoBD.obtemConexao()) {

            ArrayList<Paciente> paciente = new ArrayList<>();

            String sql = "SELECT * FROM tb_paciente WHERE dose = 1 AND nome LIKE ?";
            PreparedStatement ps = conexao.prepareStatement(sql);
            ps.setString(1, nome);

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Paciente pct = new Paciente();
                pct.setCodigo(rs.getInt("codigo"));
                pct.setNome(rs.getString("nome"));
                pct.setCpf(rs.getString("cpf"));
                pct.setNasctoo(rs.getString("dataNascimento"));
                pct.setIdade(rs.getInt("idade"));
                pct.setAreaSaude(rs.getBoolean("profissao"));
                paciente.add(pct);
            }
            return paciente;
        }

    }

    public ArrayList<Paciente> buscarPacienteCPF(String cpf) throws Exception { // Busca Paciente pelo CPF;

        try ( Connection conexao = ConexaoBD.obtemConexao()) {

            ArrayList<Paciente> paciente = new ArrayList<>();

            String sql = "SELECT * FROM tb_paciente WHERE dose = 1 AND cpf LIKE ?";
            PreparedStatement ps = conexao.prepareStatement(sql);
            ps.setString(1, cpf);

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Paciente pct = new Paciente();
                pct.setCodigo(rs.getInt("codigo"));
                pct.setNome(rs.getString("nome"));
                pct.setCpf(rs.getString("cpf"));
                pct.setNasctoo(rs.getString("dataNascimento"));
                pct.setIdade(rs.getInt("idade"));
                pct.setAreaSaude(rs.getBoolean("profissao"));
                paciente.add(pct);
            }
            return paciente;
        }

    }

    public ArrayList<Paciente> buscarPacienteIdade(int idade) throws Exception { // Busca paciente pela idade;

        try ( Connection conexao = ConexaoBD.obtemConexao()) {

            ArrayList<Paciente> paciente = new ArrayList<>();

            String sql = "SELECT * FROM tb_paciente WHERE dose = 1 AND idade LIKE ?";
            PreparedStatement ps = conexao.prepareStatement(sql);
            ps.setInt(1, idade);

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Paciente pct = new Paciente();
                pct.setCodigo(rs.getInt("codigo"));
                pct.setNome(rs.getString("nome"));
                pct.setCpf(rs.getString("cpf"));
                pct.setNasctoo(rs.getString("dataNascimento"));
                pct.setIdade(rs.getInt("idade"));
                pct.setAreaSaude(rs.getBoolean("profissao"));
                paciente.add(pct);
            }
            return paciente;
        }

    }

    // Busca pacientes na fila da segunda dose;
    public ArrayList<Paciente> buscarPacienteNome2Dose(String nome) throws Exception { // Busca paciente por nome na 2º Dose;

        try ( Connection conexao = ConexaoBD.obtemConexao()) {

            ArrayList<Paciente> paciente = new ArrayList<>();

            String sql = "SELECT * FROM tb_paciente WHERE dose = 2 AND nome LIKE ?";
            PreparedStatement ps = conexao.prepareStatement(sql);
            ps.setString(1, nome);

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Paciente pct = new Paciente();
                pct.setCodigo(rs.getInt("codigo"));
                pct.setNome(rs.getString("nome"));
                pct.setCpf(rs.getString("cpf"));
                pct.setNasctoo(rs.getString("dataNascimento"));
                pct.setIdade(rs.getInt("idade"));
                pct.setAreaSaude(rs.getBoolean("profissao"));
                paciente.add(pct);
            }
            return paciente;
        }

    }

    public ArrayList<Paciente> buscarPacienteCPF2Dose(String cpf) throws Exception { // Busca paciente por CPF na 2º Dose;

        try ( Connection conexao = ConexaoBD.obtemConexao()) {

            ArrayList<Paciente> paciente = new ArrayList<>();

            String sql = "SELECT * FROM tb_paciente WHERE dose = 2 AND cpf LIKE ?";
            PreparedStatement ps = conexao.prepareStatement(sql);
            ps.setString(1, cpf);

            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Paciente pct = new Paciente();
                pct.setCodigo(rs.getInt("codigo"));
                pct.setNome(rs.getString("nome"));
                pct.setCpf(rs.getString("cpf"));
                pct.setNasctoo(rs.getString("dataNascimento"));
                pct.setIdade(rs.getInt("idade"));
                pct.setAreaSaude(rs.getBoolean("profissao"));
                paciente.add(pct);

            }
            return paciente;
        }

    }

    public ArrayList<Paciente> buscarPacienteIdade2Dose(int idade) throws Exception { // Busca paciente por idade na 2º Dose;

        try ( Connection conexao = ConexaoBD.obtemConexao()) {

            ArrayList<Paciente> paciente = new ArrayList<>();

            String sql = "SELECT * FROM tb_paciente WHERE dose = 2 AND idade LIKE ?";
            PreparedStatement ps = conexao.prepareStatement(sql);
            ps.setInt(1, idade);

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Paciente pct = new Paciente();
                pct.setCodigo(rs.getInt("codigo"));
                pct.setNome(rs.getString("nome"));
                pct.setCpf(rs.getString("cpf"));
                pct.setNasctoo(rs.getString("dataNascimento"));
                pct.setIdade(rs.getInt("idade"));
                pct.setAreaSaude(rs.getBoolean("profissao"));
                paciente.add(pct);
            }
            return paciente;
        }

    }
    
    // Atualiza dados do atendente;
    public void atualizarAtd(Usuario atd) throws Exception { // Atualiza dados do atendente;
        String sql = "UPDATE tb_atendente SET nome = ?, email = ? WHERE codigo = ?";
        try ( Connection conexao = ConexaoBD.obtemConexao();  PreparedStatement ps = conexao.prepareStatement(sql)) {
            ps.setString(1, atd.getNome());
            ps.setString(2, atd.getEmail());
            ps.setInt(3, atd.getId());
            ps.execute();
        }
    }

    // Atualiza senha do atendente;
    public void atualizarSenhaAtd(Usuario atd) throws Exception { // Atualiza a senha do atendente;
        String sql = "UPDATE tb_atendente SET senha = ? WHERE codigo = ?";
        try ( Connection conexao = ConexaoBD.obtemConexao();  PreparedStatement ps = conexao.prepareStatement(sql)) {
            ps.setString(1, atd.getSenha());
            ps.setInt(2, atd.getId());
            ps.execute();
        }
    }

}
