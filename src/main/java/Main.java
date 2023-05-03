import br.com.dio.java.dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descrição de curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso JS");
        curso2.setDescricao("Descrição de curso JS");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria Java");
        mentoria.setDescricao("Descrição mentoria java");
        mentoria.setData(LocalDate.now());

        Conteudo conteudo = new Curso();

//        System.out.println(curso1);
//        System.out.println(curso2);
//        System.out.println(mentoria);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcampo Java Developer");
        bootcamp.setDescricao("Curso de Java");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);

        Dev camila = new Dev();
        camila.setNome("Camila");
        camila.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos" + camila.getConteudosIncritos());

        camila.progredir();
        camila.progredir();

        System.out.println("Conteudos Inscritos" + camila.getConteudosIncritos());
        System.out.println("Conteudos Concluidos" + camila.getConteudosConcluidos());
        System.out.println("XP:" + camila.calcularXp());

        System.out.println("------------");

        Dev joao = new Dev();
        joao.setNome("João");
        joao.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos" + joao.getConteudosIncritos());

        joao.progredir();

        System.out.println("Conteudos Inscritos" + joao.getConteudosIncritos());
        System.out.println("Conteudos Concluidos" + joao.getConteudosConcluidos());
        System.out.println("XP:" + joao.calcularXp());

    }
}
