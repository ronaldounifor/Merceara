package model;

import state.*;

public class Comprador {
    private int CPF;
    private String nome;
    private Estado estado;
    private int numeroPontos;
    
    public Comprador(int CPF, String nome, int numeroPontos) {
        this.CPF = CPF;
        this.nome = nome;
        this.numeroPontos = numeroPontos;

        if(numeroPontos >= 1000)
            this.estado = new Ouro(this);
        else if(numeroPontos >= 500)
            this.estado = new Prata(this);
        else if(numeroPontos >= 300)
            this.estado = new Bronze(this);
        else if(numeroPontos > 0)
            this.estado = new Cobre(this);
        else
            this.estado = new Visitante(this);
    }

    public void pontuar() {
        numeroPontos += estado.getPontos();
        estado.tratar();
    }

    public int getCPF() {
        return CPF;
    }
    public void setCPF(int CPF) {
        this.CPF = CPF;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getNumeroPontos() {
        return numeroPontos;
    }
    public void setNumeroPontos(int numeroPontos) {
        this.numeroPontos = numeroPontos;
        estado.tratar();
    }
    public Estado getEstado() {
        return estado;
    }
    public void setEstado(Estado estado) {
        this.estado = estado;
    }
}
