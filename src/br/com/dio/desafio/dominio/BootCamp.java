package br.com.dio.desafio.dominio;

import java.time.LocalDate;
import java.util.*;

public class BootCamp {
    private String nome;
    private String descricao;
    private LocalDate dataInicial = LocalDate.now();
    private LocalDate dataFinal = dataInicial.plusDays(45);
    private Set<Conteudo> conteudos = new LinkedHashSet<>();
    private Set<Dev> devs = new HashSet<>();

    public BootCamp(String nome, String descricao) {
        this.nome = nome;
        this.descricao = descricao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public LocalDate getDataInicial() {
        return dataInicial;
    }

    public void setDataInicial(LocalDate dataInicial) {
        this.dataInicial = dataInicial;
    }

    public LocalDate getDataFinal() {
        return dataFinal;
    }

    public void setDataFinal(LocalDate dataFinal) {
        this.dataFinal = dataFinal;
    }

    public Set<Conteudo> getConteudos() {
        return conteudos;
    }

    public void setConteudos(Set<Conteudo> conteudos) {
        this.conteudos = conteudos;
    }

    public Set<Dev> getDevs() {
        return devs;
    }

    public void setDevs(Set<Dev> devs) {
        this.devs = devs;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof BootCamp bootCamp)) return false;
        return Objects.equals(nome, bootCamp.nome) && Objects.equals(descricao, bootCamp.descricao) && Objects.equals(dataInicial, bootCamp.dataInicial) && Objects.equals(dataFinal, bootCamp.dataFinal) && Objects.equals(conteudos, bootCamp.conteudos) && Objects.equals(devs, bootCamp.devs);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, descricao, dataInicial, dataFinal, conteudos, devs);
    }
}
