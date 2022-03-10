import br.com.dio.desafio.dominio.Curso;
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

        System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);
    }

}
