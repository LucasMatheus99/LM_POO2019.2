package modelo;

import java.util.Objects;

public class Povo {

    private String nome;
    private String cpf;
    private String profissão;
    private String curso;

    public Povo(String nome, String cpf, String profissão, String curso) {
        this.nome = nome;
        this.cpf = cpf;
        this.profissão = profissão;
        this.curso = curso;
    }

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

    public String getProfissão() {
        return profissão;
    }

    public void setProfissão(String profissão) {
        this.profissão = profissão;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

}
