import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Curso curso1 = new Curso();
        Curso curso2 = new Curso();
        Mentoria mentoria = new Mentoria();

        curso1.setTitulo("curso Java");
        curso1.setDescricao("descricao curso Java");
        curso1.setCargaHoraria(8);

        curso2.setTitulo("curso JS");
        curso2.setDescricao("descricao curso js");
        curso2.setCargaHoraria(4);

        mentoria.setTitulo("Mentoria Java");
        mentoria.setDescricao("descricao Java");
        mentoria.setData(LocalDate.now());

//        System.out.println(curso1);
//        System.out.println(curso2);
//        System.out.println(mentoria);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descricao Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devWilli = new Dev();
        devWilli.setNome("Willi");
        devWilli.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos incluidos Willi: " + devWilli.getConteudosInscritos());
        devWilli.progredir();
        System.out.println("-");
        System.out.println("Conteúdos incluidos Willi: " + devWilli.getConteudosInscritos());
        System.out.println("Conteúdos concluídos Willi: " + devWilli.getConteudosConcluidos());
        System.out.println("XP: " + devWilli.calcularTotalXp());

        System.out.println("-----------------------");

        Dev devCamila = new Dev();
        devCamila.setNome("Prof. Camila");
        devCamila.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos incluidos Camila: " + devCamila.getConteudosInscritos());
        devCamila.progredir();
        devCamila.progredir();
        devCamila.progredir();
        System.out.println("-");
        System.out.println("Conteúdos incluidos Camila: " + devCamila.getConteudosInscritos());
        System.out.println("Conteúdos concluídos Camila: " + devCamila.getConteudosConcluidos());
        System.out.println("XP: " + devCamila.calcularTotalXp());
    }

}
