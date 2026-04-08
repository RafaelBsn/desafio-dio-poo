package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Mentoria extends Conteudo {
    private LocalDate data;

    public Mentoria(String titulo, String descricao) {
        setTitulo(titulo);
        setDescricao(descricao);
        setData(LocalDate.now());
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public LocalDate getData() {
        return data;
    }

    @Override
    public double calcularXp() {
        return xp_padrao + 20;
    }


    @Override
    public String toString() {
        return "Mentoria{" +
                "titulo='" + getTitulo() + '\'' +
                ", descricao='" + getDescricao() + '\'' +
                ", data='" + getData() + '\'' +
                ", xp='" + calcularXp() +
                '}';
    }
}
