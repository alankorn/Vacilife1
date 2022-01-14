package users;

import banco.DAO;

public class Usuario {
    
    // Atributos de Usuários;
    public String nome;
    public int id;
    public String email;
    public String senha;
    public boolean admin;

    // Construtores de Usuários;
    public Usuario(String nome, int id, String email, String senha, boolean admin) {
        this.nome = nome;
        this.id = id;
        this.email = email;
        this.senha = senha;
        this.admin = admin;
    }

    public Usuario() {
    }

    public Usuario(int id, String senha) {
        this.id = id;
        this.senha = senha;
    }

    public Usuario(String nome, int id, String email) {
        this.nome = nome;
        this.id = id;
        this.email = email;
    }

    public Usuario(int id) {
        this.id = id;
    }

    public Usuario(String nome, String email, String senha) {
        this.nome = nome;
        this.email = email;
        this.senha = senha;
    }

    public Usuario(String nome, int id, String email, String senha) {
        this.nome = nome;
        this.id = id;
        this.email = email;
        this.senha = senha;
    }

    public Usuario(String nome, String email, String senha, boolean admin) {
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.admin = admin;
    }

    public Usuario(String nome) {
        this.nome = nome;
    }

    public Usuario(String email, String senha) {
        this.email = email;
        this.senha = senha;
    }
    
    // Getters & Setters de Usuários;
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public boolean isAdmin() {
        return admin;
    }

    public void setAdmin(boolean admin) {
        this.admin = admin;
    }
}
