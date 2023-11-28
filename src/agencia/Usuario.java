package agencia;

import java.time.LocalDate;
import java.util.LinkedList;

public class Usuario {

    // atributos da classe
    private String login;
    private String senha;
    private String nome;
    private String cpf;
    private int telefone;
    private String email;
    private LocalDate nascimento;
    private LinkedList<Pacote> listaPacotes;

    // construtor da classe
    public Usuario(){

    }
    public Usuario(String login, String senha, String nome, String cpf, int telefone, String email, LocalDate nascimento) {
        this.login = login;
        this.senha = senha;
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
        this.email = email;
        this.nascimento = nascimento;
    }

    // Métodos da classe

    // Getters para acessar os atributos privados
    public String getLogin() {
        return login;
    }

    public String getSenha() {
        return senha;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public int getTelefone() {
        return telefone;
    }

    public String getEmail() {
        return email;
    }

    public LocalDate getNascimento() {
        return nascimento;
    }

    // Métodos setters devem aceitar parâmetros
    public void setLogin(String login) {
        this.login = login;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setNascimento(LocalDate nascimento) {
        this.nascimento = nascimento;
    }
}