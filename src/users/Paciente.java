package users;

import java.sql.Date;

public class Paciente {

    //Atributos do Paciente:
    public int codigo;
    public String nome;
    public String cpf;
    public Date nascto;
    public String nasctoo;
    public String vacinacao;
    public String vacinacao2;
    public String email;
    public String cep;
    public String rua;
    public int numero;
    public String complemento;
    public String bairro;
    public String cidade;
    public String estado;
    public int idade;
    public String profissao;
    public boolean areaSaude;
    public String telefone;
    public int dose;
    public boolean vacinado;
    public int prioridade;

    // Construtores do Paciente:
    public Paciente() {
    }

    public Paciente(int codigo) {
        this.codigo = codigo;
    }

    public Paciente(int codigo, String vacinacao, int dose) {
        this.codigo = codigo;
        this.vacinacao = vacinacao;
        this.dose = dose;
    }

    public Paciente(String nome, String cpf, String nasctoo, String email, String cep, String rua, int numero, String complemento, String bairro, String cidade, String estado, boolean areaSaude, String telefone, int dose) {
        this.nome = nome;
        this.cpf = cpf;
        this.nasctoo = nasctoo;
        this.email = email;
        this.cep = cep;
        this.rua = rua;
        this.numero = numero;
        this.complemento = complemento;
        this.bairro = bairro;
        this.cidade = cidade;
        this.estado = estado;
        this.areaSaude = areaSaude;
        this.telefone = telefone;
        this.dose = dose;
    }

    public Paciente(String nome, String cpf, String nasctoo, String email, String cep, String rua, int numero, String complemento, String bairro, String cidade, String estado, String profissao, String telefone, int dose) {
        this.nome = nome;
        this.cpf = cpf;
        this.nasctoo = nasctoo;
        this.email = email;
        this.cep = cep;
        this.rua = rua;
        this.numero = numero;
        this.complemento = complemento;
        this.bairro = bairro;
        this.cidade = cidade;
        this.estado = estado;
        this.profissao = profissao;
        this.telefone = telefone;
        this.dose = dose;
    }

    public Paciente(String nome, String cpf, String nasctoo, String email, String cep, String rua, int numero, String complemento, String bairro, String cidade, String estado, String profissao, String telefone) {
        this.nome = nome;
        this.cpf = cpf;
        this.nasctoo = nasctoo;
        this.email = email;
        this.cep = cep;
        this.rua = rua;
        this.numero = numero;
        this.complemento = complemento;
        this.bairro = bairro;
        this.cidade = cidade;
        this.estado = estado;
        this.profissao = profissao;
        this.telefone = telefone;
    }

    public Paciente(String nome, String cpf, String email, String cep, String rua, int numero, String complemento, String bairro, String cidade, String estado, String profissao, String telefone, int dose) {
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
        this.cep = cep;
        this.rua = rua;
        this.numero = numero;
        this.complemento = complemento;
        this.bairro = bairro;
        this.cidade = cidade;
        this.estado = estado;
        this.profissao = profissao;
        this.telefone = telefone;
        this.dose = dose;
    }

    public Paciente(String nome, String cpf, Date nascto, String email, String cep, String rua, int numero, String complemento, String bairro, String cidade, String estado, String profissao, String telefone, int dose) {
        this.nome = nome;
        this.cpf = cpf;
        this.nascto = nascto;
        this.email = email;
        this.cep = cep;
        this.rua = rua;
        this.numero = numero;
        this.complemento = complemento;
        this.bairro = bairro;
        this.cidade = cidade;
        this.estado = estado;
        this.profissao = profissao;
        this.telefone = telefone;
        this.dose = dose;
    }

    public Paciente(String nome, String cpf, String nasctoo, String email, String cep, String rua, int numero, String complemento, String bairro, String cidade, String estado, int idade, boolean areaSaude, String telefone, int dose, int prioridade) {
        this.nome = nome;
        this.cpf = cpf;
        this.nasctoo = nasctoo;
        this.email = email;
        this.cep = cep;
        this.rua = rua;
        this.numero = numero;
        this.complemento = complemento;
        this.bairro = bairro;
        this.cidade = cidade;
        this.estado = estado;
        this.idade = idade;
        this.areaSaude = areaSaude;
        this.telefone = telefone;
        this.dose = dose;
        this.prioridade = prioridade;
        //esse é o certo
    }

    // Getters & Setters:
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Date getNascto() {
        return nascto;
    }

    public void setNascto(Date nascto) {
        this.nascto = nascto;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getProfissao() {
        return profissao;
    }

    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public int getDose() {
        return dose;
    }

    public void setDose(int dose) {
        this.dose = dose;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNasctoo() {
        return nasctoo;
    }

    public void setNasctoo(String nasctoo) {
        this.nasctoo = nasctoo;
    }

    public boolean isAreaSaude() {
        return areaSaude;
    }

    public void setAreaSaude(boolean areaSaude) {
        this.areaSaude = areaSaude;
    }

    public String getVacinacao() {
        return vacinacao;
    }

    public void setVacinacao(String vacinacao) {
        this.vacinacao = vacinacao;
    }

    public String getVacinacao2() {
        return vacinacao2;
    }

    public void setVacinacao2(String vacinacao2) {
        this.vacinacao2 = vacinacao2;
    }

    public int getPrioridade() {
        return prioridade;
    }

    public void setPrioridade(int prioridade) {
        this.prioridade = prioridade;
    }

    public boolean isVacinado() {
        return vacinado;
    }

    public void setVacinado(boolean vacinado) {
        this.vacinado = vacinado;
    }
}
