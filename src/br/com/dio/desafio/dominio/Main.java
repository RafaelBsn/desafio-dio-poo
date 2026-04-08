package br.com.dio.desafio.dominio;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso("Java", "Javaooo", 48);
        Curso curso2 = new Curso("Jawwva", "Javaooo", 48);
        Mentoria mentoria = new Mentoria("aaaa", "aaaaa");

        BootCamp bootCamp1 = new BootCamp("Java Develpoer", "Descrição");
        bootCamp1.getConteudos().add(curso1);
        bootCamp1.getConteudos().add(curso2);
        bootCamp1.getConteudos().add(mentoria);

        Dev devRafael = new Dev("Rafael");
        devRafael.inscreverBootCamp(bootCamp1);
        int quantidadeConteudos = devRafael.getConteudosInscritos().size();

        System.out.println("Conteúdos inscritos " + devRafael.getNome() + ":  " + devRafael.getConteudosInscritos());
        System.out.println("=========================");
        while (quantidadeConteudos > 0){
            devRafael.progredir();
            System.out.println("Conteúdos concluidos " + devRafael.getNome() + ":  " + devRafael.getConteudosConcluidos());
            System.out.println("===");
            System.out.println("Conteúdos inscritos NOVAMENTE " + devRafael.getNome() + ":  " + devRafael.getConteudosInscritos());
            System.out.println("===");
            System.out.println("XP total " + devRafael.getNome() + ":" + devRafael.calcularTotalXp());
            System.out.println("====");
            quantidadeConteudos--;
        }
        Dev devJulia = new Dev("Júlia");
        devJulia.inscreverBootCamp(bootCamp1);
        System.out.println("Conteúdos inscritos " + devJulia.getNome() + ":  " + devJulia.getConteudosInscritos());

        int quantidadeConteudos2 = devJulia.getConteudosInscritos().size();
        while (quantidadeConteudos2 > 0) {
            System.out.println("====");
            devJulia.progredir();
            System.out.println("Conteúdos Concluidos " + devJulia.getNome() + ":  " + devJulia.getConteudosConcluidos());
            System.out.println("====");
            System.out.println("Conteúdos inscritos NOVAMENTE " + devJulia.getNome() + ":  " + devJulia.getConteudosInscritos());
            System.out.println("====");
            System.out.println("XP total " + devJulia.getNome() + ":  " + devJulia.calcularTotalXp());
            quantidadeConteudos2--;
        }
    }
}